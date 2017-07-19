<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <title>Portal</title>
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

<div class="container">
 <div class="raw">   
 
    <div class="modal-content">
      <div class="modal-header" style="padding:35px 200px;">
        <h4>Portal - Officer's Login </h4>
      </div>
      
        <ul id = "myTab" class = "nav nav-tabs" style="padding-left: 400px;">
          <li class = "active">
          <a href = "#login" data-toggle = "tab">
             Login
          </a>
          </li>
          <li><a href = "#register" data-toggle = "tab">Register</a></li>
        </ul> 

        <div id = "myTabContent" class = "tab-content">
            <div class = "tab-pane fade in active" id = "login">

              <div class="modal-body" style="padding:40px 250px;">
                <form role="form" action="officerlogin">
                  <div class="form-group">
                    <label for="usrname">Enter Email</label>
                    <input type="text" class="form-control" name="email" placeholder="Enter email">
                  </div>
                  <div class="form-group">
                    <label for="psw">Password</label>
                    <input type="password" class="form-control" name="password" placeholder="Enter password">
                  </div>
                  
                    <button type="submit" class="btn btn-block">Login</button>
                </form>
              </div>
            </div>
            <div class = "tab-pane fade" id = "register">

              <div class="modal-body" style="padding:40px 250px;">
                <form role="form"  action="addOfficer" validate="true">
                  <div class="form-group">
                    <label for="fname">First Name</label>
                    <input type="text" class="form-control" required="required" name="fname" placeholder="First name">
                  </div>
                  <div class="form-group">
                    <label for="lname">Last Name</label>
                    <input type="text" class="form-control" required="required" name="lname" placeholder="Last name">
                  </div>
                  <div class="form-group">
                    <label for="email">Enter Email</label>
                    <input type="text" class="form-control" required="required" name="email" placeholder="Enter email">
                  </div>
                  <div class="form-group">
                    <label for="psw">Password</label>
                    <input type="password" class="form-control" required="required" name="password" placeholder="Enter password">
                  </div>
                  <div class="form-group">
                    <label for="phoneno">Enter Phone No</label>
                    <input type="tel" class="form-control" name="phoneno" required="required" placeholder="Enter phoneno">
                  </div>
             
                  <button type="submit" class="btn btn-block">Register</button>
                </form>
              </div>
            </div>  

        </div>



      <div class="modal-footer">
        <a href="Pregister.jsp">
        <button type="submit" class="btn  btn-default " data-dismiss="modal">Player</button>
        </a>
      </div>
    </div>
      
   </div>  
</div>
 

</body>
</html>
