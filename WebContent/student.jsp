<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>portal</title>
</head>
<body>
	<!--<s:form action="addPlayer">
	<s:textfield name="name" lable="Player's Name " />
	<s:textfield name="email" lable="Email "/>
	<s:textfield name="password" lable="Password "/>
	<s:textfield name="phoneno" lable="Phone No "/>
	<s:submit />
	</s:form>
	-->
	
	
	<form action="addPlayer" validate="true" >
	Name  <input type="text" name="name"></br>
	Email <input type="text" name="email"></br>
	Password  <input type="password" name="password"></br>
	Phone No <input type="text" name="phoneno"> </br>
	Date of Birth <input type="date" name="dof"></br>
	<input type="submit" value="submit" >
	
	
	</form>
	
	</br>
	<a href="login">login</a>
	

</body>
</html>