package com.itwillbs.controller;


import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itwillbs.dao.TestDAO;

@Controller
public class TestController {

	@Inject
	TestDAO testDAO;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		System.out.println("gd");
		
		testDAO.getMember();
		
		return "test";
	}
}
