package com.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping("/hellobean/{name}")
	public HelloBean helloBean(@PathVariable String name) {
		return new HelloBean(String.format("Hello World %s", name));
	}

}
