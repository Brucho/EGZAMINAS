<#import "templates/spring.ftl" as spring />
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Naujo patiekalo kurimas</title>
	</head>
	<body>
		<@spring.bind "user"/>
        <#if noErrors??>
            Ivesti duomenys<br>
            Grupe: 	${user.grupe}<br>
            Pavadinimas: ${user.pavadinimas}<br>
            Kalorijos: 	${user.kalorijos}<br>     
            Kaina: 		${user.kaina}<p>
            <a href="/FirstProject/users">Rodyti meniu</a>
        <#else>		
			<form name="user" action="/FirstProject/addUser" 	method="post">
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
				<input type="submit" value="prideti">
			</form>
		</#if>
	</body>
</html>
