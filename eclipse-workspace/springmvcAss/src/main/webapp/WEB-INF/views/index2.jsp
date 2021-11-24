<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to the simple intrest calculator!!!</h2>

<form action="intr">
enter principal<br>
<input type="text" name="t1"><br>
enter rate<br>
<input type="text" name="t2"><br>
enter years<br>
<input type="text"name="t3"><br>
<input type="submit" value="calculate your intrest "><br>
calculated intrest is:---><%=request.getAttribute("intrest") %>
</form>
</body>
</html>