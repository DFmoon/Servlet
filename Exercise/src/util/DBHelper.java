package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper {
	private static final String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";	//数据库驱动
	private static final String url="jdbc:sqlserver://localhost:1433;DatabaseName=shopping";
	private static final String username="sa";
	private static final String password="admin";
	
	private static Connection conn=null;
	
	//静态代码块，负责加载驱动
	static{
		try{
			Class.forName(driver);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	//单例模式，返回数据库连接对象
	public static Connection getConnection()throws Exception{
		if(conn==null){
			conn=DriverManager.getConnection(url,username,password);
			return conn;
		}
		return conn;
	}
	
	//测试
	/*public static void main(String[] args){
		try{
			Connection conn=DBHelper.getConnection();
			if(conn!=null){
				System.out.println("数据库连接成功");
			}else{
				System.out.println("数据库连接失败");
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}*/
}
