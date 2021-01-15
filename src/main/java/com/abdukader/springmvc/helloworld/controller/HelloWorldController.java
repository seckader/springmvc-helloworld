package com.abdukader.springmvc.helloworld.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.abdukader.springmvc.helloworld.domain.HelloWorld;

@Controller
public class HelloWorldController {
	
	private static final String HANDLER_ATTRIBUTE = "helloworld";
	
	@GetMapping(path = "/helloworld")
	public String handler(Model model) {
		
		HelloWorld helloWorld = new HelloWorld();
		
		helloWorld.setMessage("Hello World Example Using Spring MVC !!!");
		helloWorld.setDate(LocalDate.now());
		
		model.addAttribute(HANDLER_ATTRIBUTE, helloWorld);
		
		return HANDLER_ATTRIBUTE;
	}

}
