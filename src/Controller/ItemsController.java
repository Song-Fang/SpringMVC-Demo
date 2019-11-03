package Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import pojo.Items;

public class ItemsController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
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
		
		modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		
		return modelAndView;
	}

}
