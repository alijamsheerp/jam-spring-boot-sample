package com.jam.springboot.controllers;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jam.springboot.services.Iservice;

@RestController
@RequestMapping("/inject/v1")
public class AtResourceExample {

	/**
	 * Since there are more than one implementation of the Iservice, we need to
	 * specify the implementation bean to injected here. The name of the bean can
	 * be passed to the Resource annotation
	 */
	@Resource(name="serviceImpl1")
	Iservice service;

	/**
	 * Try using http://localhost:8080/inject/v1/method1
	 */
	@GetMapping("/method1")
	public String ping() {
		return service.method1();
	}

}
