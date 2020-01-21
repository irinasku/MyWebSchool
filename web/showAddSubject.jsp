<%-- 
    Document   : listSubjects
    Created on : Jan 21, 2020, 1:21:57 PM
    Author     : pupil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Добавление предмета</title>
    </head>
    <body>
        <h1>Создать предмет</h1>
        
        <form action="createSubject" method="POST">
            Название предмета:<br>
            <input type="text" name="name"><br>
            Учитель:<br>
            <input type="text" name="teacher"><br>
            <input type="submit" name="Создать предмет"><br>
        </form>
    </body>
</html>
