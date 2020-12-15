<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>ADMIN 접근 가능페이지</h1>

	<!-- sec 를 사용하면 사용자에게만 로그아웃 버튼보임 -->
	<sec:authorize access="isAuthenticated()">
		<a href="#" onclick="document.getElementById('logout').submit();">로그아웃</a>
	</sec:authorize>


	<form id="logout" action="/logout" method="POST">
		<!-- 보안을 위해 모든 요청에 대한 토큰을 확인  -->
		<input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}" />
	</form>

</body>
</html>