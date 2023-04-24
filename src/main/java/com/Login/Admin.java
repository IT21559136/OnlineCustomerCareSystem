package com.Login;

public class Admin {
	private int adminID;
	private String adminName;
	private String adminUserName;
	private String adminPW;
	public Admin(int adminID, String adminName, String adminUserName, String adminPW) {
		this.adminID = adminID;
		this.adminName = adminName;
		this.adminUserName = adminUserName;
		this.adminPW = adminPW;
	}
	public int getAdminID() {
		return adminID;
	}
	public String getAdminName() {
		return adminName;
	}
	public String getAdminUserName() {
		return adminUserName;
	}
	public String getAdminPW() {
		return adminPW;
	}
	
	

}
