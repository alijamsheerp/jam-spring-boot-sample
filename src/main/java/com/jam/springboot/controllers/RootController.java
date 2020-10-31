package com.jam.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/root/v1")
@PropertySource("some-prop-file.properties")
public class RootController {
	
	@Autowired
	Environment env;
	
	@GetMapping("/ping")
	public String ping() {
		System.out.println(env.getProperty("jam.prop.1"));
		return "Ping success - the root conroller is working ::" + env.getProperty("jam.test.prop", String.class);
	}

}
