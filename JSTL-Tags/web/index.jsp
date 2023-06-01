<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>This is JSTL Example</h1>
        <!--1.Out Tag-->

        <!--2. Set Tag-->

        <c:set var = "i" value="22" scope="application"></c:set>
        <h1><c:out value="${i}"></c:out></h1>

            <!--3. Remove tag-->


            <h1><c:out value="${i}">This is Default Value</c:out></h1>
            <hr><!-- comment -->

            <!--4. If  Tag-->
        <c:if test="${i==22}">
            <h1>I is 22 and Condition is True</h1>
        </c:if>
        <!--5. Choose, When , Otherwise ==> Switch-->

        <c:choose>
            <c:when test="${i>0}">
                <h1>This is my case first And number is positive.</h1>
            </c:when>
            <c:when test="${i<0}">
                <h1>This is my case Second And number is negative.</h1>
            </c:when>
            <c:otherwise>
                <h1>This is my case third(default) And number is zero.</h1>
            </c:otherwise>
        </c:choose>

        <!--6. Loop tag-->
        <c:forEach var = "j" begin="1" end="10">
            <h1>Value of j is <c:out value="${j}"></c:out></h1>
        </c:forEach>
        <!--7. Redirect Tag-->
        <!--8. URL and Param tag-->
        <c:url var = "myurl" value="https://www.google.com/search">
            <c:param name = "q" value="coding"></c:param>
        </c:url>
        <c:out value="${myurl}"></c:out>
        <c:redirect url="${myurl}"></c:redirect>
    </body>
</html>
