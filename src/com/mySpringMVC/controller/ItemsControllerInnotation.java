package com.mySpringMVC.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.Items;

@Controller
public class ItemsControllerInnotation {
	
	@RequestMapping("/queryItems")
	public ModelAndView queryItems() throws Exception {
		// TODO Auto-generated method stub
		List<Items> itemsList = new ArrayList<Items>();
		Items item1 = new Items();
		item1.setName("Laptop");
		item1.setPrice((float) 4500);
		item1.setDetail("Dell Inspiration");
		
		Items item2 = new Items();
		item2.setName("Monitor");
		item2.setPrice((float)380);
		item2.setDetail("High resolution Monitor");
		
		itemsList.add(item1);
		itemsList.add(item2);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);
		
		modelAndView.setViewName("items/itemsList");
		
		return modelAndView;
	}

}
