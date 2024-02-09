<%@ page import="main.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Verify Passenger Identity</title>
<style>
    body { font-family: Arial, sans-serif; }
    .container { max-width: 500px; margin: auto; }
</style>
</head>
<body>
<div class="container">
    <h2>Verify Passenger Identity</h2>
    
    <form action="verification.jsp" method="post">
        <label for="passportNumber">Enter Passport Number:</label>
        <input type="text" id="passportNumber" name="passportNumber" required>
        <br><br>
        
        <input type="submit" value="Verify">
    </form>
   
    <% 
   
    if (request.getMethod().equalsIgnoreCase("post")) {
        String passportNumber = request.getParameter("passportNumber");
        
        
        BoardingPassProxy boardingPass = new BoardingPassProxy();
        
        
        int passengerID = boardingPass.verifyPassengerIdentity(passportNumber);
        
        if (passengerID != -1) {
            out.println("<p>Passenger ID for the provided Passport Number is: " + passengerID + "</p>");
        } else {
            out.println("<p>No passenger found with the provided Passport Number.</p>");
        }
    }
   

    %>
</div>
</body>
</html>
