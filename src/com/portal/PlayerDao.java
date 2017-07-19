package com.portal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.sun.org.apache.xpath.internal.Expression;

public class PlayerDao {	
	
	public Integer addOfficer(Officer officer){
      Session session = HibernateUtil.getSessionFactory().openSession();
      Transaction tx = null;
      Integer playerID = null;
      try{
         tx = session.beginTransaction();
         playerID = (Integer) session.save(officer);
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null)
        	 tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
      return playerID;
   }
   
	public Integer addRegister(PlayerAuth playerAuth){
      Session session = HibernateUtil.getSessionFactory().openSession();
      Transaction tx = null;
      Integer playerID = null;
      try{
         tx = session.beginTransaction();
         	System.out.println("YES   YES  YES");
         playerID = (Integer) session.save(playerAuth);
         tx.commit();
      }catch (HibernateException e) {
	         if (tx!=null)
        	 tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
      return playerID;
	}
	
	public void updateInfo(PlayerInfo playerInfo){
      Session session = HibernateUtil.getSessionFactory().openSession();
      Transaction tx = null;
      Integer playerID = null;
      try{
         tx = session.beginTransaction();
         session.update(playerInfo);
         tx.commit();
      }catch (HibernateException e) {
	         if (tx!=null)
        	 tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
      
	}
	
   public int find(String email,String password){
	   Session session=HibernateUtil.getSessionFactory().openSession();
	   System.out.println("Name is "+email+"Password is"+password);
	   
	   try{
		    List<PlayerAuth> list= session.createCriteria(PlayerAuth.class).add(Restrictions.eq("email", email)).add(Restrictions.eq("password", password)).list();
		    
	        if (list.size() > 0) {
	            session.close();
	            return list.get(0).getPlayerInfo().getLoginId();
	        }
	        
		   
		}catch(HibernateException e) {
		    e.printStackTrace();
	   }
	   session.close();
	   
	   return 0;
   }
   public int findOfficer(String email,String password){
	   Session session=HibernateUtil.getSessionFactory().openSession();
	   System.out.println("Name is "+email+"Password is"+password);
	   
	   try{
		    List<Officer> list= session.createCriteria(Officer.class).add(Restrictions.eq("email", email)).add(Restrictions.eq("password", password)).list();
		    
	        if (list.size() > 0) {
	            session.close();
	            return list.get(0).getLoginid();
	        }
	        
		   
		}catch(HibernateException e) {
		    e.printStackTrace();
	   }
	   session.close();
	   
	   return 0;
   }
   
   public List getParticularPlayerInfo(int playerId)
   {
	   List<PlayerInfo> playerinfo=new ArrayList<>();
	
	   Session session=HibernateUtil.getSessionFactory().openSession();
	   try
	   {
		 playerinfo=session.createCriteria(PlayerInfo.class).add(Restrictions.eq("loginId", playerId)).list();
		  
	   }catch(HibernateException e){
			   e.printStackTrace();
	
	   }finally {
		   session.close();
		
	   }
	   return playerinfo;
   }
   
   
   
   public List getPlayerInfos()
   {
	   List<PlayerInfo> playerinfos=new ArrayList<>();
	
	   Session session=HibernateUtil.getSessionFactory().openSession();
	   try
	   {
		 playerinfos=session.createCriteria(PlayerInfo.class).list();		  
	   }catch(HibernateException e){
			   e.printStackTrace();
	   }finally {
		   session.close();
		
	   }
	   return playerinfos;
   }
      
}

