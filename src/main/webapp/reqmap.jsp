<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello</h1>
<form action="/reqmap/ex5" method="post">
	<input type="text"> <br >
	<input type="submit" value="전송">
</form>

<hr>
<h3> /reqmap/ex6, get</h3>
<form action="/reqmap/ex6" method="get">
	<input type="submit" value-="전송">
</form>

<hr>
<h3> /reqmap/ex7, post</h3>
<form action="/reqmap/ex7" method="post">
	<input type="submit" value-="전송">
</form>
 
 
 
 
<hr>
<h3> /sample/basicOnlyGet, get</h3>
<form action="/sample/basicOnlyGet" method="get">
	<input type="submit" value-="전송">
</form>
</body>
</html>