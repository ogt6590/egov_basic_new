 <%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %> <!-- 시큐리티 기능을 jsp 페이지에 사용할떄 사용  -->
 
<sec:authorize access="isAnonymous()"> <!-- 인증 하지 않은 사용자만 보여줘라  -->
    <h5><a href='<c:url value="/loginPage.do"/>'>LOGIN</a> 로그인 해주세요.</h5>
</sec:authorize>

