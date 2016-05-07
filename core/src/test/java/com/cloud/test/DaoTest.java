package com.cloud.test;

import javax.naming.AuthenticationException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cloud.admin.model.Customer;
import com.cloud.admin.model.User;
import com.cloud.admin.service.impl.CustomerDAOImpl;
import com.cloud.admin.service.impl.UserDAOImpl;
import com.cloud.exception.FieldRequireException;

import junit.framework.TestCase;

public class DaoTest extends TestCase {
	UserDAOImpl udao = new UserDAOImpl();
	CustomerDAOImpl cdao = new CustomerDAOImpl();
	User u0;
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
		 Customer c = new Customer(0, "test0");
		 cdao.save(c);
		 udao.save(new User(0, "test0"));
		 assertEquals(udao.listAll().size(), 1);
		 	User u1  = new User(0, "test1", "test1");
			udao.save(new User(0, "test1", "test1"));
			assertEquals(udao.listAll().size(), 2);
			try {
				u0 = udao.login(u1);
			} catch (AuthenticationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FieldRequireException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 assertNotNull(u0);
		 c = udao.createUser(c, u0);
		 assertNotNull(c);
		 assertEquals(c.getUid(), String.valueOf(u0.getId()));
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
