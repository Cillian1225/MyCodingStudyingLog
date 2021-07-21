<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메세지 입력 발송 페이지입니다.</title>
</head>
<body>

<form action="inputProc" method="post">
<table border=3 align=center>
<tr>
	<th  align=center>메세지 발송하기
</tr>

<tr>
	<th><input type="text" name="writer" placeholder="작성자입력">
</tr>

<tr>
	<th><input type="text" name="message" placeholder="메세지입력">
</tr>

<tr>
	<td  align=center><button>메세지 보내기</button>
</tr>



</table>
</form>
</body>
</html>