<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="model.RegistrationFormDataModel" %>
<%@ page import="java.sql.ClientInfoStatus" %><%--
  Created by IntelliJ IDEA.
  User: stormbreaker
  Date: 12/05/21
  Time: 1:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
    <title>Title</title>
</head>
<body>

<table BORDER="1">
    <tr>
        <th>firstName</th>
        <th>lasName</th>
        <th>age</th>
        <th>email</th>
    </tr>

    <c:forEach items="${list}" var="temp" >
     <tr>
            <td><c:out  value="${temp.firstName}" /> </td>
            <td> ${temp.lasttName} </td>
            <td> ${temp.age} </td>
            <td> ${temp.email} </td>
        </tr>

    </c:forEach>
</table>


</body>
</html>
