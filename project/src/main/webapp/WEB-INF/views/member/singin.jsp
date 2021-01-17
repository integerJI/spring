<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%> <!-- @@@ 매우 중요 @@@ -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!-- src/main/webapp/WEB-INF/view/projectRegisterForm.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr"/>
<title>Sing Up !!!</title>
</head>
<body>
	<h1>Sing Up !!!</h1>
	<c:url var="insertUrl" value="#" />
	<form:form commandName="memberVO" action="${insertUrl}" name="memberVO" method="post">
	<table>
	<tbody>
	<tr>
	   <th>Id</th>
	   <td><form:input path="userId" id="userId" size="20" maxlength="20" /></td>
	</tr>
	<tr>
	   <th>Password</th>
	   <td><form:password path="userPassword" id="userPassword" /></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="회원가입" /></td>
	</tr>
	</tbody>
	</table>
	</form:form>
</body>
</html>
