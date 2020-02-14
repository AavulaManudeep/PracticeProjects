<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${title}</h1>
<h2>${message}</h2>
<c:if test = "${pageContext.request.userPrincipal.name != null}" >
	<h2>Welcome ${pageContext.request.userPrincipal.name} ,Now you are in Admin page
	<a href="/<c:url value="/logout"/>"></a>
	</h2>
</c:if>
</body>
</html>