package main;
import java.sql.*;
public class Boardingpassdetails {

    public String bookingDetails(int passengerID){
        StringBuilder details = new StringBuilder();

        String DB_URL = "jdbc:mysql://localhost:3306/airlinereservationsystem";
        String DB_USER = "root";
        String DB_PASSWORD = ""; 

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            String query = "SELECT b.*, f.DepartureLocation, f.ArrivalLocation, f.DepartureDate, p.PassengerName, bp.seatnumber " +
                    "FROM booking b " +
                    "JOIN flights f ON b.FlightID = f.FlightID " +
                    "JOIN passengers p ON b.PassengerID = p.PassengerID " +
                    "LEFT JOIN boardingpass bp ON b.FlightID = bp.FlightID AND b.PassengerID = bp.PassengerID " + 
                    "WHERE b.PassengerID = ?";

            
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, passengerID);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String status = rs.getString("Status");

                if (!"canceled".equalsIgnoreCase(status) && !"pending".equalsIgnoreCase(status)) {
                    details.append("Boarding Pass Details:\n");
                    details.append("Passenger Name: ").append(rs.getString("PassengerName")).append("\n");
                    details.append("Passenger ID: ").append(rs.getInt("PassengerID")).append("\n");
                   details.append("Seat Number: ").append(rs.getString("SeatNumber")).append("\n");
                    details.append("Departure Location: ").append(rs.getString("DepartureLocation")).append("\n");
                    details.append("Arrival Location: ").append(rs.getString("ArrivalLocation")).append("\n");
                    details.append("Departure Date: ").append(rs.getString("DepartureDate")).append("\n");
                   
                } else {
                    details.append("Booking is ").append(status).append(". Boarding pass cannot be generated.\n");
                }
            } else {
                details.append("No booking details found for PassengerID: ").append(passengerID).append("\n");
            }

            con.close();

        }catch (Exception e) {
            e.printStackTrace();
            details.append("Error occurred while fetching booking details: ").append(e.getMessage()).append("\n");
        }


        return details.toString();
    }
}