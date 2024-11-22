package Model;

import GetterSetter.Booking;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreateBooking
{

	public void createBooking(Booking booking)
	{
		RestAssured
		.given()
		.log()
		.all()
		.contentType(ContentType.JSON)
		
		
		.when()
		.body(booking)
		.post()
		
		.then()
		.log()
		.all()
		.statusCode(200);
	}
}
