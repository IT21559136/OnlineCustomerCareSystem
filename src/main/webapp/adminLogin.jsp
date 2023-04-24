<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
    <meta charset="utf-8">
    <title>Admin Login</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>

	<%@page import="com.Login.*" %>

    <div class="head-message">
        Welcome back!
    </div>
    <div class="center">
        <h1>Admin Login</h1>
        <form action="AdminLoginServlet" method="post">
            <div class="txt_field">
                <input type="text" name="adminUN" required>
                <span></span>
                <label>Username</label>
            </div>
            <div class="txt_field">
            
                <input type="password" name="adminPW" id="signInPassword" onkeyup="validatePwd()" required>
                <span id="psw-error"></span>
                <label>Password</label>
            </div>
            <div class="pass">
                <a onclick="alertToAdmin()"> Forgot Password? </a>
            </div>
            <input type="submit" name="Submit" value="Login">

        </form>
    </div>
    <script>
        function alertToAdmin() {
            alert("Contact DataBase Admin to reset Password")
        }
    </script>
<script type="text/javascript" src="javascript.js"></script>

</body>

</html>