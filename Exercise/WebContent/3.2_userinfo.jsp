<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>userinfo</title>
</head>
<body>
	<h1>用户信息</h1>
	<hr>
	<jsp:useBean id="reguser" class="entity.users" scope="session"></jsp:useBean>
	用户名：<jsp:getProperty name="reguser" property="username" /><br>
	密码：<jsp:getProperty name="reguser" property="password" /><br>
	性别：<jsp:getProperty name="reguser" property="gender" /><br>
	邮箱：<jsp:getProperty name="reguser" property="email" /><br>
	爱好：<%
			String[] fav=reguser.getFavorites();
			for(String f:fav){
				out.println(f+"&nbsp;&nbsp;");
			}
		  %><br>
	自我介绍：<jsp:getProperty name="reguser" property="introduce" /><br>
	是否接受注册协议：<jsp:getProperty name="reguser" property="isAccept" /><br>
</body>
</html>