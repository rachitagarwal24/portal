package com.portal;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddActionRegister extends ActionSupport implements ModelDriven<PlayerInfo> {

	private String street;
	private String state;
	private String city;
	private String zipcode;
	private String email;
	private String password;
	
	public String getStreet() {
		return street;
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

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}


	PlayerInfo playerInfo=new PlayerInfo();
	PlayerDao dao=new PlayerDao();

	public String execute(){
		//System.out.println("aaaAAAAA"+street);
		
		System.out.println("AAAAAAA"+playerInfo.getAge());
		int i=dao.addRegister(new Address(street,city,state,zipcode),playerInfo,new PlayerAuth(email, password, playerInfo));
		 return "success";
	}

	public PlayerInfo getPlayerInfo() {
		return playerInfo;
	}
	
	public void setPlayerInfo(PlayerInfo playerInfo) {
		this.playerInfo = playerInfo;
	}
	

	/*
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	*/
	public PlayerInfo getModel() {
		// TODO Auto-generated method stub
		//System.out.println("LLLLL"+playerInfo.getAddress().getCity());
	    
		return playerInfo;
	}
	

	
}
