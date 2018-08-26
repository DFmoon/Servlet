package servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.users;

@WebServlet("/reg")
public class reg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		users user=new users();
		String username,password,email,gender,introduce;
		String[] favorites;
		String[] isAccept;
		try{
			
			//获取属性值
			username=request.getParameter("username");
			password=request.getParameter("password");
			email=request.getParameter("email");
			gender=request.getParameter("gender");
			introduce=request.getParameter("introduce");
			//获取多个复选框的值，接受的是一个字符串数组
			favorites=request.getParameterValues("favorites");
			isAccept=request.getParameterValues("isAccept");
			
			//给user对象的属性赋值
			user.setUsername(username);
			user.setPassword(password);
			user.setEmail(email);
			user.setGender(gender);
			user.setIntroduce(introduce);
			user.setFavorites(favorites);
			if(isAccept!=null){
				user.setisAccept(true);
			}else{
				user.setisAccept(false);
			}
			
			//将注册成功的用户保存在session中
			request.getSession().setAttribute("reguser", user);
			
			//页面请求转发
			request.getRequestDispatcher("../3.2_userinfo.jsp").forward(request, response);
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
