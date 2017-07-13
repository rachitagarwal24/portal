<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login</title>
</head>
<body>
<s:actionerror/>
<s:form action="loginprocess">  
<s:textfield name="email" label="Email"></s:textfield>  
<s:textfield name="password" label="Password"></s:textfield>  
<s:submit value="login"></s:submit>  
</s:form>  


</body>
</html>