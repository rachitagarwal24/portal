<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ALL Records</title>
</head>
<body>
<h3>All Records:</h3>  
<s:iterator  value="list">  
<fieldset>  
<s:property value="id"/><br/>  
<s:property value="name"/><br/>  
<s:property value="password"/><br/>  
<s:property value="phoneno"/><br/>  

</fieldset>  
</s:iterator>  
</body>
</html>