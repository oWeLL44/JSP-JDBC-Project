<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostra Alunos</title>
</head>
<body>
		
	<h1>Mostra Todos os Alunos</h1>
	
	<a href="http://localhost:8080/sistemaescolaweb/chamadaservlet?acao=cadastro"><button>Cadastrar Aluno</button></a>
	<br><br>
	
	<c:if test="${not empty alunos}">
		<table border="1" style="width: 90%">
			<thead>
				<tr style="color:white;background-color: black">
					<th>RA</th>
					<th>Nome</th>
					<th>1º Bim</th>
					<th>2º Bim</th>
					<th>3º Bim</th>
					<th>4º Bim</th>
					<th>Média</th>
					<th>Status</th>
					<th colspan="2">Ação</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="aluno" items="${alunos}">
					<tr>
						<td>${aluno.ra}</td>
						<td>${aluno.nome}</td>
						<td>${aluno.prim}</td>
						<td>${aluno.seg}</td>
						<td>${aluno.ter}</td>
						<td>${aluno.qua}</td>
						<td>${aluno.media}</td>
						<td>${aluno.statusFinal}</td>
						<td><a href="chamadaservlet?acao=altera&ra=${aluno.ra}">ALTERAR</a></td>
						<td><a href="chamadaservlet?acao=exclui&ra=${aluno.ra}">EXCLUIR</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:if>
	<c:if test="${empty alunos}">
		<h1>Nenhum Aluno Cadastrado!!!</h1>
	</c:if>
	
</body>
</html>








