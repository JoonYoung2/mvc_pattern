<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="resources/css/styles.css">
<title></title>
</head>
<body>
<a href="login">로그인</a> | <a href="join">회원가입</a> 
<br>
${msg }<br>
<form action="join.do" method="post">
	아이디 : <input type="text" name="user_id"><br>
	비밀번호 : <input type="password" name="user_pw"><br>
	이메일 : <input type="text" name="user_email"><br>
	이름: <input type="text" name="user_name"><br>
	<button type="submit">회원가입</button>
</form>
</body>
</html>