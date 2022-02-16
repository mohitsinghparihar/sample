package Authentication;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class BasicAuthorization {
	@Test
	public static void BearerToken()
	{
		RestAssured.baseURI="https://gorest.co.in/";
	   Response res=RestAssured.given().header("content-type","application/json").header("Authorization","Bearer a55d89becb1a46110c5db3141b76bfac7b5c83b50cf43a4dc9c990285dbaad98")
	    .body("{\"name\":\"Tenali Ramakrishna\", \"gender\":\"male\", \"email\":\"tenali.ramakrishna@155.com\", \"status\":\"active\"}")
	    . when().post("public/v1/users");
	   
	   res.prettyPeek();
	   
	}

}
