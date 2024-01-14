<%@page import="PassengerRegistration.FlightDetailsProxy"%>
<%@ page import="PassengerRegistration.FlightDetails" %>
<%@ page import="PassengerRegistration.PaymentDetails" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>

<%
    // Process flight selection and show payment details
    String selectedFlightID = request.getParameter("FlightID");
    if (selectedFlightID != null && !selectedFlightID.isEmpty()) {
        int flightID = Integer.parseInt(selectedFlightID);
        FlightDetails flightDetails = new FlightDetailsProxy().getFlightDetails();
        String confirmDetails = flightDetails.bookFlight(flightID);
%>

        <h1>Payment Details</h1>
        <form action="ConfirmationPage.jsp" method="post">
            <input type="hidden" name="FlightID" value="<%= flightID %>">
            <label>Please enter payment type(Credit card/Debit card):</label>
            <input type="text" name="paymentType" required>
            <br/><br/>
            <button type="submit">Submit Payment</button>
        </form>

<%
    }
%>
</body>
</html>
