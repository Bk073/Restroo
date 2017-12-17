package com.restroo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.restroo.dao.MenuItemsDao;
import com.restroo.entity.MenuItems;
;

@Controller
@RequestMapping("/")
public class HomePageController {
	
	@Autowired
	MenuItemsDao menuItemsDao;
	@RequestMapping(value="Home")
	public ModelAndView homePage(){
		return new ModelAndView("Home");
	}
//	@RequestMapping(value="/", method=RequestMethod.GET)
	@RequestMapping(value="/onlineOrder", method=RequestMethod.GET)
	public String listMenuItems(Model model){
		model.addAttribute("menuItems", new MenuItems());
		model.addAttribute("listMenuItems", this.menuItemsDao.listMenuItems());
		// ModelAndView mav = new ModelAndView("menuItems") ;
	      //  List<MenuItems> menuItems = menuItemsDao.listMenuItems();
	       // mav.addObject("item", menuItems);  
	       // return mav;
		//return model;
		//model.addAllAttributes(this.menuItemsDao.listMenuItems());
		//return null;
		return "onlineOrder";
	}
	@RequestMapping(value="/contact", method=RequestMethod.GET)
	public ModelAndView contact(){
		return new ModelAndView("contact");
	}
	
	
}
