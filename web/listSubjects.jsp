<%-- 
    Document   : listSubjects
    Created on : Jan 21, 2020, 2:24:44 PM
    Author     : pupil
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Список предметов</title>
    </head>
    <body>
        <h1>Список предметов</h1>
        <c:forEach var="subject" items="${listSubjects}">
            <p>${subject}</p>
        </c:forEach>
    </body>
</html>
