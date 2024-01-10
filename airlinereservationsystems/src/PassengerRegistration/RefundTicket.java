package PassengerRegistration;
import java.sql.*;
import java.util.Scanner;

public class RefundTicket {

    public static String processRefund(int userId, int choice) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinereservationsystem", "root", "");
            switch (choice) {
                case 1:
                    return "User ID " + userId + ": You are eligible for a full refund as you are cancelling within 24 hours of purchase.";
                case 2:
                    double totalAmount = 1000.0; // Assuming the total amount is $1000 (You can modify this as needed)
                    double refundAmount = 0.25 * totalAmount;
                    return "User ID " + userId + ": You are eligible for a refund of $" + refundAmount + " due to a change in travel plans.";
                case 3:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("User ID " + userId + ": Please provide evidence of the emergency situation (e.g., medical situation, family crises).");
                    String evidence = scanner.nextLine();
                    insertEvidenceIntoDatabase(con, evidence);
                    return "User ID " + userId + ": Your refund request will be processed after verification.";
                case 4:
                    return "User ID " + userId + ": You are entitled to a full refund as the airline has cancelled the flight. You may also be given the option to reschedule or book an alternative flight.";
                default:
                    return "User ID " + userId + ": Invalid choice!";
            }
        } catch (SQLException | ClassNotFoundException e) {
            return "User ID " + userId + ": Database connection error: " + e.getMessage();
        }
    }

    private static void insertEvidenceIntoDatabase(Connection connection, String evidence) throws SQLException {
        String sql = "INSERT INTO evidence_table (evidence_details) VALUES (?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, evidence);
            preparedStatement.executeUpdate();
        }
    }
}
