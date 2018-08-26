package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1.继承httpservlet
public class hello extends HttpServlet {
	//2.重写方法
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("处理get请求");
		PrintWriter out =resp.getWriter();
		resp.setContentType("text/html;charset=utf-8");//指定编码和字符集
		out.println("<h3>hello get</h3>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("处理post请求");
		PrintWriter out =resp.getWriter();
		resp.setContentType("text/html;charset=utf-8");//指定编码和字符集
		out.println("<h3>hello post</h3>");
	}
}
