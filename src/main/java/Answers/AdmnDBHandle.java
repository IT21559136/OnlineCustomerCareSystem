package Answers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Questions.DBConnection;
import com.Questions.Question;

public class AdmnDBHandle {

	private static Connection con =null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	private static boolean isSuccess;
	
	
	public static List<Answers> showQuestons(){
		
		ArrayList<Answers> ans = new ArrayList<>();
		
		try {
			con =DBConnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "SELECT * FROM answers WHERE answers NOT LIKE ''";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
			int id = rs.getInt(1);
			String username = rs.getString(2);
			String category = rs.getString(3);
			String question = rs.getString(4);
			String answer = rs.getString(5);
			
			
			Answers a = new Answers(id, username, category, question, answer);
			ans.add(a);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return ans;
		
	}
	
	
	public static List<Answers> showNewQuestons(){
		
		ArrayList<Answers> ans = new ArrayList<>();
		
		try {
			con =DBConnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "SELECT * FROM answers WHERE answers LIKE ''";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
			int id = rs.getInt(1);
			String username = rs.getString(2);
			String category = rs.getString(3);
			String question = rs.getString(4);
			String answer = rs.getString(5);
			
			
			Answers a = new Answers(id, username, category, question, answer);
			ans.add(a);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return ans;
		
	}
	
	
	public static List<Answers> replyQuestion(String ID){
		int id2 = Integer.parseInt(ID);
		ArrayList<Answers> getans = new ArrayList<>();
		
		try {
			con=DBConnection.getConnection();
			stmt = con.createStatement();
			String sql = "select * from answers where  id='"+id2+"' group by id ";
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
				System.out.println(answer);
				
				Answers a = new Answers(id, uname, category, question,answer);
				getans.add(a);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return getans;
	}
	
	public static boolean updateAnswer(String id, String anme,String category, String question,String answer){
		int id2 = Integer.parseInt(id);
		
		try {
			con=DBConnection.getConnection();
			stmt = con.createStatement();
			String sql = "Update answers set username='"+anme+"', category='"+category+"',question='"+question+"',answers='"+answer+"'"+"where id='"+id2+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess =true ;
			} else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		return isSuccess;
		
	}
	
	
	public static boolean publishAnswer(String id, String anme,String category, String question,String answer){
		int id3 = Integer.parseInt(id);
		
		try {
			con=DBConnection.getConnection();
			stmt = con.createStatement();
			String sql = "Update answers set username='"+anme+"', category='"+category+"',question='"+question+"',answers='"+answer+"'"+"where id='"+id3+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess =true ;
			} else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		return isSuccess;
		
	}
	
	
	
	public static boolean deleteAnswers(String id) {
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
