package main;
import java.sql.*;
public class AirlineReservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinereservationsystem","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from passengers");

			while(rs.next())
			{
			System.out.println("PassengerID: " + rs.getInt(1) + " PassengerName: " + rs.getString(2) + " ContactNumber: "
			+ rs.getString(3)+ " PassportNumber: " + rs.getString(4));
			}
			con.close();
			} catch(Exception e)
			{
			System.out.println(e);
			}
	}

}
