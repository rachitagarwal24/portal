package com.portal;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<PlayerAuth>,SessionAware  {
	 
	SessionMap<String,String> sessionmap;
    PlayerAuth playerAuth=new PlayerAuth();  
	PlayerDao dao = new PlayerDao();
    
    @Override
    public String execute() {
        if (dao.find(playerAuth.getEmail(), playerAuth.getPassword())) {
             return SUCCESS;
        } else {
            this.addActionError("Invalid username and password");
        }
        System.out.println("NOOOO");
        return INPUT;
    }
     
    
    public PlayerAuth getPlayerAuth() {
		return playerAuth;
	}


	public void setPlayerAuth(PlayerAuth playerAuth) {
		this.playerAuth = playerAuth;
	}

	public void setSession(Map map) {
		sessionmap=(SessionMap)map;
		sessionmap.put("login", "true");
	}
    
    public String logout(){  
        sessionmap.invalidate();  
        return "success";  
    }


	public PlayerAuth getModel() {
		// TODO Auto-generated method stub
		return playerAuth;
	}  
}