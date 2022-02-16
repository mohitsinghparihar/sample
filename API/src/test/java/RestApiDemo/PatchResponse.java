package RestApiDemo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
public class PatchResponse {
	public static void Patch()
	{
		RestAssured.baseURI="https://reqres.in";
		Response res = given().header("content-type","application/json").body("{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"zion resident\"\r\n" + 
				"}").when().patch("api/users/2");
		res.prettyPeek();
	}

}
