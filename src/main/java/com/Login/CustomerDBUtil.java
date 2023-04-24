package com.Login;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class CustomerDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean validateLogin(String username, String password) {
		
		try {
			
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from customerdetails where username = '"+username+"' and password = '"+password+"'";
			
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	public static List<Customer> getCustomerDetails(String userName){
		
		ArrayList<Customer> cus = new ArrayList<>();
		
		//validate
		try {
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from customerdetails where username = '"+userName+"'";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int cusID = rs.getInt(1);
				String fName = rs.getString(2);
				String sName = rs.getString(3);
				String mobileNumber = rs.getString(4);
				String username = rs.getString(5);
				String password = rs.getString(6);
				String bDate = rs.getString(7);
				
				Customer c = new Customer(cusID, fName, sName, mobileNumber, username, password, bDate);
				cus.add(c);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return cus;
	}
	
//	public static List<Customer> validate(String userName, String passWord){
//		
//		ArrayList<Customer> cus = new ArrayList<>();
//		
//		//validate
//		try {
//			con = DBconnection.getConnection();
//			stmt = con.createStatement();
//			
//			String sql = "select * from customerdetails where username = '"+userName+"' and password = '"+passWord+"'";
//			
//			rs = stmt.executeQuery(sql);
//			
//			if(rs.next()) {
//				int cusID = rs.getInt(1);
//				String fName = rs.getString(2);
//				String sName = rs.getString(3);
//				String mobileNumber = rs.getString(4);
//				String username = rs.getString(5);
//				String password = rs.getString(6);
//				String bDate = rs.getString(7);
//				
//				Customer c = new Customer(cusID, fName, sName, mobileNumber, username, password, bDate);
//				cus.add(c);
//			}
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
//		
//		return cus;
//	}
	
	

	
	public static boolean registerCustomer(String fName, String sName, String mobileNumber, String username, String password, String bDate) {
		
		boolean isSuccess = false;
		
				
		try {
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "INSERT INTO customerdetails values (0, '"+fName+"', '"+sName+"', '"+mobileNumber+"', '"+username+"', '"+password+"', '"+bDate+"' )";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static List<Account> validate1(String mobileNumber){
		
	ArrayList<Account> acc = new ArrayList<>();
		
		//validate
		try {
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from customerdetails where mobileNumber = '"+mobileNumber+"' ";
			
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int cusID = rs.getInt(1);
				String fName = rs.getString(2);
				String sName = rs.getString(3);
				String mobileNumber1 = rs.getString(4);
				String username = rs.getString(5);
				String password = rs.getString(6);
				String bDate = rs.getString(7);
				
				Account c = new Account(cusID, fName, sName, mobileNumber1, username, password, bDate);
				acc.add(c);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return acc;
	}
	
	public static boolean resetPassword(String id, String password) {
		
		try {
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "UPDATE customerdetails SET password = '"+password+"'" + 
							"WHERE customerdetails.cusID = "+id+"";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}

//	public static List<Admin> adminValidate(String adminUN, String adminPW) {
//		
//		ArrayList<Admin> admin = new ArrayList<>();
//		
//		//validate
//		try {
//			con = DBconnection.getConnection();
//			stmt = con.createStatement();
//			
//			String sql = "select * from admindetails where adminUserName = '"+adminUN+"' and adminPW = '"+adminPW+"'";
//			
//			rs = stmt.executeQuery(sql);
//			
//			if(rs.next()) {
//				int adminID = rs.getInt(1);
//				String adminName = rs.getString(2);
//				String adminUserName = rs.getString(3);
//				String adminpw = rs.getString(4);
//				
//				Admin c = new Admin(adminID, adminName, adminUserName, adminpw);
//				admin.add(c);
//			}
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
//		
//		return admin;
//	}
	
	public static boolean adminValidate(String adminUN, String adminPW) {
		
		try {
			
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from admindetails where adminUserName = '"+adminUN+"' and adminPW = '"+adminPW+"'";
			
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	public static ArrayList<Admin> getAdminDetails(String adminUN){
		
		ArrayList<Admin> ad = new ArrayList<>();
		
		//validate
		try {
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from admindetails where adminUserName = '"+adminUN+"'";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int adminId = rs.getInt(1);
				String adminName = rs.getString(2);
				String adminUserName = rs.getString(3);
				String adminPW = rs.getString(4);
				
				Admin c = new Admin(adminId, adminName, adminUserName, adminPW);
				ad.add(c);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return ad;
	}

}
