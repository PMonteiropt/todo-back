package com.kls.rest.webservices.restfulwebservices.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kls.rest.webservices.entity.HelloWorldBean;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class HelloWorldController {
    
    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public String helloWorld() {
	return "Hello World";
    }
    
    @RequestMapping(value = "/hello-world-bean", method = RequestMethod.GET)
    public HelloWorldBean helloWorldBean() {
	//throw new RuntimeException("Some error");
	return new HelloWorldBean("Batatas");
    }
    
    @RequestMapping(value = "/hello-world-param/{id}", method = RequestMethod.GET)
    public HelloWorldBean helloWorldBeanParam(@PathVariable Long id) {
	return new HelloWorldBean("Cebolas");
    }
}
