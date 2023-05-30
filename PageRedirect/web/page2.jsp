<%-- 
    Document   : page2
    Created on : 30-May-2023, 5:58:39 pm
    Author     : tanus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background: red">
        <h1>This is page 2</h1>
        <% 
//            Redirection Code
//            response.sendRedirect("page3.jsp");
            response.sendRedirect("https://www.google.com");
        
        %>
    </body>
</html>
