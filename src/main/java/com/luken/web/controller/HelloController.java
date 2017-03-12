package com.luken.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(path = {"hello"})
public class HelloController {
	private static final Logger log = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping(path = {"", "/", "index"})
	public ModelAndView sayHello() {
		System.out.println("Hello ....");
		return new ModelAndView("hello");
	}
}
