package com.portal;

public class PlayerAuth implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private int loginid;
	private String email;
	private String password;
	private PlayerInfo playerInfo;
	
	public PlayerAuth(){
	}
	
	public PlayerAuth(String email, String password,PlayerInfo playerInfo) {
		this.email = email;
		this.password = password;
		this.playerInfo=playerInfo;
	}
	public int getLoginid() {
		return loginid;
	}
	public void setLoginid(int loginid) {
		this.loginid = loginid;
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
	public PlayerInfo getPlayerInfo() {
		return playerInfo;
	}
	public void setPlayerInfo(PlayerInfo playerInfo) {
		this.playerInfo = playerInfo;
	}
}
