package first;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	static WebDriver driver;
	static File file=new File("./Resources/config.properties");
	static FileInputStream fis=null;
	static Properties prop= new Properties();
	
	static 
	{
		try {
			fis=new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
    public static void Initilaize()
	{
	     System.setProperty(prop.getProperty("chromeDriverProperty"),prop.getProperty("chromeDriverPath"));
	     driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	}
    public static void OpenUrl()
	{
		  driver.get(prop.getProperty("URL"));
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
		  
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Initilaize();
		OpenUrl();
		

	}

}
