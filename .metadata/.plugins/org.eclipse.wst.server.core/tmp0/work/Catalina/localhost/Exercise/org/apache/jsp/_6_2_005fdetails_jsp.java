/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.32
 * Generated at: 2018-08-20 01:41:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import entity.Items;
import dao.ItemsDAO;

public final class _6_2_005fdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("dao.ItemsDAO");
    _jspx_imports_classes.add("entity.Items");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>details</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("\t   div{\r\n");
      out.write("\t      float:left;\r\n");
      out.write("\t      margin-left: 30px;\r\n");
      out.write("\t      margin-right:30px;\r\n");
      out.write("\t      margin-top: 5px;\r\n");
      out.write("\t      margin-bottom: 5px;\r\n");
      out.write("\t   }\r\n");
      out.write("\t   div dd{\r\n");
      out.write("\t      margin:0px;\r\n");
      out.write("\t      font-size:10pt;\r\n");
      out.write("\t   }\r\n");
      out.write("\t   div dd.dd_name\r\n");
      out.write("\t   {\r\n");
      out.write("\t      color:blue;\r\n");
      out.write("\t   }\r\n");
      out.write("\t   div dd.dd_city\r\n");
      out.write("\t   {\r\n");
      out.write("\t      color:#000;\r\n");
      out.write("\t   }\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction add_cart(id){\r\n");
      out.write("\t\t\tvar number=document.getElementById(\"number\").value;\r\n");
      out.write("\t\t\tvar id=id;\r\n");
      out.write("\t\t\twindow.location.href=\"servlet/CartServlet?id=\"+id+\"&&action=add&&number=\"+number;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction show_cart(){\r\n");
      out.write("\t\t\twindow.location.href=\"servlet/CartServlet?action=show\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("    <h1>商品详情</h1>\r\n");
      out.write("    <hr>\r\n");
      out.write("    <center>\r\n");
      out.write("      <table width=\"750\" height=\"60\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <!-- 商品详情 -->\r\n");
      out.write("          ");
 
             ItemsDAO itemDao = new ItemsDAO();
             Items item = itemDao.getItemsById(Integer.parseInt(request.getParameter("id")));
             if(item!=null)
             {
          
      out.write("\r\n");
      out.write("          <td width=\"70%\" valign=\"top\">\r\n");
      out.write("             <table>\r\n");
      out.write("               <tr>\r\n");
      out.write("                 <td rowspan=\"4\"><img src=\"pic/");
      out.print(item.getPicture());
      out.write("\" width=\"200\" height=\"160\"/></td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr>\r\n");
      out.write("                 <td><B>");
      out.print(item.getName() );
      out.write("</B></td> \r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr>\r\n");
      out.write("                 <td>产地：");
      out.print(item.getCity());
      out.write("</td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr>\r\n");
      out.write("                 <td>价格：");
      out.print(item.getPrice() );
      out.write("￥</td>\r\n");
      out.write("               </tr> \r\n");
      out.write("               <tr>\r\n");
      out.write("                 <td>购买数量：<input type=\"text\" id=number value=\"1\" /></td>\r\n");
      out.write("               </tr> \r\n");
      out.write("             </table>\r\n");
      out.write("             <a href=\"javascript:add_cart(");
      out.print(item.getId());
      out.write(")\" >加入购物车</a>\r\n");
      out.write("             <a href=\"javascript:show_cart()\" >显示购物车</a>\r\n");
      out.write("          </td>\r\n");
      out.write("          ");
 
            }
          
      out.write("\r\n");
      out.write("          ");
 
              String list ="";
              //从客户端获得Cookies集合
              Cookie[] cookies = request.getCookies();
              //遍历这个Cookies集合
              if(cookies!=null&&cookies.length>0)
              {
	              for(Cookie c:cookies)
	              {
	                  if(c.getName().equals("ListViewCookie"))
	                  {
	                     list = c.getValue();
	                  }
	              }
	          }
              
              list+=request.getParameter("id")+"#";
              //如果浏览记录超过1000条，清零.
              String[] arr = list.split("#");
              if(arr!=null&&arr.length>0)
              {
                  if(arr.length>=1000)
                  {
                      list="";
                  }
              }
              Cookie cookie = new Cookie("ListViewCookie",list);
              response.addCookie(cookie);
          
          
      out.write("\r\n");
      out.write("          <!-- 浏览过的商品 -->\r\n");
      out.write("          <td width=\"30%\" bgcolor=\"#EEE\" align=\"center\">\r\n");
      out.write("             <br>\r\n");
      out.write("             <b>您浏览过的商品</b><br>\r\n");
      out.write("             <!-- 循环开始 -->\r\n");
      out.write("             ");
 
                ArrayList<Items> itemlist = itemDao.getViewList(list);
                if(itemlist!=null&&itemlist.size()>0 )
                {
                   System.out.println("itemlist.size="+itemlist.size());
                   for(Items i:itemlist)
                   {
                         
             
      out.write("\r\n");
      out.write("             <div>\r\n");
      out.write("             <dl>\r\n");
      out.write("               <dt>\r\n");
      out.write("                 <a href=\"6.2_details.jsp?id=");
      out.print(i.getId());
      out.write("\"><img src=\"pic/");
      out.print(i.getPicture() );
      out.write("\" width=\"120\" height=\"90\" border=\"1\"/></a>\r\n");
      out.write("               </dt>\r\n");
      out.write("               <dd class=\"dd_name\">");
      out.print(i.getName() );
      out.write("</dd> \r\n");
      out.write("               <dd class=\"dd_city\">产地:");
      out.print(i.getCity() );
      out.write("&nbsp;&nbsp;价格:");
      out.print(i.getPrice() );
      out.write(" ￥ </dd> \r\n");
      out.write("             </dl>\r\n");
      out.write("             </div>\r\n");
      out.write("             ");
 
                   }
                }
             
      out.write("\r\n");
      out.write("             <!-- 循环结束 -->\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("    </center>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
