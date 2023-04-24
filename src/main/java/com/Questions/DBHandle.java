package com.Questions;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

import com.Questions.DBConnection;
//Insert Questions to data base
public class DBHandle {
	private static Connection con =null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean insertQuestions(String username,String category,String question,String answers ) {
		boolean isSuccess = false;
		answers = "";
		
		//to catch an exception
		try {
			con =DBConnection.getConnection();
			stmt = con.createStatement();
			//Insert Query
			String sql = "Insert into answers values ('0','"+username+"','"+category+"','"+question+"','"+answers+"')";
			int rs1 =stmt.executeUpdate(sql);
			
			if(rs1 > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}
	//To get data from database
	public static List<Question> show(){
		
		ArrayList<Question> que = new ArrayList<>();
		
		try {
			con =DBConnection.getConnection();
			stmt = con.createStatement();
			//retrieve query
			String sql = "Select * from answers ORDER BY id DESC ";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
			int id = rs.getInt(1);
			String username = rs.getString(2);
			String category = rs.getString(3);
			String question = rs.getString(4);
			String answer = rs.getString(5);
			
			Question q = new Question(id, username, category, question , answer);
			que.add(q);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return que;
		
	}
	//to get user publish questions
public static List<Question> ViewMyQuestions(String username){
	
	ArrayList<Question> myque = new ArrayList<>();
	
	try {
		con=DBConnection.getConnection();
		stmt = con.createStatement();
		//to get user publish questions
		String sql = "select * from answers where username='"+username+"' group by id ";
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			int id = rs.getInt(1);
			String uname = rs.getString(2);
			String category = rs.getString(3);
			String question = rs.getString(4);
			String answer = rs.getString(5);
			
			System.out.println(uname);
			System.out.println(category);
			System.out.println(question);
			
			Question q = new Question(id, uname, category, question, answer);
			myque.add(q);
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	return myque;
	
}
//to display latest 2 question in home page
public static List<sQuestion> LQuestions(){
	
	ArrayList<sQuestion> sque = new ArrayList<>();
	//MySQLSyntaxErrorException
	try {
		con =DBConnection.getConnection();
		stmt = con.createStatement();
		//sql query for to display latest 2 question in home page
		String sql = "Select * from answers ORDER BY id DESC LIMIT 2";
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
		int id = rs.getInt(1);
		String username = rs.getString(2);
		String category = rs.getString(3);
		String question = rs.getString(4);
		String answer = rs.getString(5);
		
		sQuestion q = new sQuestion(id, username, category, question , answer);
		sque.add(q);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	return sque;
	
}

//to get user selected question details
public static List<Question> Qgetform1(String ID) {
	int id1 = Integer.parseInt(ID);
	ArrayList<Question> getque = new ArrayList<>();
	
	try {
		con=DBConnection.getConnection();
		stmt = con.createStatement();
		
		String sql = "select * from answers where id='"+id1+"' group by id ";
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String uname = rs.getString(2);
			String category = rs.getString(3);
			String question = rs.getString(4);
			String answer = rs.getString(5);
			
			System.out.println(uname);
			System.out.println(category);
			System.out.println(question);
			
			Question q = new Question(id, uname, category, question,answer);
			getque.add(q);
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	return getque;
}
//Update question
public static boolean UpdateQuestions(String id ,String username,String category,String question) {
	boolean isSuccess = false;
	
	
	
	try {
		con =DBConnection.getConnection();
		stmt = con.createStatement();
		
		String sql = "Update answers set username='"+username+"', category='"+category+"',question='"+question+"'"+"where id='"+id+"'";
		int rs1 =stmt.executeUpdate(sql);
		
		if(rs1 > 0) {
			isSuccess = true;
		}else {
			isSuccess = false;
		}
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	return isSuccess;
	
}

//sql query for delete question
public static boolean deleteQuestion(String id) {
	boolean isSuccess = false;
	int convId = Integer.parseInt(id);
	
	try {
		
		con = DBConnection.getConnection();
		stmt = con.createStatement();
		String sql = "delete from answers where id='"+convId+"'";
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
