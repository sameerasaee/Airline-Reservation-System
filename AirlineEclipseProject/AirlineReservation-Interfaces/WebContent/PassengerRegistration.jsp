<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Airline Reservation System</title>
</head>
<body>
<h1>Passenger Registration</h1>
<form action="DisplayFlight.jsp">
         <label>Passenger Name:</label>
         <input name="PassengerName" type="text"></input>
         <br/>
         <br/>
         <label>ContactNumber:</label>
         <input name="ContactNumber" type="text"></input>
         <br/>
         <br/>
         <label>PassportNumber:</label>
         <input name="PassportNumber" type="text"></input>
         <br/>
         <br/>
         <button type="submit">Register</button>
</form>
</body>
</html>