<%--
  Created by IntelliJ IDEA.
  User: stormbreaker
  Date: 12/04/21
  Time: 3:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
<%
String user = (String) session.getAttribute("user");
%>
<h1>bravo! <%=user%> </h1>
<br><h1>You are Successfully logined in</h1>
<h2>your username and password are correct</h2>
</body>
</html>
