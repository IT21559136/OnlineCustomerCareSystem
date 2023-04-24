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
		#setid{
			visibility: hidden;
		}
	
	</style>
	
<title>Questions</title>

<jsp:include page="Header.jsp" />
</head>
<body>
	
<%@page import="java.util.List"%>
<%@page import="com.Questions.*" %>
<%
try {
	
	
	List<Question> questions = DBHandle.show();
	request.setAttribute("questions", questions);


	}catch(Exception e) {
			e.printStackTrace();
	}
%>


<c:forEach var="que" items="${questions}" >

<div>
<form action="GetIDServlet" method="post">
<div class="form-group">
    
    <input type="text" class="form-control" id="setid"name="Gid" value="${que.id}">
  </div>
<div class="card border-dark mb-3" style="max-width: 50rem;">
  <h6 class="card-header">${que.username}</h6>
  <div class="card-body">
    <h5 class="card-title">${que.category}</h5>
    <p class="card-text">${que.question}</p>
   <p id="visible" class="btn btn-primary" onclick="myFunction()">View Answer<p>
  </div>
  </div>
  </form>
 
  <div id="myDIV">
  	<div class="card" style="max-width: 50rem;">
  <div class="card-header">
    Answer
  </div>
  <div class="card-body">
    <blockquote class="blockquote mb-0">
      <p> ${que.answers}</p>
      <footer class="blockquote-footer">SupportYou Customer care <cite title="Source Title"></cite></footer>
    </blockquote>
  </div>
</div>
  </div>
</div>
	
	
	
	
	
		
	</c:forEach>
	
	


</body>


</html>