<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <link href="newcustomer.css" rel="stylesheet" type="text/css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style >
  #getid{
  		visibility: visible ;
  }
  </style>
<title>Edit Questions</title>
<jsp:include page="Header.jsp" />
</head>
<body>
<%@page import="com.Questions.*" %>
<c:forEach var="getque" items="${getQue }">
	<div class="container">
  <h2>Edit Question</h2>
  <form action="UpdateQuestionServlet" method="post">
    <div class="form-group">
      <label for="User name">Question ID</label>
      <input type="text" class="form-control" id="getid" value="${getque.id}" name="uid1" readonly>
      <label for="User name">User Name</label>
      <input type="text" class="form-control" value="${getque.username}" name="uname1" readonly>
    </div>
	  	<div>
			<label for="Catergory">Catergory</label><br>
			<select class="form-select" id="category" name="category1" >
			<option selected>${getque.category }</option>
			<option value="PC">PC</option>
			<option value="Mobile Phones">Mobile Phones</option>
			<option value="Smart Tv">Smart Tv</option>
		</select>
	  </div>
    <div class="mb-3">
  		<label for="exampleFormControlTextarea1" class="form-label m-5">Question</label>
  		<textarea class="form-control" id="question" rows="5" name="question1" >${getque.question}</textarea>
	</div>

	  

    <button type="submit" class="btn btn-primary">Update</button>
	 <button type="submit" formaction="${pageContext.request.contextPath }/updelservlet?action=button2" class="btn btn-primary">Delete</button>
  </form>
</div>
</c:forEach>>
</body>
</html>