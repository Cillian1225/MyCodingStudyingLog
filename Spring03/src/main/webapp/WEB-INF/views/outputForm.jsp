<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>보낸메세지함</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
</head>
<body>
<form action="" method="post" id="listFrm">
<table border=3 align=center  colspan=3>
		<tr>
			<td colspan=3 align=center>Message History
		</tr>

		<tr>
			<td>Id
			<td>Writer
			<td>Message
		</tr>
		
		<c:forEach var="i" items="${list}">
			<tr>
			<td>${i.id}
			<td>${i.writer}
			<td>${i.message}
			</tr>
		</c:forEach>
		
		
		<tr>
		<td>수정
		<td><input type="text" placeholder="대상아이디" name="id">		
		<input type="text" placeholder="대상발신자" name="writer">		
		<input type="text" placeholder="발신메세지" name="message">
		<td><button type="button" id="modify">수정</button>		
		</tr>
		
		<tr>
		<td>삭제
		<td><input type="text" placeholder="삭제대상아이디" name="delid">		
		<td><button type="button" id="delete">삭제</button>		
		</tr>
		
		
		
		
		<tr> 
			<td colspan=3 align=center><a href="/">home</a>
		</tr>
	</table>
	</form>
	<script>
	$("#modify").on("click",function(){
		$("#listFrm").attr("action","modifyProc");
		$("#listFrm").submit();
		
	})
	
	$("#delete").on("click",function(){
		$("#listFrm").attr("action","deleteProc");
		$("#listFrm").submit();
		
	})
	</script>

</body>
</html>