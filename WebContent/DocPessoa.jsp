<%@ page import="conexao.*,
    				java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="topo.jsp"></jsp:include>
<b>
<table>

<%
		PessoaDAO dao = new PessoaDAO();
		List<Pessoa> pessoas = dao.getLista();
		for(Pessoa pessoa: pessoas) {
		%>
			<tr>
			<td><%=pessoa.getNome()%></td>
			<tr>
		<%}%>
	</table>
	</b>
	
	
</body>
</html>