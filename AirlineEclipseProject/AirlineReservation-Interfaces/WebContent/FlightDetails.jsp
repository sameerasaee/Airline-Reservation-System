<%@ page import="java.util.*" %>
<%@ page import="java.text.*" %>
<%@ page import="main.*" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Booking Details</title>
</head>
<body>

<form action="FetchDetails.jsp" method="get">
    Enter Passenger ID: <input type="text" name="passengerID">
    <input type="submit" value="Submit">
</form>

<%
int passengerID = 0; // Default value or any appropriate default
String passengerIDParam = request.getParameter("passengerID");

if (passengerIDParam != null && !passengerIDParam.isEmpty()) {
    passengerID = Integer.parseInt(passengerIDParam);
}

// Instantiate the fetchbookingdetails class
FetchbookingdetailsProxy bookingDetailsFetcher = new FetchbookingdetailsProxy();

// Call the booking method to get booking details
String bookingDetails = bookingDetailsFetcher.booking(passengerID);

// Display the booking details
out.println("<h2>Booking Details for Passenger ID: " + passengerID + "</h2>");
out.println("<pre>");
out.println(bookingDetails);
out.println("</pre>");

// You can add more HTML/CSS for styling if needed
%>

</body>
</html>
