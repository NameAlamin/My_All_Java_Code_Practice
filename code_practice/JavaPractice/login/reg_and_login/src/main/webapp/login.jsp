<!doctype html>
<html>
    <head>
        <title>Login Page</title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <div class="login-wrapper">
          <form action="login" method="post">
              <h3 style="color: red;">${message}</h3><br>
              <h3 style="color: green;">${successMessage}</h3>
              <br><br><label>UserName</label>
              <input type="text" placeholder="Enter user id" name="username"><br><br>
              <label>Password</label>
              <input type="password" placeholder="Enter password" name="password1"><br><br>
              <input type="submit" value="Login" name="login">
              <a href="regestration.jsp">Go-Registration</a>
          </form>
        </div>
    </body>
</html>