<%-- 
    Document   : error_page
    Created on : 21-May-2023, 8:15:29 pm
    Author     : tanus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage = "true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sorry!! Something Went Wrong!! </title>
        <style>
            *{
                padding: 0px;
                margin: 0px;
            }
        </style>
    </head>
    <body>
        <div style="padding: 20px; color: blue; background: #e2e2e2;">
        <h1>Sorry!! Something Went Wrong!!</h1>
        <br/>
        <p><%= exception%></p>
        </div>
    </body>
</html>
