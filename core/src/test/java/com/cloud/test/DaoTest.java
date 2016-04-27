package com.cloud.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cloud.admin.model.Customer;
import com.cloud.admin.model.User;
import com.cloud.admin.service.impl.CustomerDAOImpl;
import com.cloud.admin.service.impl.UserDAOImpl;

import junit.framework.TestCase;

public class DaoTest extends TestCase {
	UserDAOImpl udao = new UserDAOImpl();
	CustomerDAOImpl cdao = new CustomerDAOImpl();
	@Before
	public void setUp() throws Exception {
		System.out.println("===========Create table=============");
		udao.createTable();
		cdao.createTable();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("===========Drop table=============");
		udao.dropTable();
		cdao.dropTable();
	}

	@Test
	public void testUserDAO() {
		
		 assertNotNull(udao.connect());
		 //cdao.createTable();
		//fail("Not yet implemented");
		 udao.save(new User(0, "test0"));
		 assertEquals(1, udao.listAll().size());
	}

	
	@Test
	public void testCustomerDAO() {
		
		 assertNotNull(cdao.connect());
		 //cdao.createTable();
		//fail("Not yet implemented");
		 cdao.save(new Customer(0, "test0"));
		 assertEquals(1, cdao.listAll().size());
	}
}
