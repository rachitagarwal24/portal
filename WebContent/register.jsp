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
	First name  <input type="text" name="playerInfo.fname"></br>
	Last name  <input type="text" name="playerInfo.lname"></br>
	Phone No <input type="text" name="playerInfo.phoneno"> </br>
	Age <input type="text" name="playerInfo.age"> </br>
	Address_Street <input type="text" name="playerInfo.address.street"> </br>
	Address_City <input type="text" name="playerInfo.address.city"> </br>
	
	Address_state <input type="text" name="playerInfo.address.state"> </br>
	Address_zipcode <input type="text" name="playerInfo.address.zipcode"> </br>
	
	
	
	<input type="submit" value="submit" >
	
	
	</form>

</body>
</html>