<%@page import="PassengerRegistration.FlightDetailsProxy"%>
<%@ page import="PassengerRegistration.DisplayFlightProxy" %>
<%@ page import="PassengerRegistration.DisplayFlight" %>
<%@ page import="PassengerRegistration.FlightDetails" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>

<%
    // Display available flights
    DisplayFlight flight = new DisplayFlightProxy().getDisplayFlight();
    String showFlight = flight.viewFlights();
    showFlight = showFlight.replace("\n", "<br><br>");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Airline Reservation System</title>
</head>
<body>
    <h1>Flight Details</h1>
    <%= showFlight %>

    <h1>Book A Flight</h1>
    <form action="PaymentDetails.jsp" method="post">
        <label>Please enter the ID of the flight you would like to take:</label>
        <input name="FlightID" type="text">
        <br/><br/>
        <button type="submit">Next</button>
    </form>
</body>
</html>
