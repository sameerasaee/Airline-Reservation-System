package main;
import java.sql.*;

public class fetchbookingdetails {

    public String booking(int passengerID) {
        String DB_URL = "jdbc:mysql://localhost:3306/airlinereservationsystem";
        String DB_USER = "root";
        String DB_PASSWORD = ""; // Add your password here

        StringBuilder details = new StringBuilder();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            String query = "SELECT * FROM booking WHERE PassengerID = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, passengerID);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                int flightID = rs.getInt("FlightID");
                String bookingDate = rs.getString("BookingDate");
                String status = rs.getString("Status");

                details.append("FlightID: ").append(flightID).append("\n");
                details.append("Booking Date: ").append(bookingDate).append("\n");
                details.append("Status from Database: ").append(status).append("\n");

                FlightDetails flightDetails = fetchFlightDetails(flightID);
                
//                details.append("Flight Details: Departure from ")
//                       .append(flightDetails.departureLocation)
//                       .append(" to ")
//                       .append(flightDetails.arrivalLocation)
//                       .append(" on ")
//                       .append(flightDetails.departureDate)
//                       .append("\n");
//
//                details.append("Booking Date: ").append(bookingDate).append("\n");
//                details.append("Status Displayed: ").append(status).append("\n");
            } else {
                details.append("No booking details found for PassengerID: ").append(passengerID).append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
            details.append("Error occurred while fetching booking details.").append("\n");
        }
        
        return details.toString();
    }

    public static FlightDetails fetchFlightDetails(int flightID) {
               return null;
    }
}
