<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <link href="newcustomer.css" rel="stylesheet" type="text/css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <jsp:include page="Header.jsp" />
<title>NewQuestion</title>
</head>
<body>

<%@page import="com.Questions.*" %>

<div class="container">
  <h2>New Question</h2>
  <form action="QInsert" method="post">
    <div class="form-group">
      <label for="User name">User Name</label>
      <input type="text" class="form-control"  placeholder="Enter Username" id="check-name" onkeyup="validateName()" name="uname">
      <span id="name-error"></span>
    </div>
	  	<div>
			<label for="Catergory">Catergory</label><br>
			<select class="form-select" id="category" name="category" >
			<option selected></option>
			<option value="PC">PC</option>
			<option value="Mobile Phones">Mobile Phones</option>
			<option value="Smart Tv">Smart Tv</option>
			<option value="Broadband">Broadband</option>
			<option value="Other">Other</option>
		</select>
	  </div>
    <div class="mb-3">
  		<label for="exampleFormControlTextarea1" class="form-label m-5">Question</label>
 		<textarea class="form-control"  rows="5" name="question" id="check-name" onkeyup="validateName()"></textarea>
 		
	</div>
	<span id="name-error"></span>

	  

    <button type="submit m-5 p-6 " class="btn btn-default" id="submit" >Publish</button>
	<button type="button" class="btn btn-default p-6 " id="home" >Home</button>
  </form>
</div>
	<script type="text/javascript" src="javascript.js"></script>
</body>
</html>