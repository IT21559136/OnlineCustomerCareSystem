<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
    <title>Customer Registration</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="style1.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>

	<%@page import="com.Login.*" %>
	
    <div class="container">
        <div class="title">Registration</div>
        <div class="content">
            <form action="cusRegisterServlet" method="post">
                <div class="user-details">
                    <div class="input-box">
                        <span class="details">First Name</span>
                        <input type="text" name="fName" placeholder="Enter your first name" required>
                    </div>
                    <div class="input-box">
                        <span class="details">Second name</span>
                        <input type="text" name="sName" placeholder="Enter your second name" required>
                    </div>
                    <div class="input-box">
                        <span class="details">Birth Date</span>
                        <input type="date" name="BDate" required>
                    </div>
                    <div class="input-box">
                        <span class="details">Phone Number</span>
                        <input type="text" name="MobileNum" placeholder="Enter your number" required>
                    </div>
                    <div class="input-box">
                        <span class="details">Username</span>
                        <input type="text" name="Username" placeholder="Enter username" required>
                    </div>
                    <div class="input-box">
                        <span class="details">Password</span>
                        <input type="text" name="password" placeholder="Enter your password" required>
                    </div>

                </div>

                <div class="button">
                    <input type="submit" name="Submit" value="Register">
                </div>
            </form>
        </div>
    </div>

</body>

</html>