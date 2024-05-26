<%@page import="modelo.Aluno"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alteração Dados Aluno</title>
</head>
<body>

	<h1>Alteração Dados Aluno</h1>
	
	<form action="chamadaservlet" method="post">
		Ra: <input type="text" name="txtra" value="${aluno.ra }" readonly><br><br>
		Nome: <input type="text" name="txtnome" value="${aluno.nome }" ><br><br>
		1º Bim: <input type="text" name="txtpri" value="${aluno.prim }" ><br><br>
		2º Bim: <input type="text" name="txtseg" value="${aluno.seg }" ><br><br>
		3º Bim: <input type="text" name="txtter" value="${aluno.ter }" ><br><br>
		4º Bim: <input type="text" name="txtqua" value="${aluno.qua }" ><br><br>
		Média: <input type="text" name="txtmedia" value="${aluno.media }" readonly><br><br>
		Status: <input type="text" name="txtstatus" value="${aluno.statusFinal }" readonly>
		<input type="hidden" name="acao" value="altera">
		<input type="submit" value="Alterar">
	</form>
	
	
	

</body>
</html>






