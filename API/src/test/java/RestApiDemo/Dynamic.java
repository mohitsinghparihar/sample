package RestApiDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Dynamic {
	
	//@Test(dataProvider="excelData")
	public static void DataDynamic(String isbn,String aisle)
	{
		
		RestAssured.baseURI="http://216.10.245.166";
		Response res= RestAssured.given().header("content-type","application/json").body("{\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\"name\":\"Learn Rest Assured Automation with Java\",\r\n" + 
				"\r\n" + 
				"\"isbn\":\""+isbn+"\",\r\n" + 
				"\r\n" + 
				"\"aisle\":\""+aisle+"\",\r\n" + 
				"\r\n" + 
				"\"author\":\"John foe\"\r\n" + 
				"\r\n" + 
				"}").when().post("Library/Addbook.php");
		
		res.prettyPeek();
		
	}
	
	
    @DataProvider
	public Object[][] excelData() throws IOException
	{
		File f= new File("./ExcelData/Book1.xlsx");
	    FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook xssf = new XSSFWorkbook(fis);
		XSSFSheet sheet=xssf.getSheet("Sheet1");
		DataFormatter format= new DataFormatter();
		
		int rowCount=sheet.getLastRowNum();
		Object BookData[][]= new Object[rowCount][sheet.getRow(0).getLastCellNum()];
		
		for(int i=0;i<rowCount;i++)
		{
			
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
			{
			  
			  BookData[i][j]=format.formatCellValue(sheet.getRow(i+1).getCell(j)); 
			   
			}
		}
		
		return BookData;
		
		
	}
	
	public Object[][] Data() {
		
		return new Object[][] {{"Book1","10"},{"Book2","11"},{"Book3","12"}};
	}
	
	
	

}
