//package com.logos.java.service.impl;
//
//
//
//import java.sql.SQLException;
//import java.util.HashSet;
//import java.util.Set;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.stereotype.Component;
//
//import com.logos.java.DAO.impl.ArticleDAOImpl;
//import com.logos.java.DAO.impl.OrderDAOImpl;
//import com.logos.java.DAO.impl.UserDAOImpl;
//import com.logos.java.entity.Article;
//import com.logos.java.entity.Basket;
//import com.logos.java.entity.Order;
//import com.logos.java.entity.User;
//@Component
//public class Test {
//
//	static ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontex.xml");
//	
//	
//	public static void main(String[] args) throws SQLException {
//		// TODO Auto-generated method stub
//		
//		UserDAOImpl ud = (UserDAOImpl) context.getBean("userDAOImpl");
//		OrderDAOImpl od = (OrderDAOImpl) context.getBean("orderDAOImpl");
//		ArticleDAOImpl ad = (ArticleDAOImpl) context.getBean("articleDAOImpl");
//		UserServiceImpl usi = new UserServiceImpl();
//		
//		User u6 = (User) context.getBean("User");
//		u6.setId(1);
//		u6.setName("ivrran");
//		u6.setSurname("perrrtrov");
//		u6.setLogin("iv");
//		u6.setPassword("xrrxx");
//		u6.setEmail("i@h.crrom");
//		u6.setAge(23);
//				
//		usi.modifyUser(u6);	
//		
//		
//		
//		
////		Article ar1 = new Article ("vefve","kfvkvf","njfr","uifrfhrw",23.5,"jvjefvj","bjvfkvb");
////		Article ar2 = new Article ("fve","vkvf","nr","frfhrw",23.6,"jefvj","vfkvb");
////		Article ar3 = new Article ("vve","kfvk","nr","uifw",26,"vj","bvb");
////		
////		
////		
////				
////		
////		Order or1 = new Order("12/12/12", u1, 200.1);
////		Order or2 = new Order("12/12/12", u1, 250.45);
////		
////		
////		
////		Set ordersSet = new HashSet<>();
////		ordersSet.add(or1);
////		ordersSet.add(or2);
////		
////		ar1.setOrders(ordersSet);
////		
////		od.addOrder(or1);
////		od.addOrder(or2);
////		
////		
////		
////		
////		ad.addArticle(ar1);
////		ad.addArticle(ar2);
////		ad.addArticle(ar3);
////		
////				
//	}
//	
//	
//}
//
