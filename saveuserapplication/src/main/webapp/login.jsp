<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<c:if test="${empty check}">
	   enter valid data....
	   <jsp:include page="login.html"/>
	</c:if>
	
	<c:if test="${not empty check}">
		<c:redirect url="http://sathyatech.com"/>
		</c:if>
	</body>	
</html>