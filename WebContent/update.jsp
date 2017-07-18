<%@page import="org.apache.struts2.ServletActionContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update</title>
</head>
<body>

	<%
	
	int loginId = Integer.parseInt(ServletActionContext.getRequest().getParameter("loginId"));
	String fname = ServletActionContext.getRequest().getParameter("fname");
	String lname = ServletActionContext.getRequest().getParameter("lname");
	String phoneno = ServletActionContext.getRequest().getParameter("phoneno");
	int age = Integer.parseInt(ServletActionContext.getRequest().getParameter("age"));
	String street = ServletActionContext.getRequest().getParameter("fname");
	String city = ServletActionContext.getRequest().getParameter("city");
	String state = ServletActionContext.getRequest().getParameter("state");
	String zipcode= ServletActionContext.getRequest().getParameter("zipcode");
	
%>
	


	<form action="update" validate="true" >
	 <input type="hidden" name="loginId" value="<%=loginId%>" >
	First name  <input type="text" name="fname" value="<%=fname%>" ></br>
	Last name  <input type="text" name="lname" value="<%=lname%>" ></br>
	Phone No <input type="text" name="phoneno" value="<%=phoneno%>" > </br>
	Age <input type="text" name="age" value="<%=age%>"> </br>
	Address_Street <input type="text" name="address.street" value="<%=street%>"> </br>
	Address_City <input type="text" name="address.city" value="<%=city%>"> </br>
	Address_state <input type="text" name="address.state" value="<%=state%>"> </br>
	Address_zipcode <input type="text" name="address.zipcode" value="<%=zipcode%>"> </br>
	
	
	
	<input type="submit" value="Update Information" >
	
	
	</form>

</body>
</html>