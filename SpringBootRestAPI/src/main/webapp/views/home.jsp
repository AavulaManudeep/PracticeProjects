<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Hello Welcome
<form:form method="post" modelAttribute="students" action="/save">
		<form:input path="name" type="text" /> <!-- bind to user.name-->
		<form:errors path="name" />
		<form:input path="id" type="number" />
		<form:errors path="id" />
		<form:input path="major" type="text" />
		<form:errors path="major" />
		<input type="submit">
	</form:form>
</body>
</html>