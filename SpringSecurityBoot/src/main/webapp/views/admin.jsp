<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Welcome Home Admin
<span><a href="#">AddCustomer</a></span>
<span><a href="#">GetCustomerList</a></span>
<span>   <a onclick="document.forms['logoutForm'].submit()">Logout</a>
            </span>

    <form id="logoutForm" method="POST" action="/logout">
    </form>
</body>
</html>