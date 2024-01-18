package PassengerRegistration;
import java.sql.*;

public class RefundTicket {

    public static String processRefund(int passengerId, int choice) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinereservationsystem", "root", "");
            switch (choice) {
                case 1:
                    return "Passenger ID " + passengerId + ": You are eligible for a full refund as you are cancelling within 24 hours of purchase.";
                case 2:
                    double refundAmount = calculateRefundAmount(con, passengerId);
                    return "Passenger ID " + passengerId + ": You are eligible for a refund of " + refundAmount + " due to a change in travel plans.";
                case 3:
                    return "Passenger ID " + passengerId + ": Your refund request will be processed after verification.";
                case 4:
                    return "Passenger ID " + passengerId + ": You are entitled to a full refund as the airline has cancelled the flight. You may also be given the option to reschedule or book an alternative flight.";
                default:
                    return "Passenger ID " + passengerId + ": Invalid choice!";
            }
        } catch (SQLException | ClassNotFoundException e) {
            return "Passenger ID " + passengerId + ": Database connection error: " + e.getMessage();
        }
    }

    private static double calculateRefundAmount(Connection connection, int passengerId) throws SQLException {
        String priceQuery = "SELECT f.Price FROM flights f INNER JOIN booking b ON f.FlightID = b.FlightID WHERE b.PassengerID = ?";
        try (PreparedStatement priceStatement = connection.prepareStatement(priceQuery)) {
            priceStatement.setInt(1, passengerId);
            ResultSet priceResultSet = priceStatement.executeQuery();

            if (priceResultSet.next()) {
                double totalPrice = priceResultSet.getDouble("Price");
                return 0.25 * totalPrice;
            } else {
                return 0; 
            }
        }
    }
}
