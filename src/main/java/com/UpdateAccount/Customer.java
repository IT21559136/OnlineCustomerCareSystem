package com.UpdateAccount;

public class Customer {
	private int id;
	private String fname;
	private String sname;
	private String mobile;
	private String username;
	private String password;
	private String birthdate;
	public Customer(int id, String fname, String sname, String mobile, String username, String password,
			String birthdate) {
		this.id = id;
		this.fname = fname;
		this.sname = sname;
		this.mobile = mobile;
		this.username = username;
		this.password = password;
		this.birthdate = birthdate;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public String getSname() {
		return sname;
	}
	public String getMobile() {
		return mobile;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getBirthdate() {
		return birthdate;
	}
}