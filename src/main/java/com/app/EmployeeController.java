package com.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class EmployeeController {
	@RequestMapping("/show")
	public String show(){
	
	return "home";
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.POST)
	public ModelAndView employee(@ModelAttribute("employee") Employee emp){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display");
		return mv;
	}

}
