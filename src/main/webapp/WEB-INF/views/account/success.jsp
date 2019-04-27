<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Conta Cadastrada</title>
</head>
<body>
	<h3>Conta Cadastrada com Sucesso</h3>

	<table cellpadding="1" cellspacing="0" border="1">
		<tr>
			<td>Username</td>
			<td>${account.username }</td>
		</tr>
		<tr>
			<td>Nome Completo</td>
			<td>${account.fullname }</td>
		</tr>
		<tr>
			<td>Aniversário</td>
			<td><fmt:formatDate value="${account.birthday }" var="birthday"
					pattern="MM/dd/yyyy" />${birthday }</td>
		</tr>
	</table>

</body>
</html>