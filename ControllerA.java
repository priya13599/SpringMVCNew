package com.nucleus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerA {
	
	@RequestMapping("/abc")
	public ModelAndView request1()
	{
		return new ModelAndView("result");
	}

}
