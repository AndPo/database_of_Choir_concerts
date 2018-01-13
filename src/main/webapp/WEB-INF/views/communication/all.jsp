<%--
  Created by IntelliJ IDEA.
  User: Main
  Date: 12-Jan-18
  Time: 13:23
  To change this template use File | Settings | File Templates.
--%>
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
<h1>All Communications</h1>
<table border="1" class="class1">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>email</th>
        <th>phone</th>
        <th>membershipDate</th>
        <th>concert</th>
        <th>comment</th>
        <th>description</th>
    </tr>

    <c:forEach items="${communicationList}" var="communication">
        <tr>

            <td>${communication.communicationId}</td>
            <td>${communication.name}</td>
            <td>${communication.email}</td>
            <td>${communication.phone}</td>
            <td>${communication.membershipDate}</td>
            <td>${communication.concert}</td>
            <td>${communication.comment}</td>
            <td>${communication.description}</td>

        </tr>
        <br/>
    </c:forEach>
</table>
<h2>Add a new Communication</h2>

<form:form method="post" modelAttribute="communication">
    <p>
        Name:
        <input type="text" name="name"/>
        <form:errors path="name" cssclass="error"><span id="name.errors"
                                                        cssclass="error">may not be empty</span></form:errors>
    </p>
    <p>
        email:
        <input type="text" name="email"/>

    </p>
    <p>
        phone:
        <input type="text" name="phone"/>
    </p>
    <p>
        Date of membership:
        <input type="text" name="membershipDate"/>

    </p>
    <p>
        first met :
        <input type="text" name="concert"/>

    </p>
    <p>
        other information:
        <input type="text" name="comment"/>

    </p><p>
    Description:
    <input type="text" name="description"/>

</p>



    <input type="submit"/>
</form:form>
</body>
</html>
