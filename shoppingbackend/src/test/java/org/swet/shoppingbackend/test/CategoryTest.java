package org.swet.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.swet.shoppingbackend.dao.CategoryDAO;
import org.swet.shoppingbackend.dto.Category;


@ContextConfiguration(locations = "classpath*:hibernate-config.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class CategoryTest {

	//private static ApplicationContext context;
	
	private static AnnotationConfigApplicationContext context;
	
	@Autowired
	private CategoryDAO categoryDAO;

	private Category category;



	/*
	 * @BeforeClass public static void init() { //context = new
	 * ClassPathXmlApplicationContext("hibernate-config.xml"); context = new
	 * AnnotationConfigApplicationContext();
	 * context.scan("org.swet.shoppingbackend"); //context.refresh(); categoryDAO =
	 * (CategoryDAO)context.getBean("categoryDAO");
	 * System.out.println("Before class"); }
	 */


	@Test
	public void testAddCategory()
	{
		category = new Category();
		category.setName("Television");
		category.setDescription("This is some description for television");
		category.setImgageURL("CAT_1.png");

		assertEquals("Sussessfully added a category inside database table", true, categoryDAO.addCategory(category));
	}
}
