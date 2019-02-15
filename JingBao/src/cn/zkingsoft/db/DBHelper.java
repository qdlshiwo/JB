package cn.zkingsoft.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBHelper {
	private static Properties prop = new Properties();
	static{
		
		try {
			prop.load(DBHelper.class.getClassLoader().getResourceAsStream("db.properties"));
			Class.forName(prop.getProperty("driver"));
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	/**
	 * 获得连接
	 * @return
	 */
	public static Connection getConnection(){
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("name"), prop.getProperty("password"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	/**
	 * 关闭连接
	 * @param conn
	 */
	public static void closeConnection(Connection conn){
		try {
			if(conn!=null && !conn.isClosed()){
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
