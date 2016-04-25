package com.cloud.test;

import static org.junit.Assert.fail;
import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cloud.admin.dao.CategoryDAO;
import com.cloud.admin.dao.CategoryDAOImpl;
import com.cloud.admin.dao.SqliteDAO;
import com.cloud.admin.model.Category;

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
