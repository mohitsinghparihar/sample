package RestApiDemo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class DeleteRequest {

	public static void Delete()
	{
		RestAssured.baseURI="https://reqres.in";
		Response res= given().header("content-type","application/json").when().delete("api/users/2");
		res.prettyPeek();
		
	}
}
