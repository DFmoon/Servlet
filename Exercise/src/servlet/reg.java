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
			
			//��ȡ����ֵ
			username=request.getParameter("username");
			password=request.getParameter("password");
			email=request.getParameter("email");
			gender=request.getParameter("gender");
			introduce=request.getParameter("introduce");
			//��ȡ�����ѡ���ֵ�����ܵ���һ���ַ�������
			favorites=request.getParameterValues("favorites");
			isAccept=request.getParameterValues("isAccept");
			
			//��user��������Ը�ֵ
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
			
			//��ע��ɹ����û�������session��
			request.getSession().setAttribute("reguser", user);
			
			//ҳ������ת��
			request.getRequestDispatcher("../3.2_userinfo.jsp").forward(request, response);
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
