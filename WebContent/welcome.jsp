	
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
      <s:iterator value="playerinfos">
      <tr>
          <td><s:property value="loginId"/></td>
          <td><s:property value="fname"/></td>
          <td><s:property value="lname"/></td>
          <td><s:property value="age"/></td>
         	<td><s:property value="address.street"/></td>
   
          
               </tr>    
           
      </s:iterator>	
   </table>
 
 
</body>
</html>