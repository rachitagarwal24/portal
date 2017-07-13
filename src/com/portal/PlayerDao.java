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

public class PlayerDao {
	private static SessionFactory factory; 
	
	public PlayerDao(){
		try{
	         factory = new Configuration().configure().buildSessionFactory();
	      }catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }
	}

	public Integer addPlayer(Player player){
      Session session = factory.openSession();
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
   
	public Integer addRegister(Address address,PlayerInfo playerInfo,PlayerAuth playerAuth){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      Integer playerID = null;
	      try{
	         tx = session.beginTransaction();
	         
	        // Address address1 = new Address("OMR Road", "Chennai", "TN", "600097");
	        // PlayerInfo playerInfo2=new PlayerInfo("Rachit","Agarwal","829389",address1);
	        // playerID=(Integer)session.save(playerInfo2);
	         
	        // System.out.println("YAHA"+playerInfo.getAddress().getCity());
	         
	       //  session.save(address);
	         PlayerInfo playerInfo2=new PlayerInfo(playerInfo.getFname(),playerInfo.getLname(),playerInfo.getPhoneno(),playerInfo.getAge(),address);
	         PlayerAuth playerAuth2=new PlayerAuth(playerAuth.getEmail(), playerAuth.getPassword(), playerInfo2);
	         playerID = (Integer) session.save(playerAuth2);
	         
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
	   Session session=factory.openSession();
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
   
   public List<Player> getPlayers()
   {
	   List<Player> players=new ArrayList<Player>();
	   Session session=factory.openSession();
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
	   List playerinfos=new ArrayList();
	   List playerinfos1=new ArrayList();
	   List playerinfos2=new ArrayList();
	   Session session=factory.openSession();
	   Transaction tx=null;
	   try
	   {
		   tx=session.beginTransaction();
		   playerinfos1=session.createQuery("from com.portal.PlayerInfo").list();
		   playerinfos2=session.createQuery("from com.portal.Address").list();
		   /*
		   for (Iterator iterator = players.iterator(); iterator.hasNext();){
				Player employee = (Player) iterator.next(); 
				System.out.print("First Name: " + employee.getName()); 
				
			}
		    */
		   
		   for (Iterator iterator = playerinfos2.iterator(); iterator.hasNext();){
				Address employee = (Address) iterator.next(); 
				System.out.print("First Name: " + employee.getStreet()); 
				
			}
		
		   playerinfos.addAll(playerinfos1);
		   playerinfos.addAll(playerinfos2);
		   
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

