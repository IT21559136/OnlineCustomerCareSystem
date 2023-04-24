<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Admin details</title>
        </head>

        <body>

            <c:forEach var="admin" items="${adminDetails}">

                <h4>ID : ${admin.adminID}</h4>
                <h4>Name : ${admin.adminName}</h4>
                <h4>UserName : ${admin.adminUserName}</h4>
                <h4>password : ${admin.adminPW}</h4>

            </c:forEach>

        </body>

        </html>