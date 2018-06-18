<#import "templates/spring.ftl" as spring />

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Esamo patiekalo redagavimas</title>
	</head>
	<body>
		<@spring.bind "user"/>
        <#if noErrors??>
            Ivesti duomenys<br>
            Id: ${user.id}<br>
            Grupe: 	${user.grupe}<br>
            Pavadinimas: ${user.pavadinimas}<br>
            Kalorijos: 	${user.kalorijos}<br>     
            Kaina: 		${user.kaina}<p>
            <a href="/FirstProject/users">Rodyti meniu</a>
        <#else>		
			<form name="user" action="/FirstProject/updateUser" method="post">
				ID:<br>
				<@spring.formInput "user.id"/>
                <@spring.showErrors "<br>"/><p>
				Grupe:<br>
				<@spring.formInput "user.grupe"/>
                <@spring.showErrors "<br>"/><p>
                Pavadinimas:<br>
				<@spring.formInput "user.pavadinimas"/>
                <@spring.showErrors "<br>"/><p>
				Kalorijos:<br>
			    <@spring.formInput "user.kalorijos"/>
            	<@spring.showErrors "<br>"/><p>
				Kaina:<br>
				<@spring.formInput "user.kaina"/>
            	<@spring.showErrors "<br>"/><p>
				<input type="submit" value="redaguoti">	
			</form>
		</#if>
	</body>
</html>

	