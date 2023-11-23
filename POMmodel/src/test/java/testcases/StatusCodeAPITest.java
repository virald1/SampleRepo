package testcases;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class StatusCodeAPITest {

	public static void main(String[] args) {
		
		///  StatusCode - 200
		Response res= given().log().all()
				.when().get("http://the-internet.herokuapp.com/status_codes/200")
				.then().assertThat().statusCode(200).extract().response();
				
		System.out.println("Received statusCode: "+res.getStatusCode());
		
		
		///  StatusCode - 404
		Response res1= given().log().all()
				.when().get("http://the-internet.herokuapp.com/status_codes/404")
				.then().assertThat().statusCode(404).extract().response();
				
		System.out.println("Received statusCode: "+res1.getStatusCode());
		
		
		///  StatusCode - 500
		Response res2= given().log().all()
				.when().get("http://the-internet.herokuapp.com/status_codes/500")
				.then().assertThat().statusCode(500).extract().response();
				
		System.out.println("Received statusCode: "+res2.getStatusCode());
				 
	}

}
