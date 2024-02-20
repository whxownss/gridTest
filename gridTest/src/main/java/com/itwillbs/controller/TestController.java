package com.itwillbs.controller;


import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itwillbs.dao.TestDAO;
import com.itwillbs.tui.TuiGrid;

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
//	, produces = "application/json;charset=UTF-8"
	@GetMapping(value = "/test/cinema")
	@ResponseBody
	public String cinema(@RequestParam Map<String, String> map) {
		return TuiGrid.resourceData(map, testDAO.getMember());
	}
}






























