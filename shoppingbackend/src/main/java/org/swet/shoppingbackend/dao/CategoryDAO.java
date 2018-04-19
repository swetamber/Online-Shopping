package org.swet.shoppingbackend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.swet.shoppingbackend.dto.Category;


@Repository
public interface CategoryDAO {

	List<Category> list();
	
	Category get(int id);
}
