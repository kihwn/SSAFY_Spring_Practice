<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${empty reservationMovie}" >
		<a href="reservation">예약창</a>
		
	</c:if>
	
	<c:if test="${not empty reservationMovie}" >
		
		<form action="cancle" method="POST">
		
		
		<button> 예약취소 </button>
		</form>
	</c:if>
	

</body>
</html>