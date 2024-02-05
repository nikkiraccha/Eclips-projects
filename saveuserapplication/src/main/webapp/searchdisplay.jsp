<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core_1_1" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">

	<c:if test="${empty user}">
	   Search Result not found....
	   <jsp:include page="usersearch.html"/>
	</c:if>
	
	<c:if test="${not empty user}">
		<jsp:include page="usersearch.html"/>
		User id...${user.userId}		<br>
		User Name...${user.userName}	<br>
		User Email...${user.userEmail}	<br>
		User Mobile...${user.userMobile} <br>
		User Location...${user.userLocation}<br>
	</c:if>
	
</body>
</html>