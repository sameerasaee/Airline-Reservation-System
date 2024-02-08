<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>

<%
    // Process payment confirmation and show confirmation message
    String flightID = request.getParameter("FlightID");
    String paymentConfirmation = request.getParameter("paymentType");

    if (flightID != null && paymentConfirmation != null) {
%>

        <h1>Confirmation</h1>
        <p>Booking Placed! Thank you for choosing our airline.</p>
        <p>Booking Information:</p>
        <p>FlightID: <%= flightID %></p>
        <p>PaymentDetails: <%= paymentConfirmation %></p>
        <p>Status: Confirmed</p>

<%
    }
%>
</body>
</html>
