package com.capgemini.flight;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class FlightFind {
	private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
	public static void main(String[] args) {
	     try {
	    	  doFind();
	      } finally {
	          emf.close();
	      }
	}
	public static void doFind()
	{
	EntityManager em=emf.createEntityManager();
	FlightModel flightmodel=new FlightModel();
	//Setting the values 
	flightmodel.setFid(101);
	flightmodel.setFname("AIR ASIA");
	flightmodel.setSeats(250);
	//1st CURD OPERATION find method takes two arguments class name and primary key
	flightmodel = em.find(FlightModel.class,101);
	System.out.println(flightmodel);
	em.close();
}
}
