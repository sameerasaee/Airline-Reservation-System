package main;
import java.sql.*;

public class DisplayFlight {
	public String viewFlights() {
		StringBuilder flightDetails = new StringBuilder("Available Flights:\n");
		try {
	 Class.forName("com.mysql.jdbc.Driver");
     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinereservationsystem", "root", "");
      Statement stmt = con.createStatement();

	 ResultSet flightsResultSet = stmt.executeQuery("SELECT * FROM flights");
  

  while (flightsResultSet.next()) {
      flightDetails.append("FlightID: ").append(flightsResultSet.getInt("FlightID"))
              .append(" DepartureLocation: ").append(flightsResultSet.getString("DepartureLocation"))
              .append(" ArrivalLocation: ").append(flightsResultSet.getString("ArrivalLocation"))
              .append(" DepartureDate: ").append(flightsResultSet.getTimestamp("DepartureDate"))
              .append(" ClassOfService: ").append(flightsResultSet.getString("ClassOfService"))
              .append(" Price: ").append(flightsResultSet.getBigDecimal("Price"))
              .append("\n");
  }
		}catch(Exception e) {
			e.printStackTrace();
		}
return flightDetails.toString();
}
}
