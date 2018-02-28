package com.gc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * author: Antonella Solomon
 *
 */

@Controller
public class HomeController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		String message = "<br><div style='text-align:center;'>"
				+ "<h3>This message is coming from HomeController.java yo</h3>" + "<h1>Doofus</h1>";
		
		String message2 = "<p>This trying two string in one ModelAndView method</p>";
		return new ModelAndView("welcome", "message", message2);
	}
	
	@RequestMapping("/NewFile")
	public ModelAndView helloWorld2() {

		String message2 = "<br><div style='text-align:right;'>"
				+ "<h3>Try this</h3>";
		return new ModelAndView("NewFile", "message2", message2);
	}
}
