<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 04.01.2018
  Time: 8:09
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<h1>Add a new Category</h1>

<%--@elvariable id="category" type="ua.com.dudaryk.model.Category"--%>
<form:form method="post" modelAttribute="category">
    <p>
        Name:
        <input type="text" name="name"/>
        <form:errors path="name" cssclass="error"><span id="name.errors"
                                                        cssclass="error">may not be empty</span></form:errors>
    </p>

    <input type="submit"/>
</form:form>
</body>
</html>
