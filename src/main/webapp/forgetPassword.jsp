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

    <%
		String id = request.getParameter("id");
		String fname = request.getParameter("fname");
		String sname = request.getParameter("sname");
		String mobile  = request.getParameter("mobile");
		String uname = request.getParameter("uname");
		String pw = request.getParameter("pw");
		String bDate = request.getParameter("bDate");
	%>

            <div class="container">
                <div class="title">Reset Password</div>
                <div class="content">
                    <form action="ResetPasswordServlet" method="post">
                        <div class="user-details">
                            <div class="input-box1">
                                <span class="details">
                            <p>
                                Hello, 
                                <%= fname %>
                                <%= sname %>
                            </p>
                            
                            <input type="hidden" name="id" value="<%= id %>"> <br>
                            Your username : <%= uname %> <br>
                            Enter your new Password : <input type="password" name="pW" value="<%= pw %>"> <br>
                        </span> <br>
                                <div class="button">
                                    <input type="submit" name="submit" value="Reset Password"> <br>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>

</body>

</html>