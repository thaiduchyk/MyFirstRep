package com.logos.java.service.impl;



import java.sql.SQLException;

import com.logos.java.DAO.impl.OrderDAOImpl;
import com.logos.java.DAO.impl.UserDAOImpl;
import com.logos.java.entity.Basket;
import com.logos.java.entity.Order;
import com.logos.java.entity.User;

public class Test {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		UserDAOImpl ud = new UserDAOImpl();
		OrderDAOImpl od = new OrderDAOImpl();
		
		User u1 = new User ("dsfsd", "dfgsf", "log", "fsffsdf", "fsf", 12);
		Basket b1 = new Basket();
		
		u1.setBasket(b1);
		b1.setUser(u1);
		
		
		ud.addUser(u1);
		
		Order or1 = new Order("12/12/12", u1, 200.1);
		Order or2 = new Order("12/12/12", u1, 250.45);
		
		od.addOrder(or1);
		od.addOrder(or2);
		
		
		
		
	}
	
	
}
