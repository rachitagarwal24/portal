package com.portal;

import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddActionRegister extends ActionSupport implements ModelDriven<PlayerAuth> {

	
	private static final long serialVersionUID = 1L;
	
	PlayerAuth playerAuth=new PlayerAuth();
	PlayerDao dao=new PlayerDao();
	List<PlayerInfo> playerinfos=new ArrayList<>();
	List<PlayerInfo> playerinfos1=new ArrayList<>();

	public String execute(){
		 dao.addRegister(playerAuth);
		 return "success";
	}
	
	public String listPlayerInfo(){
		playerinfos=dao.getPlayerInfos();
		return "success";
	}
	
	public String particularPlayerInfo(){
		if(ActionContext.getContext().getSession().get("loginId")!=null){
			int playerId=Integer.parseInt(ActionContext.getContext().getSession().get("loginId").toString());
			playerinfos1=dao.getParticularPlayerInfo(playerId);
			return "success";
		}
		else{
			return "loginpage";
		}
	}
	
	public List<PlayerInfo> getPlayerinfos1() {
		return playerinfos1;
	}

	public void setPlayerinfos1(List<PlayerInfo> playerinfos1) {
		this.playerinfos1 = playerinfos1;
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
		return playerAuth;
	}

}
