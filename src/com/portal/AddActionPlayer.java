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
	/*
	 * 
	 * For Custom validation 
	public void validate() {  
	    if(player.getName().length()<1)  
	        addFieldError("name","Name can't be blank");  
	    if(player.getPassword().length()<6)  
	        addFieldError("password","Password must be greater than 5");  
	}  
	*/
	
}
