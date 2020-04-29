package com.capgemini.flight;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class FlightRemove {
	private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
	public static void main(String[] args) {
		try {
			doRemove();
	      } finally {
	          emf.close();
	      }
	
	}
	public static void doRemove()
	{
	EntityManager em=emf.createEntityManager();
	FlightModel flightmodel=new FlightModel();
	//Setting the values 
	flightmodel.setFid(101);
	flightmodel.setFname("AIR ASIA");
	flightmodel.setSeats(250);
	//find method takes two arguments class name and primary key
	flightmodel = (FlightModel)em.find(FlightModel.class,101);
		em.getTransaction().begin();
		//3rd CURD OPERATION removing the values 
	  //remove method takes object as argument
	  em.remove(flightmodel);
	  System.out.println(flightmodel);
	  em.getTransaction().commit();
	  em.close();
}
}
