<%--
  Created by IntelliJ IDEA.
  User: stormbreaker
  Date: 12/05/21
  Time: 12:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<form method="Post" action="process-form">
<div align="center">
    <h5 style="color:red" > ${Warning}</h5>
    <br/>
    First Name: <input type="text" name="firstName"/>
    <br/><br/>
    Last Name: <input type="text" name="lastName"/>
    <br/><br/>
    Age: <input name="age" type="text">
    <br/><br/>
    Email: <input type="email" name="email"/>
    <br/><br/>
    Password: <input type="text" name="password"/>
    <br/><br/>
        <input type="submit" name="Submit" />

</div>
</form>


</body>
</html>
