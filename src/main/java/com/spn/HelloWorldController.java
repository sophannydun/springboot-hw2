package com.spn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	@RequestMapping(value= {"/","/home","index"})
	public String indexPage() {
		System.out.println("Home Page.");
		return "index";
	}
	
	@RequestMapping("/contact")
	public String aboutPage() {
		System.out.println("Contact Page.");
		return "frontend/contact";
	}
	@ResponseBody
	@RequestMapping("/testParam")
	public String testParam(@RequestParam (name="name") String name)  {
		System.out.println(name);
		return name;
	}
	@ResponseBody
	@RequestMapping("/testPath/{name}")
	public String testPath(@PathVariable (name="name") String name)  {
		System.out.println(name);
		return name;
	}
	
}
