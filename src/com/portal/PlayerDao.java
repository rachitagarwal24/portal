package com.portal;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
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
   
   
   public List<Player> getPlayers()
   {
	   List<Player> players=new ArrayList<Player>();
	   Session session=factory.openSession();
	   Transaction tx=null;
	   try
	   {
		   tx=session.beginTransaction();
		   players=session.createQuery("from Player").list();
			  
	   }catch(HibernateException e){
		   if(tx!=null)
			   tx.rollback();
		   e.printStackTrace();
	   }finally {
		   session.close();
		
	   }
	   
   
	   
	   return players;
   }

   
}























