package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class test1
 */
@WebServlet("/test1")
public class test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public test1() {
       System.out.println("test1���췽����ִ��");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("test1��ʼ��������ִ��");
	}

	public void destroy() {
		System.out.println("test1���ٷ�����ִ��");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("test1��doGet();������ִ��");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out =response.getWriter();
		out.println("<!DOCTYPE HTML>");
		out.println("<HTML>");
		out.println("<HEAD><TITLE>A SERVLET</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<h1>test1</h1>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("test1��doPost();������ִ��");
		doGet(request, response);
	}

}