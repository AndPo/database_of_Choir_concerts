<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <style type="text/css">
        h1 {
            color: firebrick;
            font-family: Arial;
            font-size: 50px;
            text-align: center;
        }

        .class1 {
            border: 4px outset firebrick;
            padding: 10px;

        }

        th.class1 {
            color: antiquewhite;
        }
    </style>
</head>
<body>
<h1>Category list</h1>
<table border="1" class="class1">
    <tr>
        <th>Id</th>
        <th>Name</th>
    </tr>

    <c:forEach items="${categoryList}" var="category">
        <tr>

            <td>${category.categoryId}</td>
            <td>${category.name}</td>
        </tr>
        <br/>
    </c:forEach>
</table>

<h2>Add a new Category</h2>

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
