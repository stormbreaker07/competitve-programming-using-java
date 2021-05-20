<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: stormbreaker
  Date: 02/05/21
  Time: 4:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Subject</title>
</head>
<body>

<a href="/glucose/" >goBack</a>
<h1>Subject in year ${yearAndSem.year} and semester ${yearAndSem.year}</h1>

<form:form modelAttribute="listObject">

    <table>
        <c:forEach items="${listObject.list}" var="item">
            <tr>
                <td><c:out value="${item.toString()}" /></td>
            </tr>
        </c:forEach>
    </table>

</form:form>



</body>
</html>
