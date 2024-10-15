<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>예약 창</h2>
	<form action="/reservation" method="POST">
		영화 제목 : <input type="text" name="movieName">
		시작 시간 : <input type="text" name="startTime">
		예약자 명 : <input type="text" name="name">
		
		<button> 예약하기 </button>
	
	</form>
 
</body>
</html>