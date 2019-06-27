package org.swet.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.swet.shoppingbackend.dao.CategoryDAO;
import org.swet.shoppingbackend.dto.Category;


@Service
@Transactional
public class CategoryDAOImpl implements CategoryDAO{

	
	@Autowired
	private SessionFactory sessionFactory;
	
	/*
	 * private static List<Category> categories = new ArrayList<>();
	 * 
	 * 
	 * static { Category category = new Category(); category.setId(1);
	 * category.setName("Tevevision");
	 * category.setDescription("Description for Television");
	 * category.setImgageURL("CAT1.png");
	 * 
	 * categories.add(category);
	 * 
	 * category = new Category(); category.setId(2); category.setName("Mobile");
	 * category.setDescription("Description for Mobile");
	 * category.setImgageURL("CAT2.png");
	 * 
	 * categories.add(category);
	 * 
	 * category = new Category(); category.setId(3); category.setName("Laptop");
	 * category.setDescription("Description for Laptop");
	 * category.setImgageURL("CAT3.png");
	 * 
	 * categories.add(category);
	 * 
	 * 
	 * }
	 */	
	@Override
	public List<Category> list() {
		return null;
	}

	@Override
	public Category get(int id) {
		
		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

	@Override
	public boolean addCategory(Category category) {
		
		try
		{
			sessionFactory.getCurrentSession().persist(category);
			return true;
		}
		catch (Exception e) 
		{			
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean updateCategory(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCategory(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

}
