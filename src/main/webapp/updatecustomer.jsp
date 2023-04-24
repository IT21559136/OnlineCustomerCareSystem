<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<style>
body {
    background: linear-gradient(to left bottom, #670773, #74277d, #803e87, #8c5392, #98679c);
}

.form-control:focus {
    box-shadow: none;
    border-color: #BA68C8
}

.profile-button {
    background: rgb(99, 39, 120);
    box-shadow: none;
    border: none
}

.profile-button:hover {
    background: #682773
}

.profile-button:focus {
    background: #682773;
    box-shadow: none
}

.profile-button:active {
    background: #682773;
    box-shadow: none
}

.back:hover {
    color: #682773;
    cursor: pointer
}

.labels {
    font-size: 11px
}

.add-experience:hover {
    background: #BA68C8;
    color: #fff;
    cursor: pointer;
    border: solid 1px #BA68C8
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


<div class="container-fluid">
<div class="container rounded bg-white mt-5 mb-3 w-50 ">
    <div class="row">
           
            <div class="p-5 py-5 ml-1">
                <div class="d-flex p-2 justify-content-between align-items-center mb-3">
                    <h4 class="text-right">Profile Settings</h4>
                </div>
                <form action="UpdateCustomerServlet" method="post">
                <div class="row mt-2">
                    <div class="col-md-4"><label class="labels">ID</label><input type="text" class="cusid form-control" value="<%=id %>" readonly></div>
                </div>
                <div class="row mt-2">
                    <div class="col-md-6"><label class="labels">Name</label><input type="text" class="fname form-control" placeholder="first name" value="<%=fname %>" ></div>
                    <div class="col-md-6"><label class="labels">Surname</label><input type="text" class="sname form-control" placeholder="surname" value="<%=sname%>"></div>
                </div>
                <div class="row mt-3">
                    <div class="col-md-12"><label class="labels">Mobile Number</label><input type="text" class="phone form-control" placeholder="enter phone number" value="<%=phone%>"></div>
                    <div class="col-md-12"><label class="labels">User Name</label><input type="text" class="uname form-control" placeholder="enter username" value="<%=username%>"></div>                   
                </div>
                <div class="row mt-2">
                    <div class="col-md-6"><label class="labels">Password</label><input type="password" class="pass form-control" placeholder="enter password" value="<%=password%>"></div>
                    <div class="col-md-6"><label class="labels">Birthday</label><input type="date" class="bdate form-control" placeholder="enter birthday" value="<%=birthDate%>"></div>
                </div>
                <div class="mt-5 text-center"><button class="submit btn btn-primary profile-button" type="submit" >Save Profile</button></div>
                </form>
            </div>
        
    </div>
</div>
</div>
</body>
</html>

