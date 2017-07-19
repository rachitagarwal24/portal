<%@page import="org.apache.struts2.ServletActionContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/jquery.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <style>
  .modal-header, h4, .close {
      background-color: #000;
      color:white !important;
      text-align: center;
      font-size: 30px;
  }
  .modal-footer {
      background-color: #000;
  }
  </style>
</head>
<body>
<%
	
	int loginId = Integer.parseInt(ServletActionContext.getRequest().getParameter("loginId"));
	String fname = ServletActionContext.getRequest().getParameter("fname");
	String lname = ServletActionContext.getRequest().getParameter("lname");
	String phoneno = ServletActionContext.getRequest().getParameter("phoneno");
	int age = Integer.parseInt(ServletActionContext.getRequest().getParameter("age"));
	String street = ServletActionContext.getRequest().getParameter("street");
	String city = ServletActionContext.getRequest().getParameter("city");
	String state = ServletActionContext.getRequest().getParameter("state");
	String zipcode= ServletActionContext.getRequest().getParameter("zipcode");
	
%>
	


<div class="container">
  <div class="raw">   
 
    <div class="modal-content">
      <div class="modal-header" style="padding:35px 200px;">
        <h4>Portal - Edit Player's Info </h4>
      </div>
      
      <div class="modal-body" style="padding:20px 10px;">
                <form role="form"  action="update" validate="true">
                
                 <input type="hidden" name="loginId" value="<%=loginId%>" >
                <div class="form-inline" style="margin-left: 140px;">
                        <div class="form-group">
                        
                          <label for="fname" style="padding-right: 34px;">First Name</label>
                          <input type="text" class="form-control" name="fname" value="<%=fname%>" placeholder="First name">
                        </div>
                        <div class="form-group" style="padding-left: 80px;">
                          <label for="lname" style="padding-right: 25px;">Last Name</label>
                          <input type="text" class="form-control" name="lname" value="<%=lname%>" placeholder="Last name">
                        </div>
                 </div>
                 </br>
                 <div class="form-horizontal col-sm-12">
                        <div class="form-group ">
                          <label class="control-label col-sm-3" >Enter Phone No</label>
                          <div class="col-sm-8">
                          <input  type="text" class="form-control" name="phoneno" value="<%=phoneno%>" placeholder="Enter Phone No">
                          </div>
                        </div>
                        <div class="form-group ">
                          <label class="control-label col-sm-3" >Enter Age</label>
                          <div class="col-sm-8">
                          <input  type="text" class="form-control" name="age" value="<%=age%>" placeholder="Enter Age">
                          </div>
                        </div>
                        <div class="form-group ">
                          <label class="control-label col-sm-3" >Enter Address Street</label>
                          <div class="col-sm-8">
                          <input  type="text" class="form-control" name="address.street" value="<%=street%>" placeholder="Enter Street">
                          </div>
                        </div>
                        <div class="form-group ">
                          <label class="control-label col-sm-3" >Enter Address City</label>
                          <div class="col-sm-8">
                          <input  type="text" class="form-control" name="address.city" value="<%=city%>" placeholder="Enter City">
                          </div>
                        </div>
                        <div class="form-group ">
                          <label class="control-label col-sm-3" >Enter Address State</label>
                          <div class="col-sm-8">
                          <input  type="text" class="form-control" name="address.state" value="<%=state%>" placeholder="Enter State">
                          </div>
                        </div>
                        <div class="form-group ">
                          <label class="control-label col-sm-3">Enter Address Zipcode</label>
                          <div class="col-sm-8">
                          <input  type="text" class="form-control" name="address.zipcode" value="<%=zipcode%>" placeholder="Enter Zipcode">
                          </div>
                        </div>
                  </div>      
               
                  <button type="submit" class="btn btn-block">Update Information</button>
                </form>
              </div>

        <div class="modal-footer">
          <a href="officerlogout">
          <button type="submit" class="btn  btn-default " data-dismiss="modal">Officer_Logout</button>
          </a>
        </div>
    </div>
      
   </div>  
</div>

 

</body>
</html>
