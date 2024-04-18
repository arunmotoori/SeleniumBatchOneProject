package doubts.apiautomationdemo;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class SampleDemo {

	public static void main(String[] args) {
		
		baseURI = "https://reqres.in/";
		
		Response resonse = get("/api/users?page=2");
		
		int statusCode = resonse.getStatusCode();
		System.out.println(statusCode);
		
		

	}

}
