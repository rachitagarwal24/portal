package com.portal;

public class Player {
	private int loginid;
	private String name;
	private String email;
	private String password;
	private int phoneno;
	
	public Player(){}
	
	public Player(int loginid, String name, String email, String password, int phoneno) {
		this.loginid = loginid;
		this.name = name;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	   
}