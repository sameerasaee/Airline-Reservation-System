package main;
import java.sql.*;

public class PaymentDetails {
	int bookingID;
	String ptype;
	public String paymentConfim(String ptype) {
		this.ptype = ptype;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =
		DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinereservationsystem","root","");
		RegisterPassenger registerobj=new RegisterPassenger();
		Flightd flightobj=new Flightd();
		// Insert booking details into the database
		String insertBookingQuery = "INSERT INTO booking (PassengerID, FlightID, PaymentDetails, Status, BookingDate) VALUES (?, ?, ?, 'Pending', CURRENT_TIMESTAMP)";
		PreparedStatement bookingStatement = con.prepareStatement(insertBookingQuery, Statement.RETURN_GENERATED_KEYS);
        
		bookingStatement.setInt(1, registerobj.passengerID);
        bookingStatement.setInt(2, flightobj.fID);
        bookingStatement.setString(3, ptype);
        bookingStatement.executeUpdate();

       
       
        ResultSet bookingGeneratedKeys = bookingStatement.getGeneratedKeys();
        bookingID = bookingGeneratedKeys.next() ? bookingGeneratedKeys.getInt(1) : -1;

       
		}catch (Exception e) {
		    e.printStackTrace();
		}
		return "Booking Placed! Thank you for choosing our airline."+ "Booking Information:"+"BookingID: " + bookingID + " PaymentDetails: " + ptype + " Status: Pending";
	}
}

