<%@page language="java" contentType="text/html"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
</head>
<body bgcolor="pink">

	<c:if test="${empty user}">
	  delete Result not found....
	   <jsp:include page="userdelete.html"/>
	</c:if>
	
	<c:if test="${not empty user}">
	deleted file sucessfull.....
		<jsp:include page="userdelete.html"/>
	</c:if>	
</body>
</html>