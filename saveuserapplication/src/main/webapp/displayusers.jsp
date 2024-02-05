<%@page import="com.sathya.saveuser.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<table border="2">
    <thead>
        <tr>
            <th>userId</th> 
            <th>userName</th> 
            <th>userEmail</th> 
            <th>userMobile</th> 
            <th>userLocation</th> 
         </tr>
     </thead>
     
     <tbody>
         <c:forEach items="<%=new UserDao().findAll()%>" var="user" >
         <tr>
              <td>${user.userId}</td>
               <td>${user.userName}</td>
                <td>${user.userEmail}</td>
                 <td>${user.userMobile}</td>
                  <td>${user.userLocation}</td>
         
         </tr>
         
         </c:forEach>
              
     
     </tbody>
    </table> 
     
</body>
</html>