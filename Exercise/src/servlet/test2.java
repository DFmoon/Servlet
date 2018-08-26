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
 * Servlet implementation class test2
 */
@WebServlet("/test2")
public class test2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public test2() {
    	System.out.println("test2构造方法被执行");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("test2初始化方法被执行");
	}

	public void destroy() {
		System.out.println("test2销毁方法被执行");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("test2的doGet();方法被执行");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out =response.getWriter();
		out.println("<!DOCTYPE HTML>");
		out.println("<HTML>");
		out.println("<HEAD><TITLE>A SERVLET</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<h1>test2</h1>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("test2的doPost();方法被执行");
		doGet(request, response);
	}

}
