package main;

import java.sql.*;
import java.util.Scanner;

public class RefundTicket {

    String DB_URL = "jdbc:mysql://localhost:3306/airlinereservationsystem";
    String DB_USER = "root";
    String DB_PASSWORD = ""; 

    public static String refund(int PassengerID) {
        StringBuilder details = new StringBuilder();
        try {
            Scanner scanner = new Scanner(System.in);
            details.append("Choose a scenario for refund: \n");
            details.append("1. Cancellation within 24 hours of Purchase\n");
            details.append("2. Change in Travel Plans\n");
            details.append("3. Emergency Situation\n");
            details.append("4. Flight Cancellation by the Airline\n");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    details.setLength(0);
                    details.append("You are eligible for a full refund as you are cancelling within 24 hours of purchase.\n");
                    return details.toString();
                case 2:
                    details.setLength(0);
                    double totalAmount = 1000.0;
                    double refundAmount = 0.25 * totalAmount;
                    details.append("You are eligible for a refund of $").append(refundAmount).append(" due to a change in travel plans.\n");
                    return details.toString();
                case 3:
                    details.setLength(0);
                    scanner.nextLine();
                    details.append("Please provide evidence of the emergency situation (e.g., medical situation, family crises).\n");
                    String evidence = scanner.nextLine();
                    details.append("Your refund request will be processed after verification.\n");
                    return details.toString();
                case 4:
                    details.setLength(0);
                    details.append("You are entitled to a full refund as the airline has cancelled the flight.\n");
                    details.append("You may also be given the option to reschedule or book an alternative flight.\n");
                    return details.toString();
                default:
                    details.setLength(0);
                    details.append("Invalid choice!\n");
                    return details.toString();
            }
        } catch (Exception e) {
            details.setLength(0);
            details.append("Database connection error: ").append(e.getMessage()).append("\n");
            e.printStackTrace();
            return details.toString();
        }
    }
}
