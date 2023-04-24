<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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



    <div class="container">
        <div class="title">Confirm Your Details</div>
        <div class="content">
            <form action="SearchAccountServlet" method="post">
                <div class="user-details">
                    <div class="input-box1">
                        <span class="details">

                                <c:forEach var="acc" items="${accDetails}">

                                    <c:set var="id" value="${acc.id}" />
                                    <c:set var="fname" value="${acc.fname}" />
                                    <c:set var="sname" value="${acc.sname}" />
                                    <c:set var="mobile" value="${acc.mobile}" />
                                    <c:set var="username" value="${acc.username}" />
                                    <c:set var="Bdate" value="${acc.birthdate}" />
                                    <c:set var="password" value="${acc.password}" />

                            <h4>First Name : ${acc.fname}</h4>
	                        <h4>Second Name : ${acc.sname}</h4>
	                        <h4>Mobile Number : ${acc.mobile}</h4>
                        	<h4>Username : ${acc.username}</h4>
	                        <h4>B date : ${acc.birthdate}</h4>

                        </c:forEach>

                    <c:url value="forgetPassword.jsp" var="pwReset">
	                	<c:param name="id" value="${id}"></c:param>
	                	<c:param name="fname" value="${fname}"></c:param>
	                	<c:param name="sname" value="${sname}"></c:param>
	                	<c:param name="mobile" value="${mobile}"></c:param>
	                	<c:param name="uname" value="${username}"></c:param>
	                	<c:param name="pw" value="${password}"></c:param>
	                	<c:param name="bDate" value="${Bdate}"></c:param>
	                </c:url>

                        </span> <br>
                        <div class="button">
                            <a href="cusRegister.jsp">
                                <input type="button" name="back" id="" value="No? - Sign up to the system" />
                            </a>
                            <a href="${pwReset}">
                                <input type="button" name="reset" id="" value="yes? - reset your password" />
                            </a>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>

</body>

</html>
