package com.restroo.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.restroo.entity.AdminUser;
import com.restroo.services.AdminUserService;
@Repository("adminUserService")
public class AdminLoginDao implements AdminUserService {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	//SessionFactory factory= new Configuration().configure().buildSessionFactory();
	//Session session= factory.openSession();
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	public List adminLogin(){
		Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
       List list =session.createQuery("from AdminUser").list();
        
        return list;
		
	}

	public void addUser() {
		
		
	}
}
