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
<title>NewQuestion</title>
</head>
<body>

<%@page import="Answers.*" %>
	<div class="container">
  <h2>New Question</h2>
  
  <c:forEach var="getans"  items="${getAns}">
  
  
  <form action="publishAnswerServlet" method="post">
  	<div class="form-group">
  		 <label for="User name">ID</label>
  		 <input type="text" class="form-control"  name="id" value="${getans.id}" readonly>
  	</div>
    <div class="form-group">
      <label for="User name">User Name</label>
      <input type="text" class="form-control" id="email" name="uname" value="${getans.username}" readonly>
    </div>
	  	<div>
			<label for="Catergory">Catergory</label><br>
			<textarea class="form-control" rows="2" cols="" name="category" >${getans.category}</textarea>
	  </div>
    <div class="mb-3">
  		<label for="exampleFormControlTextarea1" class="form-label m-5">Question</label>
  		<textarea class="form-control" id="question" rows="5" name="question" >${getans.question}</textarea>
	</div>
    
     <div class="mb-3">
  		<label for="exampleFormControlTextarea1" class="form-label m-5">Answer</label>
  		<textarea class="form-control"  rows="5" name="answer1">${getans.answer}</textarea>
	</div>
	  

    <button type="submit m-5 p-6 " class="btn btn-default" id="submit" >Publish Answer</button>

	
  </form>
  </c:forEach>
</div>
	
</body>
</html>