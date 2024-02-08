<%@page import="PassengerRegistration.RefundTicketProxy"%>
<%@ page import="PassengerRegistration.RefundTicket" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Airline Reservation System - Refund Ticket</title>
</head>
<body>
    <h1>Refund Ticket</h1>

    <form action="" method="post">
        <label>Passenger ID:</label>
        <input type="text" name="passengerId" required>
        <br/><br/>

        <label>Reason for Refund:</label>
        <select name="refundReason" required>
            <option value="1">Cancellation within 24 hours</option>
            <option value="2">Change in travel plans</option>
            <option value="3">Emergency situation</option>
            <option value="4">Flight cancellation by airline</option>
        </select>
        <br/><br/>

        <button type="submit">Process Refund</button>
    </form>

    <%-- Process refund when the form is submitted --%>
    <%
        String passengerIdStr = request.getParameter("passengerId");
        String refundReasonStr = request.getParameter("refundReason");

        if ("POST".equalsIgnoreCase(request.getMethod()) && passengerIdStr != null && refundReasonStr != null) {
            int passengerId = Integer.parseInt(passengerIdStr);
            int refundReason = Integer.parseInt(refundReasonStr);

            RefundTicket refundTicket = new RefundTicketProxy().getRefundTicket();
            String refundResult = refundTicket.processRefund(passengerId, refundReason);

    %>
            <hr/>
            <h2>Refund Result:</h2>
            <p><%= refundResult %></p>
    <%
        }
    %>

</body>
</html>
