<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Vartotojo info</title>
	</head>
	<body class="container">
		<#include "templates/header.ftl">
		<div class="table-responsive">
			<caption>Vartotojo informacija</caption>
			<table class="table table-striped">
				<tr>
					<td><b>Id:</b></td>
					<td>${user.id}</td>
				</tr>
				<tr>
					<td><b>Grupe:</b></td>
					<td>${user.grupe}</td>
				</tr>
				<tr>
					<td><b>Pavadinimas:</b></td>
					<td>${user.pavadinimas}</td>
				</tr>
				<tr>
					<td><b>Kalorijos:<b></td>
					<td>${user.kalorijos}</td>
				</tr>
				<tr>
					<td><b>Kaina:<b></td>
					<td>${user.kaina}</td>
				</tr>
			</table>
		</div>
		<br>
		<a type="button" href="/FirstProject/users" class="button">Atgal</a>
	</body>
</html>
