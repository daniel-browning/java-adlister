<%--
  Created by IntelliJ IDEA.
  User: danielbrowning
  Date: 10/12/18
  Time: 12:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads</title>
</head>
<body>

List<Ad> students = DaoFactory.getStudentsDao().findAll();

    String html ="";

    for (Student s: students) {
    System.out.println("s.getName() = " + s.getName());
    System.out.println("s.getDob() = " + s.getDob());
    html += "<h2>" + s.getName() + "</h2>";
    html += "<h2>" + s.getDob() + "</h2>";
    html += "<h2>" + s.getHeight() + "</h2>";
    }

    response.getWriter().println(html);
    }

</body>
</html>
