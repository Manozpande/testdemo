package com.test.testdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class OfficeCotroller {
	@GetMapping(value="/form")
	public ModelAndView OpenForm() {
		ModelAndView model=new ModelAndView("test");
		model.addObject("msg", "Welcome attribute");
		return model;
	}

}
