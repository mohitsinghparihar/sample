package RestApiDemo;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;


public class MockTest {
	
	@Test
	public void testPayload()
	{
		int sum=0;
		String response= MockPayload.Mock();
		JsonPath js= new JsonPath(response);
		
		System.out.println(js.getInt("dashboard.purchaseAmount"));
	    int totalCourses= js.getInt("courses.size()");
	    System.out.println("Courses size is"+totalCourses);
	    
	    System.out.println("Title of First Course:"+js.getString("courses[0].title"));
	    
	    for(int i=0;i<totalCourses;i++)
	    {
	   
	       String course=js.getString("courses["+i+"].title");
	       int price=js.getInt("courses["+i+"].price");
	       System.out.println("Title of Course "+(i+1)+"is: "+course+" And Their Price Is: "+price);
	    }
	    int copies =js.getInt("courses[2].copies");
	    System.out.println("Number of Copies Sold By: "+js.getString("courses[2].title")+" is "+copies);
	    for(int i=0;i<totalCourses;i++)
	    {
	    	sum=sum+(js.getInt("courses["+i+"].copies")*js.getInt("courses["+i+"].price"));
	    }
	    
	    int totalAmount= js.getInt("dashboard.purchaseAmount");
	    
	    if(totalAmount==sum)
	    {
	    	System.out.println(true);
	    }
	    else
	    {
	    	System.out.println(false);
	    }
	    
	}
}
