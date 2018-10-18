<%--
  Created by IntelliJ IDEA.
  User: danielbrowning
  Date: 10/17/18
  Time: 8:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <a class="navbar-brand" href="/ads">Adlister</a>
        </div>
        <ul class="nav navbar-nav navbar-right">
            <c:if test="${sessionScope.username == null}">
                <li><a href="/login">Login</a></li>
            </c:if>
            <span>${sessionScope.username}</span>
            <c:if test="${sessionScope.username != null}">
                <li><a href="/logout">Logout</a></li>
            </c:if>
        </ul>
    </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
