package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1.�̳�httpservlet
public class hello extends HttpServlet {
	//2.��д����
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("����get����");
		PrintWriter out =resp.getWriter();
		resp.setContentType("text/html;charset=utf-8");//ָ��������ַ���
		out.println("<h3>hello get</h3>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("����post����");
		PrintWriter out =resp.getWriter();
		resp.setContentType("text/html;charset=utf-8");//ָ��������ַ���
		out.println("<h3>hello post</h3>");
	}
}
