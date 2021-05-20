<%--
  Created by IntelliJ IDEA.
  User: stormbreaker
  Date: 27/04/21
  Time: 4:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student form</title>
</head>
<body>

<form:form action="ProcessForm3" method="get" modelAttribute="student">
  First Name<form:input path="firstName" />
  <br/><br/>
  Last Name<form:input path="lastName" />
  <br/><br/>
  <input type="submit" name="Submit" />
</form:form>

</body>
</html>
