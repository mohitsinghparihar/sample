package RestApiDemo;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;



public class PostRequest {
	
	public static void Post()
	{
		RestAssured.baseURI="https://reqres.in";
	
		given().header("content-type","application/json").body("{\r\n" + 
				"    \"email\": \"eve.holt@reqres.in\",\r\n" + 
				"    \"password\": \"cityslicka\"\r\n" + 
				"}").when().post("api/login").then().log().all().assertThat().statusCode(200);
		
	}

}
