<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>

	<form action="registermany" validate="true" >
	
	Enter Email <input type="text" name="email"></br>
	Enter Password <input type="text" name="password"></br>
	First name  <input type="text" name="fname"></br>
	Last name  <input type="text" name="lname"></br>
	Phone No <input type="text" name="phoneno"> </br>
	Age <input type="text" name="age"> </br>
	Address_Street <input type="text" name="street"> </br>
	Address_City <input type="text" name="city"> </br>
	
	Address_state <input type="text" name="state"> </br>
	Address_zipcode <input type="text" name="zipcode"> </br>
	
	
	
	<input type="submit" value="submit" >
	
	
	</form>

</body>
</html>