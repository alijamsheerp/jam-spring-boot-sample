package com.jam.springboot.services;

import org.springframework.stereotype.Service;

@Service("serviceImpl2")
public class ServiceImpl2 implements Iservice {

	@Override
	public String method1() {
		System.out.println("Inside the method1() of the ServiceImpl2 class");
		return "Inside the method1() of the ServiceImpl2 class";
	}

}
