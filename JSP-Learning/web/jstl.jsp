<%-- 
    Document   : jstl
    Created on : 20-May-2023, 10:05:10 pm
    Author     : tanus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage = "error_page.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TagLib Directive</title>
    </head>
    <body>
        <h1>Taglib Directive :</h1>
        <hr>
        <c:set var = "name" value="Tanu"></c:set>
        <c:out value="${name}" ></c:out>
        <c:if test="${3>2}">
            <h2>True</h2>
        </c:if>
        <c:out value="${45+98}"></c:out>
        
    <!--Error Handling in JSP-->
    
        <%! int n1 = 20;
            int n2 = 10;
            String content = null;
        %>
        <%
            int division = n1/n2;
            %>
            <h1>Division = <%= division %></h1>
            <%= content.length()%>
    </body>
</html>
