package com.webservices.restfulwebservices.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
//	@RequestMapping(method = RequestMethod.GET, path = "/hello")
//	path="/hello"

	@Autowired
	private MessageSource messageSource;

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

	@GetMapping("/internationalized")
	public String Internationalized(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
		return messageSource.getMessage("message", null, locale);
	}

}
