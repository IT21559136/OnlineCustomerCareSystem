<%@page import="com.Questions.DBHandle"%>
<%@page import="Answers.AdmnDBHandle"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
<style>
		.card{
			margin: auto;
			
		}
		.btn{
			 float: right;
		}
	
	</style>
<title>Questions</title>
</head>
<body>

<%@page import="java.util.List"%>
<%@page import="Answers.*" %>

<%
try {
	
	
	List<Answers> answers = AdmnDBHandle.showNewQuestons();
	request.setAttribute("answers", answers);


	}catch(Exception e) {
			e.printStackTrace();
	}
%>

<%@page import="Answers.*" %>

<c:forEach var="que" items="${answers}" >
<div>
<form action="DeleteAnswersServlet" method="post">
<div class="form-group">
    
    <input type="text" class="form-control" name="Gid" value="${que.id}">
  </div>
  

<div class="card border-dark mb-3" style="max-width: 50rem;">
  <h6 class="card-header">${que.username}</h6>
  <div class="card-body">
    <h5 class="card-title">${que.category}</h5>
    <p class="card-text">${que.question}</p>
   <button type="submit" class="btn btn-primary">Delete</button>
  </div>
</div>

</form>
</div>
		
</c:forEach>
	
</body>


</html>