<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
    <title>Customer Registration</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="style1.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <style>
    #btn{
      margin-bottom: 10px;
    }
    
    </style>
</head>

<body>
<%@page import="com.UpdateAccount.*" %>

<%
String id= request.getParameter("id");
String fname= request.getParameter("fname");
String sname= request.getParameter("sname");
String phone= request.getParameter("mobile");
String username= request.getParameter("uname");
String password= request.getParameter("password");
String birthDate= request.getParameter("bdate");
%>
<c:forEach var="cus" items="${getcusdes}" >	
    <div class="container">
        <div class="title">Update Account</div>
        <div class="content">
            <form action="UpdateCustomerServlet" method="post">
                <div class="user-details">
                    <div class="input-box">
                        <span class="details">Your ID</span>
                        <input type="text" name="cusid"  value="${cus.id}" required readonly >
                    </div>
                    <div class="input-box">
                        <span class="details">First Name</span>
                        <input type="text" name="fname" placeholder="Enter your first name" value="${cus.fname}" required>
                    </div>
                    <div class="input-box">
                        <span class="details">Second name</span>
                        <input type="text" name="sname" placeholder="Enter your second name" value="${cus.sname}" required>
                    </div>
                    <div class="input-box">
                        <span class="details">Birth Date</span>
                        <input type="date" name="bdate" value="${cus.birthdate}" required>
                    </div>
                    <div class="input-box">
                        <span class="details">Phone Number</span>
                        <input type="text" name="phone" placeholder="Enter your number" value="${cus.mobile}" required>
                    </div>
                    <div class="input-box">
                        <span class="details">Username</span>
                        <input type="text" name="uname" placeholder="Enter username" value="${cus.username}" required>
                    </div>
                    <div class="input-box">
                        <span class="details">Password</span>
                        <input type="text" name="pass" placeholder="Enter your password" value="${cus.password}" required>
                    </div>

                </div>

                <div class="button">
                    <input type="submit" formaction="${pageContext.request.contextPath }/UpdateCustomerServlet?action=button1"  id="btn" name="Submit" value="Update Profile"/>
                    <input type="submit" formaction="${pageContext.request.contextPath }/UpdateCustomerServlet?action=button2" id="btn" name="Submit" value="Delete Profile"/>
                </div>
            </form>
        </div>
    </div>
</c:forEach>
</body>

</html>