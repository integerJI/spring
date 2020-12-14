<%@ page contentType="text/html; charset=euc-kr" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=euc-kr"/>
    <title>Home</title>
</head>

<body>
<h1>Project List</h1>
<a href="projectRegisterForm.do">글 쓰기</a>
<table border="1">
<thead>
  <tr>
    <th>번호</th>
    <th>제목</th>
    <th>본문</th>
    <th>작성일</th>
  </tr>
</thead>
<tbody>
<c:forEach var="item" items="${list}">
  <tr>
    <td>${item.proId}</td>
    <td>${item.proTitle}</td>
    <td>${item.proBody}</td>
    <td>${item.proDate}</td>
  </tr>
</c:forEach>
</tbody>
</table>
</body>
</html>
