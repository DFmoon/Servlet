<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>reg</title>
</head>
<body>
	<h1>注册</h1>
	<hr>
	<form name="sdf" action="servlet/reg" method="post">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="username"/></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="password"/></td>
			</tr>
			<tr>
				<td>确认密码：</td>
				<td><input type="password" name="confirmpass"/></td>
			</tr>
			<tr>
				<td>邮箱：</td>
				<td><input type="text" name="emial"/></td>
			</tr>
			<tr>
				<td>性别：</td>
				<td>
					<input type="radio" name="gender" value="Male" checked="checked"/>男&nbsp;&nbsp;
					<input type="radio" name="gender" value="Female"/>女&nbsp;&nbsp;
				</td>
			</tr>
			<tr>
				<td>爱好：</td>
				<td>
					<input type="checkbox" name="favorites" value="read"/>阅读&nbsp;&nbsp;
					<input type="checkbox" name="favorites" value="movie"/>电影&nbsp;&nbsp;
					<input type="checkbox" name="favorites" value="music"/>音乐&nbsp;&nbsp;
					<input type="checkbox" name="favorites" value="run"/>跑步&nbsp;&nbsp;
				</td>
			</tr>
			<tr>
				<td>自我介绍：</td>
				<td><textarea name="introduce" rows="10" cols="40"></textarea></td>
			</tr>
			<tr>
				<td>是否接受注册协议：</td>
				<td><input type="checkbox" name="isAccept" value="true"/>接受</td>
			</tr>
			<tr>
				<td><input type="submit" value="注册"/></td>
				<td><input type="reset" value="取消" /></td>
			</tr>
		</table>
	</form>
</body>
</html>