package com.itwillbs.controller;


import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itwillbs.dao.TestDAO;

@Controller
public class TestController {

	@Inject
	TestDAO testDAO;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(Model model) {
		System.out.println("gd");
		
		model.addAttribute("memberList", testDAO.getMember());
		
		return "test";
	}
	
	@GetMapping("/test/cinema")
	@ResponseBody
	public ResponseEntity<?> cinema() {
		System.out.println("오기는 하나?");
		return ResponseEntity.ok().body(testDAO.getMember());
	}
}
