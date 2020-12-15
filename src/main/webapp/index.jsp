<%-- <%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<jsp:forward page="/loginPage.do"/> --%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="<c:url value='/guest/guest.do'/>">GUEST</a>
	<a href="<c:url value='/member/member.do'/>">MEMBER</a>
	<a href="<c:url value='/admin/admin.do'/>">ADMIN</a>
</body>
</html>