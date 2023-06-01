<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>Function tag page</p>
        <c:set var = "name" value="tanu"></c:set>
        <h1><c:out value="${name}"></c:out></h1>
        <h1>Length of name is <c:out value="${fn:length(name)}"></c:out></h1>
        <c:out value="${fn:toUpperCase(name)}"></c:out>
        <c:out value="${fn:contains(name, 'an')}"></c:out>
    </body>
</html>
