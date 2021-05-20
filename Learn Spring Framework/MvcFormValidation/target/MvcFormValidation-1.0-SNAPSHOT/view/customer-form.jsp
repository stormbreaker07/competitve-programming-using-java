<%--
  Created by IntelliJ IDEA.
  User: stormbreaker
  Date: 28/04/21
  Time: 12:54 PM
  To change this template use File | Settings | File Templates.

--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer form</title>
  <style>
    .error{color:red}
  </style>

</head>
<body>
<form:form  action ="processForm" modelAttribute="customer" >

  first name :<form:input path="firstName"/>
  <br/><br/>
  last name(*) :<form:input path="lastName"/>
  <form:errors path="lastName" cssClass="error" />
  <br/><br/>
  <input type="submit" name="Submit"/>

</form:form>

</body>
</html>
