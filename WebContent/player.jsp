<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/jquery.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <style>
  .modal-header, h4, .close {
      background-color: #000;
      color:white;
      text-align: center;
      font-size: 30px;
  }
  .modal-footer {
      background-color: #000;
  }
  </style>

<title>ALL Records</title>
</head>
<body>


<div class="container">
 <div class="raw">
 <div class="modal-content">
      <div class="modal-header" style="padding:35px 200px;">
        <h4>Portal - Player's Login </h4>
      </div>
<s:if test="%{#session.login!=null}">
	 <table class="table">
	      <thead>
	      <tr>
	         <th>Login ID</th>
	         <th>Name</th>
			 <th>Phone No</th>
	         <th>Age</th>
	         <th>Address</th>
	         <th>Edit</th>
	      </tr>
	      </thead>
	      <s:iterator value="playerinfos1">
	      <tbody>
	      <tr>
	          <td><s:property value="loginId"/></td>
	          <td><s:property value="fname"/> <s:property value="lname"/></td>
	          <td><s:property value="phoneno"/></td>
	          <td><s:property value="age"/></td>
	          <td><s:property value="address.street"/>, <s:property value="address.city"/>,</br> <s:property value="address.state"/>, <s:property value="address.zipcode"/></td>
	          <td><a href="<s:url namespace="/" action="updateInfopart">
        <s:param name="loginId" value="%{loginId}" />
        <s:param name="fname" value="%{fname}" />
        <s:param name="lname" value="%{lname}" />
        <s:param name="phoneno" value="%{phoneno}" />
        <s:param name="age" value="%{age}" />
        <s:param name="street" value="%{address.street}" />
        <s:param name="city" value="%{address.city}" />
        <s:param name="state" value="%{address.state}" />
        <s:param name="zipcode" value="%{address.zipcode}" />
        
        </s:url>">
	   	       
	          
	          Edit</a></td>
	      </tr>    
	      </tbody>     
	      </s:iterator>	
	   </table>
	   </s:if>
	   	   <s:else>
	   	   <%System.out.println("AAAAAAAAAAAAAAAAAAAAA"); %>
	   	   <h3>Please Login First :- <a href="Pregister.jsp">Click Here</a> </h3>
	   	   
	   	   </s:else>
	   <div class="modal-footer">
        <a href="logoutplayer">
        <button type="submit" class="btn  btn-default " data-dismiss="modal">player Logout</button>
        </a>
      </div>
	   
	</div>	   
 </div>
</div>   
 
 
</body>
</html>