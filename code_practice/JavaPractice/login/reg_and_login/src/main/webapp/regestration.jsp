<!doctype html>
<html>
<head>
    <title>Regestration Page</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="regestration-wrapper">
   <form action="reg" method="post">
       <label>UserName</label>
       <input type="text" placeholder="Enter user id" name="username"><br><br>
       <label>Name</label>
       <input type="text" placeholder="Enter Your Name" name="name"><br><br>
       <label>Password</label>
       <input type="password" placeholder="Enter password" name="password1"><br><br>
       <label>Re-Password</label>
       <input type="password" placeholder="Enter password" name="password2"><br><br>
       <input type="submit" value="Registration" name="register">
       <a href="login.jsp">GoLogin</a>
   </form>
</div>
</body>
</html>