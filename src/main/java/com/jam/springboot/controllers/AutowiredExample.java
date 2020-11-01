package com.jam.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jam.springboot.services.Iservice;

@RestController
@RequestMapping("/autowired/v1")
public class AutowiredExample {

	/**
	 * Since there are more than one implementation of the Iservice,
	 * we need to specify the implementation bean to injected here.
	 * the @Qualifier annotation is used to specify that.
	 * We can mark any one of those implementation with @Primary annotation as well
	 */
	@Autowired
	@Qualifier("serviceImpl2")
	Iservice service;
	
	/**
	 * Try using
	 * http://localhost:8080/autowired/v1/method1
	 */
	@GetMapping("/method1")
	public String ping() {
		return service.method1();
	}
}
