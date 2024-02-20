package com.itwillbs.tui;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TuiGrid {
	
	public static String resourceData(Map<String, String> map, List data) {
		String jsonData = null;
		try {
			jsonData = new ObjectMapper().writeValueAsString(data);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		int size = data.size();
		
		return "{" + 
			     "\"result\": " + (size > 0 ? true : false) + ", " +
			     "\"data\": {" + 
			                 "\"contents\": "+ jsonData + "," + 
			  			     "\"pagination\": {" + 
			  			     			       "\"page\": " + map.get("page") + ", " + 
			  			     			       "\"totalCount\": " + size + 
			  			     "}" + 
			  			    "}" + 
			   "}";
	}
}
