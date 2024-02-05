<%@ page import="main.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Booking Details</title>
    <style>
        body { font-family: Arial, sans-serif; }
        .container { max-width: 600px; margin: auto; }
    </style>
</head>
<body>
    <div class="container">
        <h2>Retrieve Booking Details</h2>
         
        <form action="bookedDetails.jsp" method="post">
            <label for="passengerID">Enter Passenger ID:</label>
            <input type="number" id="passengerID" name="passengerID" required><br><br>
            
            <input type="submit" value="Retrieve Details">
        </form>

        <%
        // Handle the form submission
        if (request.getMethod().equalsIgnoreCase("post")) {
            int passengerID = Integer.parseInt(request.getParameter("passengerID"));
            
            // Create an instance of the BookingdetailsProxy class
            BookingdetailsProxy bd = new BookingdetailsProxy();
            
            // Call the bookingDetails method to get the details
            String details = bd.bookingDetails(passengerID);
            
            // Check if details are not empty
            if (!details.isEmpty()) {
                // Parse the details (assuming details is a well-formatted string)
                String[] detailArray = details.split("\n");
                
                // Display the extracted details
                out.println("<h3>Booking Details</h3>");
                out.println("<p><strong>Passenger Name:</strong> " + detailArray[1].replace("Passenger Name: ", "") + "</p>");
                out.println("<p><strong>Seat Number:</strong> " + detailArray[2].replace("Seat Number: ", "") + "</p>");
                out.println("<p><strong>Departure Location:</strong> " + detailArray[3].replace("Departure Location: ", "") + "</p>");
                out.println("<p><strong>Arrival Location:</strong> " + detailArray[4].replace("Arrival Location: ", "") + "</p>");
            } else {
                out.println("<p>No booking details found for Passenger ID: " + passengerID + "</p>");
            }
        }
        %>
    </div>
</body>
</html>
