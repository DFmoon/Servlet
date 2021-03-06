package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ItemsDAO;
import entity.Items;
import entity.Cart;

public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	private String action;
	private ItemsDAO idao=new ItemsDAO();
	

    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		
		if(request.getParameter("action")!=null){
			this.action=request.getParameter("action");
			if(action.equals("add")){
				if(addSuccess(request,response)){
					request.getRequestDispatcher("/6.3_success.jsp").forward(request, response);
				}else{
					request.getRequestDispatcher("/6.4_fail.jsp").forward(request, response);
				}
			}
			if(action.equals("show")){
				request.getRequestDispatcher("/6.5_cart.jsp").forward(request, response);
			}
			if(action.equals("delete")){
				if(deleteSuccess(request,response)){
					request.getRequestDispatcher("/6.5_cart.jsp").forward(request, response);
				}else{
					request.getRequestDispatcher("/6.5_cart.jsp").forward(request, response);
				}
			}
		}
	}
	
	private boolean addSuccess(HttpServletRequest request, HttpServletResponse response){
		String id=request.getParameter("id");
		String number=request.getParameter("number");
		Items item=idao.getItemsById(Integer.parseInt(id));
		
		//是否第一次给购物车添加商品
		if(request.getSession().getAttribute("cart")==null){
			Cart cart=new Cart();
			request.getSession().setAttribute("cart", cart);
		}
		Cart cart=(Cart)request.getSession().getAttribute("cart");
		if(cart.addGoods(item,Integer.parseInt(number))){
			return true;
		}else{
			return false;
		}
	}
	
	private boolean deleteSuccess(HttpServletRequest request, HttpServletResponse response){
		String id=request.getParameter("id");
		Cart cart=(Cart)request.getSession().getAttribute("cart");
		Items item=idao.getItemsById(Integer.parseInt(id));
		if(cart.removeGoods(item)){
			return true;
		}else{
			return false;
		}
	}
}
