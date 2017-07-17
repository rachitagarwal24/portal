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
	   
	
   public boolean find(String email,String password){
	   Session session=HibernateUtil.getSessionFactory().openSession();
	   Transaction tx=null;
	   
	   System.out.println("Name is "+email+"Password is"+password);
	   
	   try{
		   tx=session.beginTransaction();
		   String sql = " from com.portal.PlayerAuth u where u.email=:email and u.password=:pass";
	        Query query = session.createQuery(sql);
	        query.setParameter("email", email);
	        query.setParameter("pass", password);
	        List<Player> list = query.list();
	        if (list.size() > 0) {
	            session.close();
	            return true;
	        }
		   
		}catch(HibernateException e) {
		   if(tx!=null)
			   tx.rollback();
		   e.printStackTrace();
	   }
	   session.close();
	   
	   return false;
   }
   
   public List<Player> getPlayers(){
	   List<Player> players=new ArrayList<Player>();
	   Session session=HibernateUtil.getSessionFactory().openSession();
	   Transaction tx=null;
	   try
	   {
		   tx=session.beginTransaction();
		   players=session.createQuery("from com.portal.Player").list();
		   /*
		   for (Iterator iterator = players.iterator(); iterator.hasNext();){
				Player employee = (Player) iterator.next(); 
				System.out.print("First Name: " + employee.getName()); 
				
			}
		    */
		   tx.commit();
	   }catch(HibernateException e){
		   if(tx!=null)
			   tx.rollback();
		   e.printStackTrace();
	
	   }finally {
		   session.close();
		
	   }
	   return players;
   }
   
   public List getPlayerInfos()
   {
	   List<PlayerInfo> playerinfos=new ArrayList<>();
	
	   Session session=HibernateUtil.getSessionFactory().openSession();
	   Transaction tx=null;
	   try
	   {
		   tx=session.beginTransaction();
		   
		   
		 // playerinfos1=session.createQuery("from com.portal.PlayerInfo P join fetch P.address").list();
		 //Query query=session.createQuery("from com.portal.PlayerInfo P ,com.portal.Address A where P.address=A.addressId");
		
		   playerinfos=session.createCriteria(PlayerInfo.class).list();
		 
		 
		 
		 //Alternative code for owned session is closed error 
		   
		 
		 //System.out.println("fsdfsdfsd");
	//	String adr= playerinfos.get(0).getAddress().getZipcode();
		
		 
		 
		 
		 
		 /*playerinfos.get(0).setAddress(adr);
		 System.out.println("cfasdfasda");*/
		/* for (PlayerInfo object : playerinfos) {
			
			 
		 }*/
		   
		   
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
		 
		 
		  
		tx.commit();
	   }catch(HibernateException e){
		   if(tx!=null)
			   tx.rollback();
		   e.printStackTrace();
	
	   }finally {
		   session.close();
		
	   }
	   
	   
	   
	   return playerinfos;
   }
      
}

