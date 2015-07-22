package com.logos.java.DAO.impl;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import org.hibernate.Session;

import com.logos.java.DAO.inter.OrderDAO;
import com.logos.java.entity.Order;
import com.logos.java.util.HibernateUtil;

public class OrderDAOImpl implements OrderDAO {

	@Override
	public void addOrder(Order order) throws SQLException {
		Session session = null;
	    try {
	      session = HibernateUtil.getSessionFactory().openSession();
	      session.beginTransaction();
	      session.save(order);
	      session.getTransaction().commit();
	    } catch (Exception e) {
	      JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
	    } finally {
	      if (session != null && session.isOpen()) {

	        session.close();
	      }
	    }
		
	}

	@Override
	public void deleteOder(Order order) throws SQLException {
		Session session = null;
	    try {
	      session = HibernateUtil.getSessionFactory().openSession();
	      session.beginTransaction();
	      session.delete(order);
	      session.getTransaction().commit();
	    } catch (Exception e) {
	      JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при удалении", JOptionPane.OK_OPTION);
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
		
	}

}
