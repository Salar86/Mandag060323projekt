<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Velkommen" %></h1>
<br/>
<br/>
${requestScope.besked}
<br>
<br>
<form action="hello-servlet">
    <label for="uName">Angiv brugernavn:</label><br>
    <input type="text" id="uName" name="uName" value="John"><br>
    <label for="passW">Skriv adgangskode:</label><br>
    <input type="password" id="passW" name="passW" value="Doe"><br><br>
    <input type="submit" value="Login">
</form>
<br/>
${requestScope.msg}
<br>
<br>
<form action="hello-servlet" method="post">
    <label for="uName">Angiv brugernavn:</label><br>
    <input type="text" id="newName" name="newName" value="John"><br>
    <label for="passW">Skriv adgangskode:</label><br>
    <input type="password" id="newPassW" name="passW" value="Doe"><br><br>
    <label for="passW">Bekræft adgangskode:</label><br>
    <input type="password" id="confirmPassW" name="confirmPassW" value="Doe"><br><br>
    <input type="submit" value="Submit">
</form>
<br>
<br>
</body>
</html>