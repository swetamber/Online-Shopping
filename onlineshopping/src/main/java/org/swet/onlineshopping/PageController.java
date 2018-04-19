package org.swet.onlineshopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.swet.shoppingbackend.dao.CategoryDAO;
import org.swet.shoppingbackend.dto.Category;


@Controller
public class PageController {

	
	@Autowired
	private CategoryDAO categoryDAO;
	
	
	@RequestMapping(value={"/", "/index","/home"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("userClickHome", true);
		mv.addObject("catogries", categoryDAO.list());
		return mv;   
	}
	
	
	@RequestMapping(value="/about")
	public ModelAndView about()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout", true);
		return mv;   
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView contact(String f)
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact", true);
		return mv;   
	}
	
/***************************************** Method to load all the products *****************************************/	
	
	
	@RequestMapping(value="/show/all/products")
	public ModelAndView showAllProducts()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","All Products");
		mv.addObject("userClickAllProducts", true);
		mv.addObject("catogries", categoryDAO.list());
		return mv;   
	}
	
	
	
	
	@RequestMapping(value="/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id)
	{
		
		Category category = null;
		category = categoryDAO.get(id);
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", category.getName());
		mv.addObject("category", category);
		mv.addObject("userClickCategoryProducts", true);
		mv.addObject("catogries", categoryDAO.list());
		return mv;
		
	}
	
	
}
