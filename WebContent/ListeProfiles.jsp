<%@page import="java.util.*" %>
<%@page import="com.anc.entities.*" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>
<center><h1>Liste des profiles</h1></center>
<a href="ajouter" class="btn btn-warning">Créer</a>
<%
	Collection<anc> ancs = (Collection<anc>)request.getAttribute("ancs");
%>
<table class="table table-striped">
	<tr>
		<th>Code</th><th>Nom</th><th>Prenom</th><th>Age</th>
	</tr>
<%
	for(anc p : ancs){
%>
	<tr>
		<td><%=p.getCode() %></td><td><%=p.getNom() %></td><td><%=p.getPrenom() %></td><td><%=p.getAge() %></td>
		<td><a href="modifier?id=<%=p.getCode() %>" class="btn btn-success">Modifier</a>
		<a href="supprimer?id=<%=p.getCode() %>" class="btn btn-danger">Supprimer</a></td>
	</tr>
<%
	}
%>
</table>
</body>
</html>