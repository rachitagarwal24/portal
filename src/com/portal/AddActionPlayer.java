package com.portal;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddActionPlayer extends ActionSupport implements ModelDriven<Player> {

	Player player=new Player();
	PlayerDao dao=new PlayerDao();
	
	
	public Player getModel() {
		return player;
	}
	
	public String execute(){
		dao.addPlayer(player);
		
		return "success";
	}
	
	public Player getPlayer(){
		return player;
	}
	
	public void setPlayer(Player player){
		this.player=player;
	}
	
}
