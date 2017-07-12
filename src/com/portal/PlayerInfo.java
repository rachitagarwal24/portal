package com.portal;

public class PlayerInfo implements java.io.Serializable {
	
	private int loginId;
	private String fname;
	private String lname;
	private String phoneno;
	private Address address;
	
	public PlayerInfo(){
	}
	
	public PlayerInfo(Address address){
		this.address=address;
	}
	
	public PlayerInfo(String fname, String lname, String phoneno, Address address) {
		this.fname = fname;
		this.lname = lname;
		
		this.phoneno = phoneno;
		this.address = address;
	}

	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
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
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
