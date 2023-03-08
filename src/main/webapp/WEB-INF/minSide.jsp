<%--
  Created by IntelliJ IDEA.
  User: Salar Salim
  Date: 06-03-2023
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
dit sessionsid er ${requestScope.id}
dit navn er ${sessionScope.brugere.name} og din kode er ${sessionScope.kode}
<br>
<br>
<h1>Velkommen ${requestScope.navn}</h1>
<br>
<br>
${requestScope.besked}
<br>
<br>
<form action="ServletLogOut">
    <input type="submit" value="Log af">
</form>
<br>
<br>
<form action="ServletOversigt" method="get">

    <input type="submit" value="Admin">
</form>

</body>
</html>
