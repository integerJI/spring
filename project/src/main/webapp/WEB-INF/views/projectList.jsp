<%@ page contentType="text/html; charset=euc-kr" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=euc-kr"/>
    <title>Home</title>
</head>

<body>
	<h1>Project List</h1>
	<a href="projectRegisterForm.do">글 쓰기</a>
	<br>
	<br>
	<div class="py-5 text-center container">
	
	
	<table class="table">
	  <thead>
	    <tr>
	    <th scope="col">번호</th>
	    <th scope="col">제목</th>
	    <th scope="col">작성일</th>
	    <th scope="col">수정</th>
	    <th scope="col">삭제</th>
	    </tr>
	  </thead>
	  <tbody>
		<c:forEach var="item" items="${list}">
		  <tr>
		    <td scope="col">${item.proId}</td>
		    <td scope="col"><a href="${path}/projectDetailForm.do?proId=${item.proId}">${item.proTitle}</a></td>
		    <td scope="col">${item.proDate}</td>
		    <td scope="col"><a href="${path}/projectUpdateForm.do?proId=${item.proId}">수정</a></td>
		    <td scope="col"><a href="${path}/projectDelete.do?proId=${item.proId}">삭제</a></td>
		  </tr>
		</c:forEach>
	  </tbody>
	</table>	
	</div>
</body>
</html>
