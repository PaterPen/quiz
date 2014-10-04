package com.chris.dao.common;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GenericDao<E extends Serializable> {	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("user");
	protected EntityManager em = factory.createEntityManager();
	
	public void persist(E e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
	}
	
	public void remove(E e) {
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
	}
}
