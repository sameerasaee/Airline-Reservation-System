package PassengerRegistration;
import java.sql.*;
public class FlightDetails {
	int fID;
	StringBuilder confirmDetails = new StringBuilder("Selected Flight Details:\n");
	public String bookFlight(int flightId) {
		
		 
	try {
		 Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinereservationsystem", "root", "");
         Statement stmt = con.createStatement();
         // Get selected flight details
         ResultSet selectedFlightResultSet = stmt.executeQuery("SELECT * FROM flights WHERE FlightID = " + flightId);
        
     	
         if (selectedFlightResultSet.next()) {
             confirmDetails.append("FlightID: ").append(selectedFlightResultSet.getInt("FlightID"))
                     .append(" DepartureLocation: ").append(selectedFlightResultSet.getString("DepartureLocation"))
                     .append(" ArrivalLocation: ").append(selectedFlightResultSet.getString("ArrivalLocation"))
                     .append(" DepartureDate: ").append(selectedFlightResultSet.getTimestamp("DepartureDate"))
                     .append(" ClassOfService: ").append(selectedFlightResultSet.getString("ClassOfService"))
                     .append(" Price: ").append(selectedFlightResultSet.getDouble("Price"))
                     .append("\n");
             fID=flightId;
} else {
    confirmDetails.append("No flight found with FlightID: ").append(flightId).append("\n");
    
}         
     
         
	}catch (Exception e) {
 e.printStackTrace();
}
	return confirmDetails.toString();
	
	}
	}
	


