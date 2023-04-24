<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">



<title>Insert title here</title>

<style>

ul {
  list-style-type: none;
  margin: 0;
  padding: 0px;
  overflow: hidden;
  background-color: #333;

}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover:not(.active) {
  background-color: #525252;
  color: white;
}

li a:active{
  background-color: #5c3c84;
  
}

li.logo{
	color: white;
	text-align: center;
	padding: 14px 40px;
}

.navDiv a:hover,
.navDiv a.active { background-color:#bbb; }

</style>
</head>
<body>



	

   <ul>  
    <li class="logo">LOGO</li>
    <div id="navDiv">
    <li class="itm active" ><a href="home.jsp">Home</a></li>
    <li class="itm"><a href="MyQuestions.jsp">My Questions</a></li>
    <div style="float:right">
    
    <li class="itm" style="padding-top:6px;"> 
    <!--<button type="submit" href="" formaction="${pageContext.request.contextPath }/GetCustomerdetailsServlet?action=button3" class="btn btn-primary">Account</button>-->
    <c:forEach var = "cus" items = "${cusDetails}">
	<form action="GetCustomerdetailsServlet" method="post" >
	<input type="text"  class="idcus" value="${cus.id}" name="cusid">
	<button type="submit m-5 p-6 " class="itm btn btn-primary" id="submit">My account</button>	
	</form>
	</c:forEach>
    </li>
    
    <li class="itm"><a href="LoginHome.jsp">Logout</a></li>  
    </div>
    </div>
   </ul>
	
<script type="text/javascript" src="header.js"></script>  

<script>$('.navDiv a').on('click', function(){
	  $('.navDiv .active').removeClass('active');
	  $(this).addClass('active');
	});</script>


</body>
</html>