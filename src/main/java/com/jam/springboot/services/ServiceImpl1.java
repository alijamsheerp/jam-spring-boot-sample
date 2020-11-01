package com.jam.springboot.services;

import org.springframework.stereotype.Service;

@Service("serviceImpl1")
public class ServiceImpl1 implements Iservice {

	@Override
	public String method1() {
		System.out.println("Inside the method1() of the ServiceImpl1 class");
		return "Inside the method1() of the ServiceImpl1 class";
	}

}
