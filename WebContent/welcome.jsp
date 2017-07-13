	
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<html>
<head>
 
 
<title>ALL Records</title>
</head>
<body>
<h3>All Records:</h3> 

 <table>
      <tr>
         <td>ID</td>
         <td>Name</td>
		 <td>Email</td>
         <td>Password</td>
         <td>Phone No</td>
      </tr>
      <s:iterator value="players">
      <tr>
          <td><s:property value="loginid"/></td>
          <td><s:property value="name"/></td>
          <td><s:property value="email"/></td>
          <td><s:property value="password"/></td>
          <td><s:property value="phoneno"/></td>
      </tr>    
           
      </s:iterator>	
   </table>
 
 
</body>
</html>