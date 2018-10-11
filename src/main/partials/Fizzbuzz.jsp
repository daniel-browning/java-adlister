<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var = "item" begin = "1" end = "30">
    <c:choose>

        <c:when test = "${item % 15 = 0}">
        <p>Fizzbuzz</p>
        c:when test = "${item % 3 = 0}">
        <p>Fizz</p>
        c:when test = "${item % 5 = 0}">
        <p>Buzz</p>
        <c:otherwise>
            <p>${item}</p>
        </c:otherwise>
    </c:choose>
</c:forEach>

