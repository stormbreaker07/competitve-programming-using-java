<%--
  Created by IntelliJ IDEA.
  User: stormbreaker
  Date: 27/04/21
  Time: 11:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login Form</title>
</head>
<body>

<form action="hello/processform2" method="get">
  firstname : <input name="firstName" type="text" placeholder="what is your first name"/>
  <br/><br/>
  lastname : <input name="lastName" type="text" placeholder="what is your last name"/>
  <br/><br/>
  email : <input name="email" type="email" placeholder="what is your email id"/>
  <br/><br/>
  password : <input name="password" type="password" placeholder="what is your password"/>
  <br/><br/>
  <input name="submit" type="Submit"/>

</form>

</body>
</html>
