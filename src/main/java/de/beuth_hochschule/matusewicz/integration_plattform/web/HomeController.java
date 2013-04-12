package de.beuth_hochschule.matusewicz.integration_plattform.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	@RequestMapping("/index.html")
	public ModelAndView list() {
	
		return new ModelAndView("/home/index");
	}
}
