<%--
  Created by IntelliJ IDEA.
  User: danielbrowning
  Date: 10/11/18
  Time: 10:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    String user = request.getParameter("username");
    String password = request.getParameter("password");

    if (user != null && password != null) {

        if (user.equals("admin") && password.equals("password"))
            response.sendRedirect("/profile.jsp");
    }
%>

<html>
<head>
    <title>Login</title>
</head>
<body>

<%--below code is good for testing
<%= user %>
<%= password %>
--%>

    <form action="/login.jsp" method="post">
        <label for = "username">Username:</label>
        <input type="text" id = "username" name="username">
        <label for = "password">Password:</label>
        <input type="password" id = "password" name="password">
        <input type="submit" value="Submit">
    </form>


</body>
</html>
