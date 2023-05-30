
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/tlds/MyLib" prefix="t" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <t:myTag></t:myTag>

        <t:printTable number = "2" color = "blue"> </t:printTable>
        <t:printTable number = "21" color = "red"> </t:printTable>

            <!--        JSP Implicit Objects-->

        <%
//            out.println("This is my implicit object");
//            request.getParameter("");
//            response.sendRedirect("");
//            config.getInitParameter("");
//            application.wait();
//            session.isNew();
//            session.setAttribute("name", 23);
//            page.getClass();
//            exception.wait();
//            pageContext.getClass();
            
        %>


    </body>
</html>
