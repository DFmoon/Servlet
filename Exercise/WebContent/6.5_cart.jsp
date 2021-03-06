<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<%@ page import="entity.Cart" %>
<%@ page import="entity.Items" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>cart</title>
		<script type="text/javascript">
			function delete_confirm(){
				if(!confirm("确认删除？")){
					window.event.returnValue=false;
				}
			}
		</script>
  </head>
  
  <body>
    <h1>我的购物车</h1>
    <hr>
    	<a href="6.1_index.jsp">首页</a>>><a href="6.1_index.jsp">商品列表</a><br><br>
    	<div id="shopping">
    		<form action="" method="">
    			<table>
    				<tr>
    					<th>商品名称</th>
    					<th>商品单价</th>
    					<th>购买数量</th>
    					<th>商品总价</th>
    					<th>操作</th>
    				</tr>
    				<%
    					//判断session是否存在购物车对象
    					if(request.getSession().getAttribute("cart")!=null)
    					{
    						Cart c=(Cart)request.getSession().getAttribute("cart");
    						HashMap<Items,Integer> goods=c.getGoods();
    						Set<Items> items=goods.keySet();
    						Iterator<Items> it=items.iterator();
    						while(it.hasNext()){
    							Items i=it.next();
    				%>
    				<!-- 循环的开始 -->
    				<tr name="products" id="product_id_1">
    					<td><%=i.getName() %></td>
    					<td><%=i.getPrice() %></td>
    					<td><%=goods.get(i) %></td>
    					<td id="price_id_1"><%=i.getPrice()*goods.get(i) %></td>
    					<td><a href="servlet/CartServlet?action=delete&&id=<%=i.getId() %>" onclick="delete_confirm();">删除</a></td>
    				</tr>
    				<!-- 循环的结束 -->
    					<%}%>
    			</table>
    			<div>总价：<%=c.calTotal() %></div>
    			<%} %>
    			<div><input type="submit" value="提交" / ></div>
    		</form>
    	</div>
  </body>
</html>
