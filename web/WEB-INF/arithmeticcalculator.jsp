<%-- 
    Document   : arithmeticcalculator
    Created on : 23-Jan-2023, 10:26:41 AM
    Author     : Kelsey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First:<input type="number" name="firstnum"> <br>
            Second:<input type="number" name="secondnum"><br>
            <input type="submit" name="math" value="+">
            <input type="submit"  name="math" value="-">
            <input type="submit"  name="math" value="*">
            <input type="submit"  name="math" value="%">   
        </form>
        <p>${message}</p>
        <a href="age"> Age Calculator</a>
    </body>
</html>
