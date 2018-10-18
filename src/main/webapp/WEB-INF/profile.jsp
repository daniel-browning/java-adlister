<%--
  Created by IntelliJ IDEA.
  User: danielbrowning
  Date: 10/17/18
  Time: 8:06 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
<jsp:include page="../partials/navbar.jsp" />

<div class="container">
    <h1>Viewing your profile.</h1>
    <h2>Welcome, ${sessionScope.username}</h2>
</div>

</body>
</html>
