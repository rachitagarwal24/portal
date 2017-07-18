package com.portal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddActionOfficer extends ActionSupport implements ModelDriven<Officer> {

	
	Officer officer=new Officer();
	PlayerDao dao=new PlayerDao();
	
	public Officer getModel() {
		return officer;
	}
	
	public String execute(){
		int i=dao.addOfficer(officer);
		
			return "success";
		
	}

	public Officer getOfficer() {
		return officer;
	}

	public void setOfficer(Officer officer) {
		this.officer = officer;
	}
	
}
