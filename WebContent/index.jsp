<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
</head>
<body>
<form action="demo1" method="post">
<input type="text" name="name">
<input type="text" name="age">
<input type="checkbox" name="hobby" value="a">
<input type="checkbox" name="hobby" value="b">
<input type="checkbox" name="hobby" value="c">
<a href="javascript:location.href='demo3?id=1&name='+encodeURIComponent('专硕')">跳转1</a>
<a href="demo4/1/专硕">跳转2</a>
<input type="submit" value="提交">
</form>
</body>
</html>