<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
    <meta charset="utf-8">
    <title>Customer care system</title>
    <link rel="stylesheet" href="LoginStyle.css">
</head>

<body>
    <div class="head-message">
        Welcome to the ABC Customer care
    </div>
    <div class="center">
        <h1>Login</h1>
        <form action="login" method="post">
            <div class="txt_field">
                <input type="text" name="uid" required>
                <span></span>
                <label>Username</label>
            </div>
            <div class="txt_field">
                <input type="password" name="pw" required>
                <span></span>
                <label>Password</label>
            </div>
            <div class="pass">Forgot Password?</div>
            <input type="submit" name="Submit" value="Login">
            <div class="signup_link">
                Didn't sign-up before? <a href="#">Signup</a>
            </div>

        </form>
    </div>
    <div class="admin-login">
        <button>Admin Login</button>
    </div>


</body>

</html>