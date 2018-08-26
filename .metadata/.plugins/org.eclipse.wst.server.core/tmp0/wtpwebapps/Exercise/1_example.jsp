<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>servlet</title>
</head>
<body>
	<h1>servlet</h1>
	<hr>
	
	<!-- get请求 -->
	<a href="servlet/hello">Get方式请求hello</a><br>
	
	<!-- post请求 -->
	<form name="sdf" action="servlet/hello" method="post">
		<input type="submit" value="post方式请求" />
	</form>
</body>
</html>