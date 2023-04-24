<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
    <title>Recover Account</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="style1.css">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>

    <%@page import="com.Login.*" %>
        <div class="container">
            <div class="title">Recover Your Account</div>
            <div class="content">
                <form action="SearchAccountServlet" method="post">
                    <div class="user-details">
                        <div class="input-box1">
                            <span class="details">Enter your Mobile Number to find the Account</span> <br>
                            <input type="text" name="phone" placeholder="Enter your Mobile Number" required>
                            <div class="button">
                                <input type="submit" name="searchID" value="Search">
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>

</body>

</html>