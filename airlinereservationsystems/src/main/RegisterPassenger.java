package main;
import java.sql.*;
public class RegisterPassenger {
	public int passengerID = 0;
	
    public int addDetails(String name, int contactNumber, String passportNumber) {
    	
//    	FlightDetails flgobj=new FlightDetails();
//    	PaymentDetails pobj=new PaymentDetails();
//    	DisplayFlight dobj= new DisplayFlight();
    	
        try {
            Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinereservationsystem", "root", "");
            String insertPassengerQuery = "INSERT INTO passengers (PassengerName, ContactNumber, PassportNumber) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(insertPassengerQuery, Statement.RETURN_GENERATED_KEYS);
                preparedStatement.setString(1, name);
                preparedStatement.setInt(2, contactNumber);
                preparedStatement.setString(3, passportNumber);
                preparedStatement.executeUpdate();

//                // Get the auto-generated PassengerID
                ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                return generatedKeys.next() ? generatedKeys.getInt(1) : -1;
//                dobj.viewFlights();
//                flgobj.bookFlight(flgobj.fID);
//                pobj.paymentConfim(pobj.ptype);
        }catch (Exception e) {
                e.printStackTrace();
            }
        return -1;
    }
}