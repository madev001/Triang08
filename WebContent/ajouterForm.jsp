<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajouter un produit</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>
	<h1>Création d'un produit</h1>
	<form action="ajouter" method="post" class="container-fluid" enctype="multipart/form-data">
	 
		<div class="form-row">
			<div class="form-group col-md-4">
				<label for="nom">Nom</label> <input type="text" class="form-control"
					id="nom" name="nom" />
			</div>
			<div class="form-group col-md-4">
				<label for="prenom">prenom</label> <input type="text"
					class="form-control" id="prenom" name="prenom" />
			</div>
			<div class="form-group col-md-4">
				<label for="age">age</label> <input type="text"
					class="form-control" id="age" name="age" />
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</div>
		 File:
            <input type="file" name="file" id="file" /> <br/>
            Destination:
            <input type="text" value="/tmp" name="destination"/>
            </br>
	</form>
</body>
</html>