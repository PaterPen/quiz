package com.chris.dao.common;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public abstract class GenericDao<E extends Serializable> {
	protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("user");
	protected EntityManager em = emf.createEntityManager();
	
	public void persist(E e) {
 		em.getTransaction().begin() ;
		this.em.persist(e);
 		em.getTransaction().commit();
	}
	
	public void remove(E e) {
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
	}
	
	
}
