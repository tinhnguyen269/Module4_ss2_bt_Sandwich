<%--
  Created by IntelliJ IDEA.
  User: WIN 10
  Date: 15/07/2024
  Time: 9:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List condiments</h1>
<table>
    <c:forEach var="condiment" items="${condiments}" varStatus="status">
        <tr>
            <td>${condiment}</td>

        </tr>
    </c:forEach>
</table>
<a href="/sandwichs">Back to select</a>

</body>
</html>
