package TestCases;

import GetterSetter.Booking;
import GetterSetter.BookingDates;
import Model.CreateBooking;

public class NewBooking 
{
	public void newBooking(String firstname, String lastname, String totalprice, String depositpaid, String checkin, String checkout, String additionalneeds)
	{
		Booking booking= new Booking();
		booking.setFirstname(firstname);
		booking.setLastname(lastname);
		booking.setTotalprice(Integer.parseInt(totalprice));
		booking.setDepositpaid(Boolean.parseBoolean(depositpaid));
		
		BookingDates bookingdates= new BookingDates();
		bookingdates.setCheckin(checkin);
		bookingdates.setCheckout(checkout);
		
		booking.setBookingdates(bookingdates);
		booking.setAdditionalneeds(additionalneeds);
		
		CreateBooking  createbooking= new CreateBooking();
		createbooking.createBooking(booking);
		
	}

}
