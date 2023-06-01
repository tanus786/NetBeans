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
    </body>
</html>
