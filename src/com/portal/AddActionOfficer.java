package com.portal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddActionOfficer extends ActionSupport implements ModelDriven<Officer>,SessionAware {

	private int loginofficer;
	SessionMap<String,String> sessionmap;
	Officer officer=new Officer();
	PlayerDao dao=new PlayerDao();
	
	public Officer getModel() {
		return officer;
	}
	
	public String execute(){
		int i=dao.addOfficer(officer);
		
			return "success";
		
	}
	
	public String officerLogin(){
		loginofficer=dao.findOfficer(officer.getEmail(), officer.getPassword());
        if (loginofficer!=0) {
        	 System.out.println("BBBBB"+loginofficer);
        	 sessionmap.put("loginofficer", "true");
        	 sessionmap.put("loginId",String.valueOf(loginofficer));
        	 
             return SUCCESS;
        } else {
            this.addActionError("Invalid username and password");
        }
        System.out.println("NOOOO");
        return INPUT;
	}
	 public String logout(){  
	        sessionmap.invalidate();  
	        return "success";  
}

	

	public Officer getOfficer() {
		return officer;
	}

	public void setOfficer(Officer officer) {
		this.officer = officer;
	}

	@Override
	public void setSession(Map map) {
		sessionmap=(SessionMap)map;		
	}
	
}
