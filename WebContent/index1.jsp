<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="demo2" method="post">
<input type="text" name="users[0].name">
<input type="text" name="users[0].age">
<input type="text" name="users[1].name">
<input type="text" name="users[1].age">
<!-- <input type="text" name="user.name">
<input type="text" name="user.age"> -->
<input type="submit" value="提交">
</form>
</body>
</html>