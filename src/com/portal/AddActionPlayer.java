package com.portal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddActionPlayer extends ActionSupport implements ModelDriven<Player> {

	
	Player player=new Player();
	PlayerDao dao=new PlayerDao();
	List<Player> players=new ArrayList<Player>();
	
	public Player getModel() {
		return player;
	}
	
	public String execute(){
		int i=dao.addPlayer(player);
		
		//if(i>0)
	//	{
			return "success";
		/*}	
		else
		{
			System.out.println("no");
			return "error";
		}
		*/
	}
	
	public String listPlayers(){
		players = dao.getPlayers();
	
		 for (Iterator iterator = players.iterator(); iterator.hasNext();){
				Player employee = (Player) iterator.next(); 
				System.out.print("YEs: " + employee.getName()); 
				
		 }
			
		return "success";
	}
		
	public Player getPlayer(){
		return player;
	}
	public void setPlayer(Player player){
		this.player=player;
	}
	
	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	/*
	 * 
	 * For Custom validation 
	public void validate() {  
	    if(player.getName().length()<1)  
	        addFieldError("name","Namze can't be blank");  
	    if(player.getPassword().length()<6)  
	        addFieldError("password","Password must be greater than 5");  
	}  
	*/
	
}
