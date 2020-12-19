<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.anc.entities.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modifier un profile</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>
	<h1>Modification d'un profile</h1>
<%
	anc a = (anc)request.getAttribute("a");
%>
	<form action="modifier" method="post" class="form-container">
		<div class="form-row">
			<div class="form-group">
				<!-- label for="code">Code</label--> <input type="hidden" class="form-control"
					id="id" name="id" value="<%=a.getCode() %>" readonly="readonly" />
			</div>		
			<div class="form-group col-md-4">
				<label for="nom">Nom</label> <input type="text" class="form-control"
					id="nom" name="nom"  value="<%=a.getNom() %>" />
			</div>
			<div class="form-group col-md-4">
				<label for="prenom">Prix</label> <input type="text"
					class="form-control" id="prenom" name="prenom"  value="<%=a.getPrenom() %>" />
			</div>
			<div class="form-group col-md-4">
				<label for="age">Prix</label> <input type="text"
					class="form-control" id="age" name="age"  value="<%=a.getAge() %>" />
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</div>
	</form>
</body>
</html>