package org.api;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestassuredApi1 {

	private static String BASE_URL = "https://jsonplaceholder.typicode.com";

	@BeforeClass
	public void setup() {
		RestAssured.baseURI = BASE_URL;
	}

	@Test(priority = 1)
	public void verifyGetPostById() {

		Response response = given().when().get("/posts/1");

		System.out.println("Status Code: " + response.getStatusCode());
		System.out.println("Status Line: " + response.getStatusLine());

		response.then().statusCode(200).body("id", equalTo(1)).body("userId", equalTo(1));
	}

	@Test(priority = 2)
	public void verifyCreatePost() {

		String requestBody = """
				{
				    "title": "QA Testing",
				    "body": "Rest Assured with TestNG",
				    "userId": 1
				}
				""";

		Response response = given().header("Content-Type", "application/json").body(requestBody).when().post("/posts");

		System.out.println("Status Code : " + response.getStatusCode());
		System.out.println("Status Line : " + response.getStatusLine());

		response.then().statusCode(201).body("title", equalTo("QA Testing")).body("userId", equalTo(1));
	}

	@Test(priority = 3)
	public void verifyInvalidEndpoint() {

		Response response = given().when().get("/invalidendpoint");

		System.out.println("Status Code : " + response.getStatusCode());
		System.out.println("Status Line : " + response.getStatusLine());

		response.then().statusCode(404);
	}
}