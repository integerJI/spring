<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%> <!-- @@@ 매우 중요 @@@ -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
</html>
<head>
	<h1>singup start</h1>
</head>
<body>
<form action="/member/singup" method="post">
		<label class="control-label" for="userId">아이디</label>
		<input class="form-control" type="text" id="userId" name="userId" />
		<br>
		<label class="control-label" for="userPass">패스워드</label>
		<input class="form-control" type="password" id="userPass" name="userPass" />
		<br>
		<label class="control-label" for="userName">성명</label>
		<input class="form-control" type="text" id="userName" name="userName" />
		<br>
		<button class="btn btn-success" type="submit" id="submit">회원가입</button>
</form>

</body>	