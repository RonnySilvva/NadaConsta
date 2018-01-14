<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Inicia o topo -->
<jsp:include page="Topo.html"></jsp:include>
<!-- Encerra mensagem topo -->

          <!-- cria o DAO -->
          <jsp:useBean id="dao" class="conexao.PessoaDAO"/>

          <table>
              <!-- percorre contatos montando as linhas da tabela -->
              <c:forEach var="pessoa" items="${dao.lista}">
                  <tr>
                      <td>${contato.nome}</td>
                  </tr>
              </c:forEach>
          </table>
</body>
</html>