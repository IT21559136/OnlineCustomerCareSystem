<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
    <meta charset="utf-8">
    <title>Customer care system</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>

<%@page import="com.Login.*" %>

    <div class="head-message">
        Welcome to the SupportYou Customer care
    </div>
    <div class="center">
        <h1>Login</h1>
        <form action="LoginServlet" method="post">
            <div class="txt_field">
                <input type="text" name="uid" required>
                <span></span>
                <label>Username</label>
            </div>
            <div class="txt_field">
                <input type="password" name="pw" required  id="signInPassword" onkeyup="validatePwd()" >
                <span id="psw-error"></span> 
                <label>Password</label>
            </div>
            <div class="pass">
            <a href="searchAccount.jsp"> Forgot Password? </a>
            </div>
            <input type="submit" name="Submit" value="Login">
            <div class="signup_link">
                Didn't sign-up before? <a href="cusRegister.jsp">Signup</a>
            </div>

        </form>
    </div>
    <div class="admin-login">
        <a href="adminLogin.jsp">
        	<button>Admin Login</button>
        </a>
    </div>

<script type="text/javascript" src="javascript.js"></script>
</body>

</html>