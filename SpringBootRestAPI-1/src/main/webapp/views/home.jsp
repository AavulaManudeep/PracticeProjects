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
<form:form method="post" modelAttribute="Employee" action="/addEmployee">
		<form:input path="firstname" type="text" /> <!-- bind to user.name-->
		<form:errors path="firstname" />
		<form:input path="lastname" type="text" />
		<form:errors path="lastname" />
		<form:input path="phonenumber" type="text" />
		<form:errors path="phonenumber" />
		<input type="submit">
	</form:form>
</body>
</html>