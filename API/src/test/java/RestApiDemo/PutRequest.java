package RestApiDemo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class PutRequest {
	
	public static void Put()
	{
		RestAssured.baseURI="https://reqres.in";
		Response res=given().header("content-type","application/json").body("{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"zion\"\r\n" + 
				"}").when().put("api/users/2");
		res.prettyPeek();
	}

}
