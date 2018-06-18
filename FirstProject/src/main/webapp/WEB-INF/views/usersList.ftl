<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Vartotojai</title>
	</head>
	<body class="container">
		<h1>MENIU</h1>
		<#include "templates/header.ftl">
		<div class="table-responsive">
		<table class="table">
		<thead class="thead-dark">
			<tr>
				<th>Id</th>
				<th>Grupe</th>
				<th>Pavadinimas</th>
				<th>Kalorijos</th>
				<th>Kaina</th>
				
			</tr>
			<#list users as user>
				<tr>
					<td><a href="/FirstProject/user/${user.id}">${user.id}</a></td>
					<td>${user.grupe}</td>
					<td>${user.pavadinimas}</td>
					<td>${user.kalorijos}</td>
					<td>${user.kaina}</td>
					<td><a href="/FirstProject/delete/${user.id}" class="btn btn-danger btn-block btn-sm">Trinti</a></td>
					<td><a href="/FirstProject/update/${user.id}" class="btn btn-primary btn-block btn-sm">Redaguoti</a></td>
				</tr>
			</#list>
		</table>
		<p>
		<a href="/FirstProject/addUser">Sukurti</a>
	</body>
</html>

