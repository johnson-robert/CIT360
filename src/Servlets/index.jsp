<%-- 
    Document   : index
    Created on : Mar 8, 2019, 4:06:47 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login Page </title>
    </head>
    <body>
        <form action="add" method="get">
            <input type="text" name="one" /><br>
            <input type="text" name="two" /><br>
            <input type="submit" name="button"  value="Add"/><br>
        </form>
        <% Object name = request.getAttribute("name");
           out.println("Attribute Value : " +name);
     %>
     <P>$name</p>
    </body>
</html>
