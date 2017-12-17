package com.restroo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.restroo.dao.AdminLoginDao;
import com.restroo.dao.MenuItemsDao;
import com.restroo.entity.AdminUser;
import com.restroo.entity.MenuItems;

@Controller
@RequestMapping("/admin/*")
public class AdminPageController {
	@Autowired
	MenuItemsDao menuItemsDao;
	@Autowired
	AdminLoginDao adminLoginDao;
	@RequestMapping(value="", method=RequestMethod.GET)
	public ModelAndView addMenuItems(@ModelAttribute MenuItems menuItems){
		
		return new ModelAndView("admin");
		
	}
	@RequestMapping(value="admin/adminLogin", method=RequestMethod.POST)
	public ModelAndView adminLogin(@ModelAttribute("adminUser") AdminUser ad){
		
		  List<AdminUser> adminUser = adminLoginDao.adminLogin();
		    int len = adminUser.size();
	         for(int i=0;i<len;i++){
			 String userN = adminUser.get(i).getUserName();
			 String pass = adminUser.get(i).getPassword();
			 if(userN.equals(ad.getUserName()) && (pass.equals(ad.getPassword()))){
				  return new ModelAndView("adminLogin");
				
				}
	         }
					
		 return new ModelAndView("admin");
	}
	
	@RequestMapping(value="admin/addMenuItems", method=RequestMethod.POST)
	public ModelAndView addMenuItem(@ModelAttribute("menuItems") MenuItems menuItem){
		this.menuItemsDao.addItems(menuItem);
		return new ModelAndView("adminLogin");
	}
	@RequestMapping(value="/deleteMenuItems/{itemName}", method=RequestMethod.GET)
	public ModelAndView deleteMenuItem(@ModelAttribute("menuItems") MenuItems menuItems){
		menuItemsDao.deleteItems(menuItems);
		return new ModelAndView("adminLogin");
		//return ("redirect:/adminLogin");
	
	}
	@RequestMapping(value="/listMenuItems", method=RequestMethod.GET)
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
		return "adminLogin";
	}
	
}
