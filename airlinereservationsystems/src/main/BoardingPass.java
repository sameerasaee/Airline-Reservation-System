package main;

import java.sql.*;

public class BoardingPass {

//    private static final String DB_URL = "jdbc:mysql://localhost:3306/airlinereservationsystem";
//    private static final String DB_USER = "root";
//    private static final String DB_PASSWORD = ""; // Add your password here

//    public static void main(String[] args) {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
//                 Scanner scanner = new Scanner(System.in)) {
//
//                System.out.print("Enter your PassportNumber for identity verification: ");
//                String passportNumber = scanner.nextLine();
//
//                int passengerID = verifyPassengerIdentity(con, passportNumber);
//
//                if (passengerID != -1) {
//                    fetchBookingDetails(con, passengerID);
//                }
//
//            } // Resources are automatically closed due to try-with-resources
//        } catch (ClassNotFoundException | SQLException e) {
//            System.out.println("Exception occurred: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }

    public int verifyPassengerIdentity(String passportNumber) {
    	String DB_URL = "jdbc:mysql://localhost:3306/airlinereservationsystem";
      	String DB_USER = "root";
      	String DB_PASSWORD = ""; // Add your password here
    	
      	try {
			Class.forName("com.mysql.jdbc.Driver");
      	
			Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			
			String query = "SELECT PassengerID FROM passengers WHERE PassportNumber = ?";
	      	
	        PreparedStatement pstmt = con.prepareStatement(query);
	        
	        pstmt.setString(1, passportNumber);
	        
	        ResultSet rs = pstmt.executeQuery();
	                
	        if (rs.next()) {
                return rs.getInt("PassengerID");
            } else {
                System.out.println("No passenger found with PassportNumber: " + passportNumber);
                return -1;
            }
		} catch (Exception e) {
			e.printStackTrace();
		}
      	
      	return -1;
    }
    
//    public static FlightDetails fetchFlightDetails(int flightID) throws SQLException {
//    	String DB_URL = "jdbc:mysql://localhost:3306/airlinereservationsystem";
//      	String DB_USER = "root";
//      	String DB_PASSWORD = ""; // Add your password here
//    	
//      	try {
//			Class.forName("com.mysql.jdbc.Driver");
//      	
//			Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
//    	
//			String query = "SELECT DepartureLocation, ArrivalLocation, DepartureDate FROM flights WHERE FlightID = ?";
//			
//			PreparedStatement pstmt = con.prepareStatement(query);
//            
//			pstmt.setInt(1, flightID);
//			
//            ResultSet rs = pstmt.executeQuery();
//            
//            if (rs.next()) {
//                return new FlightDetails(
//                        rs.getString("DepartureLocation"),
//                        rs.getString("ArrivalLocation"),
//                        rs.getString("DepartureDate")
//                );
//            }
//      	} catch (Exception e) {
//			e.printStackTrace();
//		}
//      	
//        return null;
//    }

//    public void bookingDetails(int passengerID) throws SQLException {
//    	String DB_URL = "jdbc:mysql://localhost:3306/airlinereservationsystem";
//      	String DB_USER = "root";
//      	String DB_PASSWORD = ""; // Add your password here
//    	
//      	try {
//			Class.forName("com.mysql.jdbc.Driver");
//      	
//			Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
//    	
//	    	String query = "SELECT b.*, f.DepartureLocation, f.ArrivalLocation, f.DepartureDate, p.PassengerName, p.SeatNumber " +
//	                       "FROM booking b " +
//	                       "JOIN flights f ON b.FlightID = f.FlightID " +
//	                       "JOIN passengers p ON b.PassengerID = p.PassengerID " +
//	                       "WHERE b.PassengerID = ?";
//        
//	    	PreparedStatement pstmt = con.prepareStatement(query);
//            
//            pstmt.setInt(1, passengerID);
//
//            ResultSet rs = pstmt.executeQuery();
//            
//            if (rs.next()) {
//                String status = rs.getString("Status");
//                
//                // Display boarding pass only if status is not "canceled" or "pending"
//                if (!"canceled".equalsIgnoreCase(status) && !"pending".equalsIgnoreCase(status)) {
//                    System.out.println("Boarding Pass Details:");
//                    System.out.println("Passenger Name: " + rs.getString("PassengerName"));
//                    System.out.println("Passenger ID: " + rs.getInt("PassengerID"));
//                    System.out.println("Seat Number: " + rs.getString("SeatNumber"));
//                    System.out.println("Departure Location: " + rs.getString("DepartureLocation"));
//                    System.out.println("Arrival Location: " + rs.getString("ArrivalLocation"));
//                    
//                    // Additional details if required
//                    System.out.println("Departure Date: " + rs.getString("DepartureDate"));
//                } else {
//                    System.out.println("Booking is " + status + ". Boarding pass cannot be generated.");
//                }
//            } else {
//                System.out.println("No booking details found for PassengerID: " + passengerID);
//            }
//      	} catch (Exception e) {
//			e.printStackTrace();
//		}
//    }
}