package com.portal;

public class Player {
	private int loginid;
	private String name;
	private String email;
	private String password;
	private String phoneno;
	
	public Player(){}
	
	public Player(int loginid, String name, String email, String password, String phoneno) {
		this.loginid = loginid;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phoneno = phoneno;
	} 
    // Address address1 = new Address("OMR Road", "Chennai", "TN", "600097");
    // PlayerInfo playerInfo2=new PlayerInfo("Rachit","Agarwal","829389",address1);
    // playerID=(Integer)session.save(playerInfo2);
     
    // System.out.println("YAHA"+playerInfo.getAddress().getCity());

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

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	   
}