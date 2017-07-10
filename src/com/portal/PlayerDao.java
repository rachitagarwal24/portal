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
   
	
   public boolean find(String name,String password){
	   Session session=factory.openSession();
	   Transaction tx=null;
	   
	   System.out.println("Name is "+name+"Password is"+password);
	   
	   
	   try{
		   tx=session.beginTransaction();
		   String sql = " from com.portal.Player u where u.name=:name and u.password=:pass";
	        Query query = session.createQuery(sql);
	        query.setParameter("name", name);
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
   
   
   

   
}

