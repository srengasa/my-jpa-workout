package com.me.sample.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.me.sample.entity.Employee;

public class EmployeeTest {

	private static final String PU_NAME = "EmployeeService";
	private static EntityManagerFactory emf;
	private static EntityManager em;
	
	@Before
	public void init() {
		emf = Persistence.createEntityManagerFactory(PU_NAME);
		em = emf.createEntityManager();
	}
	@After
	public void close() {
		if (em != null) em.close();
		if (emf != null) emf.close();
	}
	
	@Test
	public void test() {
		Employee e = new Employee("E692", new java.sql.Date(System.currentTimeMillis()));
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
	}
}
