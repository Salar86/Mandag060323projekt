<%--
  Created by IntelliJ IDEA.
  User: Salar Salim
  Date: 08-03-2023
  Time: 08:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Admin siden</title>
</head>
<body>
<h1>Velkommen til admin siden</h1>


<br>
<style>
    table {
        font-family: arial, sans-serif;
        border-collapse: collapse;
        width: 100%;
    }

    td, th {
        border: 1px solid #dddddd;
        text-align: left;
        padding: 8px;
    }

    tr:nth-child(even) {
        background-color: #dddddd;
    }
</style>


<table>
    <tr>
        <th>Navn</th>
        <th>Valg</th>

    </tr>
            <c:forEach var="person" items="${applicationScope.personMap}">
        <tr>
            <td> ${person.value.name}</td>
            <td>

                <form action="ServletRemoveUser">
                    <input type="text" hidden name="valg" value="${person.value.name}">
                    <br>
                    <input type="submit" value="Slet">
                </form>

                <form action="ServletEdit">
                    <input type="text" hidden name="Valg" value="${person.value.name}">
                    <br>
                    <input type="submit" value="Edit">
                </form>

            </td>
        </tr>
            </c:forEach>
</table>

</body>
</html>
