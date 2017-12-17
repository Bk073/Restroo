package com.restroo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.restroo.entity.MenuItems;
import com.restroo.services.MenuItemsService;
@Repository("menuItemsService")
public class MenuItemsDao implements MenuItemsService{
	
	
	@Autowired
	SessionFactory sessionFactory;
	public void getSessionFactory(){
		this.sessionFactory= new Configuration().configure().buildSessionFactory();
	}
	public MenuItems getByItemName(String itemName){
		Session session = sessionFactory.openSession();
	    MenuItems items = session.get(MenuItems.class, itemName);
		session.close();
		return items;
	}
	public void addItems(MenuItems menuItems) {
		//SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(menuItems);
		session.getTransaction().commit();
	}

	public void deleteItems(MenuItems menuItems) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		if(menuItems != null){
			session.delete(menuItems);
			session.getTransaction().commit();
			session.close();
		}
	}

	public void updateItems() {
		// TODO Auto-generated method stub
		
	}
	public List<MenuItems> listMenuItems() {
		Session session = sessionFactory.openSession();
		List<MenuItems> menuItems = session.createQuery("from MenuItems").list();
		return menuItems;
	}

}
