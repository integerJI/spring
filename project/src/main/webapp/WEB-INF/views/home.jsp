<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%> <!-- @@@ 매우 중요 @@@ -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<!-- <a href="projectList.do">글 목록 이동</a> -->
<a href="/singin">로그인 이동</a>
<a href="/singup">회원가입 이동</a>

</body>
</html>
