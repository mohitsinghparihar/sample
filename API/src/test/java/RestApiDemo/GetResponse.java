package RestApiDemo;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetResponse {
	@Test
	public static void Get()
	{
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification httprequest=given().header("content-type","application/json");
		Response res=httprequest.when().get("api/users?page=2");
		res.prettyPeek();
	}

}
