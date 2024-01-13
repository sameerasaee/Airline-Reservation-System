<%@page import="PassengerRegistration.DisplayFlightProxy"%>
<%@ page import="PassengerRegistration.DisplayFlight" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Airline Reservation System</title>
</head>
<h1>Flight Details</h1>
<body>
<%
   DisplayFlight flight = new DisplayFlightProxy().getDisplayFlight();
    String showFlight = flight.viewFlights();
    showFlight = showFlight.replace("\n", "<br><br>");

%>
<br>
<form action="FlightDetails.jsp">
<button type="submit">Next </button>
</form>
</body>
</html>