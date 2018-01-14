<%@ page import="conexao.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- a tag action leva os dados para a servlet DadosLogin onde será tradado pelo metodo post -->
<form action="DadosLogin" method="post">
<input type="text" name="login">
<input type="password" name="password">
<input type="submit" name="submit">
</form>
</body>
</html>