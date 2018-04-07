<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="br.com.conexao.Pessoa, 
				java.io.PrintWriter,
				org.hibernate.Session,
				org.hibernate.SessionFactory,
				java.util.ArrayList,
				java.util.List,
				org.hibernate.cfg.Configuration,
				br.com.utilidades.Metodos" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>NadSystem</title>
</head>
<body>
<jsp:include page="topo.jsp"></jsp:include>

<%
String nome = request.getParameter("nome");
String cpf = request.getParameter("cpf");
Metodos metodo = new Metodos();
List <Pessoa> listpessoas = metodo.listando(nome,cpf);

if(listpessoas.isEmpty()){
	 response.sendRedirect("pagina_erro.jsp");
}else{
for(Pessoa pessoa : listpessoas){
%>
<h5>
<b>
<tr>
	<td><%=pessoa.getNome() %></td>
	</br>
	CPF:<td><%=pessoa.getCpf() %></td>
</tr>
</b>
</h5>
<%
	}
}
%>

<jsp:include page="bottom.jsp"></jsp:include>

</body>
</html>