package com.portal;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ActionUpdate extends ActionSupport implements ModelDriven<PlayerInfo>{
	
	PlayerInfo playerInfo=new PlayerInfo();
	PlayerDao dao=new PlayerDao();
	
	
	
	public PlayerInfo getPlayerInfo() {
		return playerInfo;
	}

	public void setPlayerInfo(PlayerInfo playerInfo) {
		this.playerInfo = playerInfo;
	}
	
	public String execute(){
	//	System.out.println("SDSDS"+playerInfo.getLoginId()+playerInfo.getFname());
		dao.updateInfo(playerInfo);
		return "success";
	}
	
	
	@Override
	public PlayerInfo getModel() {
		// TODO Auto-generated method stub
		return playerInfo;
	}

}
