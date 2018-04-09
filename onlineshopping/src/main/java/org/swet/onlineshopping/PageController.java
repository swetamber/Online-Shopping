package org.swet.onlineshopping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PageController {

	@RequestMapping(value={"/", "/index"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting","Welcome to Spring MVC "); 
		return mv;   
	}
	
	
	@RequestMapping(value="/home")
	public ModelAndView home()
	{
		ModelAndView mv = new ModelAndView("page_backup");
		mv.addObject("greeting", "Welcome to second Page");
		return mv;
	}
	
}
