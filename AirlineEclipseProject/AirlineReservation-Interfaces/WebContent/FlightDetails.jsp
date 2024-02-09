<%@ page import="java.util.*" %>
<%@ page import="java.text.*" %>
<%@ page import="main.*" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Booking Details</title>
</head>
<body>

<form action="FlightDetails.jsp" method="get">
    Enter Passenger ID: <input type="text" name="passengerID">
    <input type="submit" value="Submit">
</form>

<%
int passengerID = 0; 
String passengerIDParam = request.getParameter("passengerID");

if (passengerIDParam != null && !passengerIDParam.isEmpty()) {
    passengerID = Integer.parseInt(passengerIDParam);
}

FetchbookingdetailsProxy bookingDetailsFetcher = new FetchbookingdetailsProxy();

String bookingDetails = bookingDetailsFetcher.booking(passengerID);


out.println("<h2>Booking Details for Passenger ID: " + passengerID + "</h2>");
out.println("<pre>");
out.println(bookingDetails);
out.println("</pre>");

%>

</body>
</html>
