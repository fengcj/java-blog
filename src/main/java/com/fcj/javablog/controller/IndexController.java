package com.fcj.javablog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {

	@RequestMapping("/index.html")
	public String index(){
		System.out.println("in IndexController");
		return "index";   // index page defined in /WEB-INF/defs/general.xml
	}
	
	
}
