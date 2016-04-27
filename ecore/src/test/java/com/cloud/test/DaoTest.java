package com.cloud.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cloud.admin.model.Category;
import com.cloud.service.impl.CategoryDAOImpl;

import junit.framework.TestCase;

public class DaoTest extends TestCase {
	CategoryDAOImpl cdao = new CategoryDAOImpl();
	@Before
	public void setUp() throws Exception {
		System.out.println("===========Create table=============");
		cdao.createTable();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("===========Drop table=============");
		cdao.dropTable();
	}

	@Test
	public void testCategoryDAO() {
		
		 assertNotNull(cdao.connect());
		 //cdao.createTable();
		//fail("Not yet implemented");
		 cdao.save(new Category(0, "test0"));
		 assertEquals(1, cdao.listAll().size());
	}

}
