package com.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

//	@RequestMapping(method = RequestMethod.GET, path = "/hello")
//	path="/hello"
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping("/hellobean")
	public HelloBean helloBean() {
		return new HelloBean("Hello World");
	}

}
