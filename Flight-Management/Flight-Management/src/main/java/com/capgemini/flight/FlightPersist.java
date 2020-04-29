package com.capgemini.flight;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class FlightPersist {
	private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
	public static void main(String[] args) {
		try {
			doPersist();
	      } finally {
	          emf.close();
	      }
		
		
	}
		public static void doPersist()
		{
			EntityManager em=emf.createEntityManager();
			FlightModel flightmodel=new FlightModel();
			
			//Setting the values 
			flightmodel.setFid(101);
			flightmodel.setFname("Air India");
			flightmodel.setSeats(350);
			//Transaction begin
			em.getTransaction().begin();
			
			//2nd CURD OPERATION
			//Persist takes object as argument
			em.persist(flightmodel);
			//Transaction commit
			System.out.println(flightmodel);
			em.getTransaction().commit();
			
			em.close();
		}
}
