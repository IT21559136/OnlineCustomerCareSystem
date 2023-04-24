package com.UpdateAccount;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Login.Customer;
import com.Login.DBconnection;
import com.Questions.DBConnection;

public class updateCustomerDBUtil {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
public static List<Customer> getCustomerDetails(String id){
		
		ArrayList<Customer> cus = new ArrayList<>();
		
		//validate
		try {
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from customerdetails where cusID = '"+id+"'";
			
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
			
	public static boolean updatecustomer(String id,String fname,String sname,String phone,String username,String password,String birthdate) {
		int id1=Integer.parseInt(id);
		
		try {
			con = DBconnection.getConnection();
			stmt = con.createStatement();			
			String sql = "update customerdetails set fName='"+fname+"', sName='"+sname+"', mobileNumber='"+phone+"', username='"+username+"', password='"+password+"', bDate='"+birthdate+"'"
					+"where cusID='"+id1+"'";						
			int rs1 = stmt.executeUpdate(sql);
			
			if(rs1>0) {
				isSuccess=true;
			}
			else {
				isSuccess=false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
    }
	public static boolean deleteAccount(String id) {
		boolean isSuccess = false;
		int convId = Integer.parseInt(id);
		
		try {
			
			con = DBConnection.getConnection();
			stmt = con.createStatement();
			String sql = "delete from customerdetails where cusID='"+convId+"'";
			int r = stmt.executeUpdate(sql);
			
			if (r > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
		
}
