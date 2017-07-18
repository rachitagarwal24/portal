package com.portal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddActionRegister extends ActionSupport implements ModelDriven<PlayerAuth> {

	
	PlayerAuth playerAuth=new PlayerAuth();
	PlayerDao dao=new PlayerDao();
	List playerinfos=new ArrayList();

	public String execute(){
		//System.out.println("aaaAAAAA"+street);
		
		//System.out.println("AAAAAAA"+playerInfo.getAge());
		
		int i=dao.addRegister(playerAuth);
		 return "success";
	}
	
	public String listPlayerInfo(){
		
		playerinfos=dao.getPlayerInfos();
		return "success";
		
	}
	
	public List<PlayerInfo> getPlayerinfos() {
		return playerinfos;
	}

	public void setPlayerinfos(List<PlayerInfo> playerinfos) {
		this.playerinfos = playerinfos;
	}

	
	
	public PlayerAuth getPlayerAuth() {
		return playerAuth;
	}

	public void setPlayerAuth(PlayerAuth playerAuth) {
		this.playerAuth = playerAuth;
	}

	public PlayerAuth getModel() {
		// TODO Auto-generated method stub
		//System.out.println("LLLLL"+playerInfo.getAddress().getCity());
	    
		return playerAuth;
	}
	

	
}
