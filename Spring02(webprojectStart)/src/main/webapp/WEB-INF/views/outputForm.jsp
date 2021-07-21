<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PersonList Page</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>

</head>
<body>
	<form action="" method="post" id=listFrm>
		<table border=3 align=center colspan=3>
			<tr>
				<td colspan=3 align=center>PersonList
			</tr>

			<tr>
				<td>Id
				<td>Name
				<td>Contact
			</tr>

			<c:forEach var="i" items="${list}">
				<tr>
					<td>${i.id}
					<td>${i.name}
					<td>${i.contact}
				</tr>
			</c:forEach>


			<tr>
				<td>수정
				<td><input type=text placeholder="대상아이디" name="id"> <input
					type=text placeholder="대상이름" name="name"> <input type=text
					placeholder="대상연락처" name="contact">
				<td><button type="button" id="modify">수정</button>
			</tr>

			<tr>
				<td>삭제
				<td><input type=text placeholder="삭제 대상 ID" name="delid"> 
				<td><button type="button" id="delete">삭제</button>
			</tr>


			<tr>
				<td colspan=3 align=center><a href="/">home</a>
			</tr>
		</table>
	</form>
	<script>
		$("#modify").on("click", function() {
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