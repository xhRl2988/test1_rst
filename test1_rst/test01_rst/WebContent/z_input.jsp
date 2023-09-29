<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ include file="layout/db_connect.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>header</title>
	<link rel="stylesheet" type="text/css" href="css/style.css?ver1.4">
	<script type="text/javascript">
		function checkValue(){
			var cv = document.data;
			
			if(!cv.custno.value){
				alert("회원번호를 입력하세요.");
				cv.custno.focus();
				return false;
			}
			
			if(isNaN(cv.custno.value)){
				alert("회원번호는 숫자만 입력해야 합니다.");
				cv.custno.focus();
				return false;
			}
		}
	</script>
</head>
<body>
	<header>
		<jsp:include page="layout/header.jsp"></jsp:include>
	</header>
	
	<nav>
		<jsp:include page="layout/nav.jsp"></jsp:include>
	</nav>
	
	<main id="section">
		<h3 class="title">회원조회</h3>
		<form name="data" action="z_inquiry.jsp" method="post" onsubmit="return checkValue()">
			<table class="table_line">
				<tr>
					<th>회원번호입력</th>
					<td><input type="text" name="custno" autofocus></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="조회">
						<input type="reset" value="취소">
						<input type="button" value="회원 목록 조회/수정" onclick="location.href='member_list.jsp'"> 
					</td>
				</tr>
			</table>
		</form>
	</main>
	
	<footer>
		<jsp:include page="layout/footer.jsp"></jsp:include>
	</footer>
</body>
</html>