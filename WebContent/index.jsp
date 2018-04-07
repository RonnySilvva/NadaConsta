<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>NadSystem</title>
<style type="text/css">
#obs{
border: 2px solid #0000;
position: absolute;
	bottom: 0;
}
</style>
</head>
<body>
<!-- ${pageContext.request.contextPath}/DadosPaginaFormulario -->
<div align="center">
<form action="DadosPaginaFormulario" method="post">

Nome: <input type="text" name="nome" />
<br/>
Cpf: <input type="text" name="cpf" />
<br/>
<p>
<input type="submit" name="enviar" value="Emitir" />
<input type="reset" name="limpar" value="Limpar" />

</form>
</div>
<div id="obs" align="center">Digite o cpf completo, com pontos e hifen.</div>
</body>
</html>