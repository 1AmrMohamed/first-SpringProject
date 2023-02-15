<%-- 
    Document   : personData
    Created on : Sep 3, 2022, 3:39:52 PM
    Author     : administrator-lab3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

        <form action="displayData"> 
            name : <input type="text" name="personName" value="" />
            Age : <input type="text" name="personAge" value="" />
            <input type="submit" value="Register" />
        </form>
    </body>
</html>
