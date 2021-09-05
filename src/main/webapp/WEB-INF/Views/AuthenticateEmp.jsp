<%@page import="com.technoelevate.empdata.controller.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
String msg =(String)request.getAttribute("msg");
%>
<body>
<%=msg %>
</body>
</html>