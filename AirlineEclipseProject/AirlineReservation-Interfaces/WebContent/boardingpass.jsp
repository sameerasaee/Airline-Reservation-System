<%@ page import="main.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
        <form action="boardingpass.jsp" method="post">
            <label for="passengerID">Enter Passenger ID:</label>
            <input type="text" id="passengerID" name="passengerID" required><br><br>
            <input type="submit" value="Retrieve Details">
        </form>

        <%
        if ("POST".equalsIgnoreCase(request.getMethod())) {
            String passengerIDString = request.getParameter("passengerID");

            if (passengerIDString != null && !passengerIDString.isEmpty() && passengerIDString.matches("\\d+")) {
                int passengerID = Integer.parseInt(passengerIDString);

                BoardingpassdetailsProxy bpDetails = new BoardingpassdetailsProxy();
                String details = bpDetails.bookingDetails(passengerID);

                out.println("<div>");
                out.println("<h3>BoardingPass</h3>");
                out.println("<pre><strong>" + details + "</strong></pre>");
                out.println("</div>");
            } else {
                out.println("<p>Please enter a valid Passenger ID.</p>");
            }
        }
        %>
    </div>
</body>
</html>
