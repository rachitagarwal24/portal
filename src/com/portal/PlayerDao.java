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
	
	public Integer addPlayer(Player player){
      Session session = HibernateUtil.getSessionFactory().openSession();
      Transaction tx = null;
      Integer playerID = null;
      try{
         tx = session.beginTransaction();
         playerID = (Integer) session.save(player);
         //System.out.println("Player ID: "+playerID);
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
         //System.out.println("Player ID: "+playerID);
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
	
   public int find(String email,String password){
	   Session session=HibernateUtil.getSessionFactory().openSession();
	   System.out.println("Name is "+email+"Password is"+password);
	   
	   try{
		   /*String sql = " from com.portal.PlayerAuth u where u.email=:email and u.password=:pass";
	        Query query = session.createQuery(sql);
	        query.setParameter("email", email);
	        query.setParameter("pass", password);
	        List<PlayerAuth> list = query.list();
	        */
		    
		    List<PlayerAuth> list= session.createCriteria(PlayerAuth.class).add(Restrictions.eq("email", email)).add(Restrictions.eq("password", password)).list();
		    
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
   
   
   public List getPlayerInfos()
   {
	   List<PlayerInfo> playerinfos=new ArrayList<>();
	
	   Session session=HibernateUtil.getSessionFactory().openSession();
	   try
	   {
		 // playerinfos1=session.createQuery("from com.portal.PlayerInfo P join fetch P.address").list();
		 //Query query=session.createQuery("from com.portal.PlayerInfo P ,com.portal.Address A where P.address=A.addressId");
		
		 playerinfos=session.createCriteria(PlayerInfo.class).list();
		 
		 
		 System.out.println("YES");
		 
		 //Alternative code for owned session is closed error 
		 
		 //System.out.println("fsdfsdfsd");
		 //String adr= playerinfos.get(0).getAddress().getZipcode();
		 
		 //  playerinfos=session.createQuery("from com.portal.Address").list();
		
	/*	   for (Iterator iterator = playerinfos.iterator(); iterator.hasNext();){
				//P employee = (PlayerInfo) iterator.next(); 
			//	System.out.print("First Name: " + playerinfos.toString()); 
				
			}
			*/
		   //System.out.println(playerinfos.);
		
		
		  // playerinfos.addAll(playerinfos1);
		  // playerinfos.addAll(playerinfos2);
		  /*
		  for (Object result : query.list()) {
			    PlayerInfo user = (PlayerInfo) result;
			    System.out.println("RRRRRRRRRRRRRRRRRRRRRRRRRRRR"+user.getFname());
			}
		  */
		 
		 /*
		 PlayerInfo info;
		 Address addr;
		 List<Object> result = (List<Object>) query.list(); 
		 Iterator itr = result.iterator();
		 while(itr.hasNext()) {
		    Object[] obj = (Object[]) itr.next();
		    //now you have one array of Object for each row
		    info=(PlayerInfo)obj[0];
		    addr=(Address)obj[1];
		   info.setAddress(addr);
		   playerinfos.add(info);
		   
		    String client = String.valueOf(obj[1]); // 
		    System.out.println(":AAAAAAAAAAAA"+client);
		    
		    //same way for all obj[2], obj[3], obj[4]
		 }
		 */
		  
	   }catch(HibernateException e){
			   e.printStackTrace();
	
	   }finally {
		   session.close();
		
	   }
	   return playerinfos;
   }
      
}

