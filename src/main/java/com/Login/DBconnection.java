package com.Login;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	
	private static String url = "jdbc:mysql://localhost:3306/customercaresystem";
	private static String userName = "root";
	private static String passwordDB = "";
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, userName, passwordDB);
		}
		catch(Exception e){
			System.out.println("DB connection Unsuccess!");
		}
		return con;
	}

}
