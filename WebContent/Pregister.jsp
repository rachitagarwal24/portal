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

<div class="container">
 <div class="raw">   
 
    <div class="modal-content">
      <div class="modal-header" style="padding:35px 200px;">
        <h4>Portal - Player's Login </h4>
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
                <form role="form" action="loginprocess">
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
                <form role="form"  action="registermany" validate="true">
                  <div class="form-group">
                    <label for="fname">First Name</label>
                    <input type="text" class="form-control" name="playerInfo.fname" required="required" placeholder="First name">
                  </div>
                  <div class="form-group">
                    <label for="lname">Last Name</label>
                    <input type="text" class="form-control" name="playerInfo.lname" required="required" placeholder="Last name">
                  </div>
                  <div class="form-group">
                    <label for="email">Enter Email</label>
                    <input type="text" class="form-control" name="email" required="required" placeholder="Enter email">
                  </div>
                  <div class="form-group">
                    <label for="psw">Password</label>
                    <input type="password" class="form-control" name="password"  required="required" placeholder="Enter password">
                  </div>
                  <div class="form-group">
                    <label for="dof">Enter Age</label>
                    <input type="text" class="form-control" name="playerInfo.age" required="required" placeholder="Enter date">
                  </div>
                  <div class="form-group">
                    <label for="phoneno">Enter Phone No</label>
                    <input type="tel" class="form-control" name="playerInfo.phoneno" required="required" placeholder="Enter phoneno">
                  </div>
                  <div class="form-group">
                    <label for="street">Enter Address-Street</label>
                    <input type="text" class="form-control" name="playerInfo.address.street"  required="required" placeholder="Enter street name and no.">
                  </div>
                  <div class="form-group">
                    <label for="city">Enter Address-City</label>
                    <input type="text" class="form-control" name="playerInfo.address.city"  required="required" placeholder="Enter City">
                  </div>
                  <div class="form-group">
                    <label for="state">Enter Address-State</label>
                    <input type="text" class="form-control" name="playerInfo.address.state"  required="required" placeholder="Enter State">
                  </div>
                  <div class="form-group">
                    <label for="zipcode">Enter Address-ZipCode</label>
                    <input type="text" class="form-control" name="playerInfo.address.zipcode" required="required" placeholder="Enter Pincode">
                  </div>


                  <button type="submit" class="btn btn-block">Register</button>
                </form>
              </div>
            </div>  

        </div>



      <div class="modal-footer">
        <a href="Oregister.jsp">
        <button type="submit" class="btn  btn-default " data-dismiss="modal">Officer</button>
        </a>
      </div>
    </div>
      
   </div>  
</div>
 

</body>
</html>
