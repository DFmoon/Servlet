package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.users;

public class login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		users user =new users();
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		user.setUsername(username);
		user.setPassword(password);
		
		//判断用户名和密码是否符合条件
		if(user.getUsername().equals("admin") && user.getPassword().equals("admin")){
			req.getRequestDispatcher("../4.2_login_success.jsp").forward(req, resp);
		}else{
			resp.sendRedirect(req.getContextPath()+"/4.3_login_fail.jsp");
		}
	}
}