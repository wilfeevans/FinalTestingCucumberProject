package StepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import Base.Base;
import TestCases.NewBooking;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class NewMasterBooking extends Base
{
	@Given("The user is provided with the BaseURI")
	public void the_user_is_provided_with_the_base_uri() throws IOException 
	{
	      RestAssured.baseURI= setUp().getProperty("Base_URI");
	}

	@Given("The user is provided with the BasePath")
	public void the_user_is_provided_with_the_base_path() throws IOException 
	{
	       RestAssured.basePath = setUp().getProperty("Base_Path");
		
	}

	@When("The user is entered with the following details")
	public void the_user_is_entered_with_the_following_details(DataTable datatable) 
	{
	   List<Map<String,String>> value= datatable.asMaps();
	   for(int i=0; i<value.size(); i++)
	   {
		   String firstname= value.get(i).get("firstname");
		   String lastname= value.get(i).get("lastname");
		   String totalprice = value.get(i).get("totalprice");
		   String depositpaid = value.get(i).get("depositpaid");
		   String checkin= value.get(i).get("checkin");
		   String checkout = value.get(i).get("checkout");
		   String additionalneeds = value.get(i).get("additionalneeds");
		   
		   NewBooking newbooking= new NewBooking();
		   newbooking.newBooking(firstname, lastname, totalprice, depositpaid, checkin, checkout, additionalneeds);
		   
		   
		   
	   }
	
	}

	@Then("The user should be able to create a request successfully with status code {int}")
	public void the_user_should_be_able_to_create_a_request_successfully_with_status_code(Integer int1) 
	{
	
	
	}

	
	
	
	
	
	

}
