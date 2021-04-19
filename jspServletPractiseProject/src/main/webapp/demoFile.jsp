<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: stormbreaker
  Date: 11/04/21
  Time: 7:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Practising JSP</title>
</head>
<body>

<%!
int add(int a , int b ) {
    return a+b;
}

%>
<h1>It is just to practising Java server page</h1>
<%
    int x = 1;
    int y = 23;
    out.println(x*y);
    %>
<%
    int k = add(234 ,4545);
    String user = request.getParameter("username");
    session.setAttribute("username" ,user);
    String SessionUser = (String) session.getAttribute("username");

%>

<h1> todays date is <%=new Date() %></h1>
<h2>the user name is <%=user%> .</h2>
<h2>the user name is <%=SessionUser%> .</h2>
<h3> the value of thirty four is <%=k %> </h3>
</body>
</html>
