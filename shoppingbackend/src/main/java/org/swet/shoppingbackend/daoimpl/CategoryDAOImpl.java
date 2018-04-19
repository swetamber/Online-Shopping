package org.swet.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.swet.shoppingbackend.dao.CategoryDAO;
import org.swet.shoppingbackend.dto.Category;


@Service
public class CategoryDAOImpl implements CategoryDAO{

	
	private static List<Category> categories = new ArrayList<>();
	
	
	static
	{
		Category category = new Category();
		category.setId(1);
		category.setName("Tevevision");
		category.setDescription("Description for Television");
		category.setImgageURL("CAT1.png");
		
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("Description for Mobile");
		category.setImgageURL("CAT2.png");
		
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("Description for Laptop");
		category.setImgageURL("CAT3.png");
		
		categories.add(category);
		
		
	}
	
	@Override
	public List<Category> list() {
		return categories;
	}

	@Override
	public Category get(int id) {
		
		for(Category category : categories)
		{
			if(category.getId()==id)
				return category;
		}
		
		return null;
	}

}
