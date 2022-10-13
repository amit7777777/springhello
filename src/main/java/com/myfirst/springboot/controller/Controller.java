package com.myfirst.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController

public class Controller {
	

	
	@RequestMapping("/hello")      //REST API End Point
	public String process() {
		
		return "<Marquee><H1>Hello Team ,Njoy Weekend!!!!</H1></Marquee>";
		
	}
}