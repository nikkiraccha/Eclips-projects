<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

<title>Insert title </title>
</head>
<body bgcolor="aqua">
<c:if test= "${saveResult==1 }">
 Data inserted successfully...${saveResult}
 </c:if>
<c:if test= "${saveResult==0}">
 Data inserted failed...${saveResult}
 </c:if>
<%@include file="user.html" %>

</body>
</html>