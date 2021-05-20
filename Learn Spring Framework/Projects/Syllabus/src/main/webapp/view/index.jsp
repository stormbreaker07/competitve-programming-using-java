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

<h1>Write year and sem</h1>

<form:form action ="year/sem" modelAttribute="yearAndSem" method="post" >
    Year:
    First Year<form:checkbox path="year" value="1"/>
<br/>
    Second Year<form:checkbox path="year" value="2"/>
    <br/>
    Third Year<form:checkbox path="year" value="3"/>
    <br/>
    Fourth Year<form:checkbox path="year" value="4"/>
    <br/><br/>
    Year:
    First Semester<form:checkbox path="sem" value="1"/>
    <br/>
    Second Year<form:checkbox path="sem" value="2"/>
    <br/><br/>

    <input type="submit" name="submit" />
</form:form>

