package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper {
	private static final String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";	//���ݿ�����
	private static final String url="jdbc:sqlserver://localhost:1433;DatabaseName=shopping";
	private static final String username="sa";
	private static final String password="admin";
	
	private static Connection conn=null;
	
	//��̬����飬�����������
	static{
		try{
			Class.forName(driver);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	//����ģʽ���������ݿ����Ӷ���
	public static Connection getConnection()throws Exception{
		if(conn==null){
			conn=DriverManager.getConnection(url,username,password);
			return conn;
		}
		return conn;
	}
	
	//����
	/*public static void main(String[] args){
		try{
			Connection conn=DBHelper.getConnection();
			if(conn!=null){
				System.out.println("���ݿ����ӳɹ�");
			}else{
				System.out.println("���ݿ�����ʧ��");
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}*/
}
