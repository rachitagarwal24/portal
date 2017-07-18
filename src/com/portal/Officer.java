package com.portal;

public class Officer {
	private int loginid;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private String phoneno;
	
	public Officer(){}
	
	public Officer(String fname, String lname, String email, String password, String phoneno) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.phoneno = phoneno;
	} 

	public int getLoginid() {
		return loginid;
	}

	public void setLoginid(int loginid) {
		this.loginid = loginid;
	}

	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;

	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	   
}