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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
	
	@RequestMapping(value = "/tui", method = RequestMethod.GET)
	public String tui(Model model) {
		return "tui";
	}
	
	@GetMapping("/test/cinema")
	@ResponseBody
	public String cinema() throws JsonProcessingException {
		
		String json = new ObjectMapper().writeValueAsString(testDAO.getMember());
		System.out.println(json);
		
		return "{\"result\": true, \"data\": {\"contents\": "+ json +",\"pagination\": {\"page\": 1, \"totalCount\": 100}}}";
	}
}






























