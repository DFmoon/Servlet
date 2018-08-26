<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>success</title>
  </head>
  
  <body>
    <h1>登录成功</h1>
    <hr>
	您成功购买了<%=request.getParameter("number") %>件商品编号为<%=request.getParameter("id") %>的商品
  </body>
</html>
