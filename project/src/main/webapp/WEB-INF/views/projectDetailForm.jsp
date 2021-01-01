<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%> <!-- @@@ 매우 중요 @@@ -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!-- src/main/webapp/WEB-INF/view/projectRegisterForm.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr"/>
<title>Home</title>
</head>
<body>
	<h1>Project detail</h1>
<c:forEach var="item" items="${list}">
  <tr>
    <td>${item.proId}</td>
    <td>${proId.proTitle}</td>
    <td>${item.proBody}</td>
    <td>${item.proDate}</td>
    <td><a href="${path}/projectUpdateForm.do?proId=${item.proId}">수정</a></td>
    <td><a href="${path}/projectDelete.do?proId=${item.proId}">삭제</a></td>
  </tr>
</c:forEach>
</body>
</html>
