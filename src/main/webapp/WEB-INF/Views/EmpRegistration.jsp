<%@page import="com.technoelevate.empdata.controller.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%-- --%>

<body>
<form action="./inserted" method="post">
EmpId : <input type="text" name="EmpId"/>
EMpName :<input type="text" name="EmpName"/>
EmpPassword : <input type="text" name="EmpPassword"/>
<input type="submit"  value="SignUp"/>
</form>
</body>

<body>
<form action="./Login" method="get">
<input type="submit" value="SignIn"/>
</form>
</body>


</html>