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
<form:form method="post"  modelAttribute="student" action="/testing/registration">

<form:input path="id" type ="text"  placeholder="studentid"/>
<form:input path="name" type="text" placeholder="studentname"/>
<input type="submit"/>

</form:form>
</body>
</html>