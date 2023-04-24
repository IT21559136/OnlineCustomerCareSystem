<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>

<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="https://pixinvent.com/stack-responsive-bootstrap-4-admin-template/app-assets/css/bootstrap-extended.min.css">
<link rel="stylesheet" type="text/css" href="https://pixinvent.com/stack-responsive-bootstrap-4-admin-template/app-assets/fonts/simple-line-icons/style.min.css">
<link rel="stylesheet" type="text/css" href="https://pixinvent.com/stack-responsive-bootstrap-4-admin-template/app-assets/css/colors.min.css">
<link rel="stylesheet" type="text/css" href="https://pixinvent.com/stack-responsive-bootstrap-4-admin-template/app-assets/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css?family=Montserrat&display=swap" rel="stylesheet">

<link rel="stylesheet" href="css/mdb.min.css"/>
<link rel="stylesheet" href="Home.css">
<jsp:include page="Header.jsp" />

<title>Insert title here</title>
<style>
.button {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin:auto;
  cursor: pointer;
}
.card{
			margin: auto;
			
		}
		.btn{
			 float: right;
		}
#btn1{
 background-color: #f5d658;
}	
#btn2{
 background-color: #a8de36;
}	
.cat_search{
	margin: auto;
	position:relative;	
}
.col-sm-2{
	width: 100%;
}
.idcus{
	visibility: hidden;
}
li.cat a{
	float:center;
	color:#000000;
	padding:18px 20px;
}
</style>

</head>
<body>


 <div class=" category bg-image obj-fit-cover container-fluid py-4" style="background-image: url('https://toruskit.com/assets/img/util/gradient-01-w.svg'); height:45.5vh; width: 100vw   background-size: cover;">
 <!--<img class="bg obj-fit-cover" src="https://toruskit.com/assets/img/util/gradient-01-w.svg" alt="...">-->
   <div class="cat_search container">
   <h4 style="padding-bottom: 20px;"><center>Search by Category</center></h4>
   <ul class="cat container"> 
      <div class="icon-with-text">
      <li class="cat"><a href="#"><img class="cat-icon" alt="" src="https://community.dialog.lk/images/categories/large/mobile.png"></a>Phone</li>      
      <li class="cat"><a href="#"><img class="cat-icon" alt="" src="https://community.dialog.lk/images/categories/large/devices.png"></a>PC</li> 
      <li class="cat"><a href="#"><img class="cat-icon" alt="" src="https://community.dialog.lk/images/categories/large/television.png"></a>Television</li> 
      <li class="cat"><a href="#"><img class="cat-icon" alt="" src="https://community.dialog.lk/images/categories/large/home-broadband.png"></a>Broadband</li>
      <li class="cat"><a href="#"><img class="cat-icon" alt="" src="https://community.dialog.lk/images/categories/large/other.png"></a>Other</li>
      </div>
   </ul> 
   </div>  
  </div>
 
  
<div class="container-fluid ">
<div class="row">
<div class="col-sm-2 p-3 text-white bg-image obj-fit-cover container" style="background-image: url('https://community.dialog.lk/images/home/home-banner2-left.png')"></div>
<div class="col-sm-6 p-3 border-start border-end text-black">
        <%@page import="java.util.List"%>
        <%@page import="com.Questions.*" %>
        <%
          try {
	        List<sQuestion> lquestions = DBHandle.LQuestions();
	        request.setAttribute("lquestions", lquestions);

	      }catch(Exception e) {
			 e.printStackTrace();
	      }

        %>
        <%
        try {

        	Connection con = DBConnection.getConnection();
        	Statement stmt = con.createStatement();

        	String sql = "Select count(id) From answers";
        	ResultSet rs = stmt.executeQuery(sql);
        	String nid = "";
        	while(rs.next()) {
        		nid = rs.getString(1);
        		
        	}

        	request.setAttribute("nid", nid);

        	}catch(Exception e) {
        	e.printStackTrace();
        	}
        
        %>
        <%
        try {

        	Connection con1 = DBConnection.getConnection();
        	Statement stmt1 = con1.createStatement();

        	String sql1 = "Select count(cusID) From customerdetails";
        	ResultSet rs1 = stmt1.executeQuery(sql1);
        	String nid1 = "";
        	while(rs1.next()) {
        		nid1 = rs1.getString(1);
        		
        	}

        	request.setAttribute("nid1", nid1);

        	}catch(Exception e) {
        	e.printStackTrace();
        	}
        
        %>
      <br>
      
<h2>Latest Questions
<span style="float : right; padding-left:8px; ">
<a href="replyQuestions.jsp" id="btn1"class="btn btn-rounded">Answered Question</a></button></span>
<span style="float : right; ">
<a href="notAnsweredQuestions.jsp" id="btn2"class="btn btn-rounded">Not Answered Question</a></span>
</h2>
<br>

<div class="que-cards">
<c:forEach var="que" items="${lquestions}" >
<div class="card border-dark mb-3" style="max-width: 50rem;">
  <h6 class="card-header" >${que.username}</h6>
  <div class="card-body">
    <h5 class="card-title">${que.category}</h5>
    <p class="card-text">${que.question}</p>
    <a href="#" class="btn btn-primary">View Answer</a>
  </div>
</div>
</c:forEach>
</div>
    
</div>


<div class="col-sm-2 p-3 border-end"> 
<!-- Total Questions -->

        <div class="card mb-3" >
          <div class="card-content">
            <div class="card-body">
              <div class="media d-flex">
                <div class="media-body text-left">
                  <h3 class="success"><c:out value="${nid1}"/></h3>
                  <span>Total Clients</span>
                </div>
                <div class="align-center">
                  <i class="icon-user success font-large-1 float-right"></i>
                </div>
              </div>
            </div>
          </div>
        </div>
   
<!-- Total Clients -->

        <div class="card mb-3">
          <div class="card-content">
            <div class="card-body">
              <div class="media d-flex">
                <div class="align-center">
                  <i class="icon-speech warning font-large-1 float-left"></i>
                </div>
                <div class="media-body text-right">
                  <h3 class="warning"><c:out value="${nid}"/></h3>
                  <span>Total Questions</span>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>

<div class="col-sm-2 p-3 text-white bg-image obj-fit-cover container" style="background-image: url('https://community.dialog.lk/images/home/home-banner2-right.png')"></div>
   
</div>
</div>

</body>
</html>