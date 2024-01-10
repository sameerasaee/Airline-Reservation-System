package main;

import java.sql.*;

public class BoardingPass {

    public int verifyPassengerIdentity(String passportNumber) {
    	String DB_URL = "jdbc:mysql://localhost:3306/airlinereservationsystem";
      	String DB_USER = "root";
      	String DB_PASSWORD = ""; 
    	
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
    

}