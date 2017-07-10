package com.portal;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<Player>  {
	 
	//   private static final long serialVersionUID = 1L;    
	
	public Player getModel() {
		// TODO Auto-generated method stub
		return player;
	}    
    PlayerDao dao = new PlayerDao();
    Player player=new Player();
    /*
    @Override
    public void validate() {
        if (player.getName().length() == (0)) {
            this.addFieldError("name", "Name is required");
        }
        if (player.getPassword().length() == (0)) {
            this.addFieldError("password", "Password is required");
        }
    }
    */
 
    @Override
    public String execute() {
        if (dao.find(player.getName(), player.getPassword())) {
        	
        	System.out.println("YeS");
        	
            return SUCCESS;
        } else {
            this.addActionError("Invalid username and password");
        }
        System.out.println("NOOOO");
    	
        
        return INPUT;
    }
     
 
    public Player getPlayer() {
        return player;
    }
 
    public void setPlayer(Player player) {
        this.player = player;
    }


}