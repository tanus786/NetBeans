<%-- 
    Document   : first
    Created on : 16-May-2023, 9:48:02 pm
    Author     : tanus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background: beige">
        <h1>First JSP Page</h1>
<!--Declarative tag-->
        <%!
            int a = 10;
            int b = 98;
            String name = "Tanu";

            public int sum() {
                return a + b;
            }

            public String reverse() {
                StringBuffer br = new StringBuffer(name);
                return br.reverse().toString();
            }
        %>
<!--Scriptlet tag-->
        <%
            out.println(a);
            out.println("<br>");
            out.println(b);
            out.println("<br>");
            out.println(sum());
            out.println("<br>");
            out.println(reverse());
            %>
            
<!--Expressive Tag-->

<h1 style="color: red">Sum = <%= sum() %></h1>

<!--Directive Tags-->


    </body>
</html>
