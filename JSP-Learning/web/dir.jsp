<%-- 
    Document   : dir
    Created on : 20-May-2023, 9:29:19 pm
    Author     : tanus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--Page Directive tag-->

<%@page import="java.util.Random,java.util.ArrayList" %>
<%--<%@page isErrorPage = "true" %>
<%@page session = "false" %>
<%@page extends = "classname" %>--%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            *{
                margin: 0px;
                padding: 0px;
            }
        </style>
    </head>
    <body>
        
        <!--Include Directive Tag-->

        <%@include file ="header.jsp" %>
        <%@include file ="header.jsp" %>
        
        
        <h1>Random number :
            <%
                Random r = new Random();
                int n = r.nextInt(10);
            %>
            
            <%= n %>
        
        
        </h1>
    </body>
</html>