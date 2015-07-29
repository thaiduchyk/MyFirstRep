package com.logos.java.DAO.impl;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.logos.java.DAO.inter.UserDAO;
import com.logos.java.entity.User;
import com.logos.java.util.HibernateUtil;
@Repository
public class UserDAOImpl implements UserDAO {

	public void addUserDAO(User user) throws SQLException {
		 Session session = null;
		    try {
		      session = HibernateUtil.getSessionFactory().openSession();
		      session.beginTransaction();
		      user.getBasket().setUser(user);
		      session.save(user);
		      session.getTransaction().commit();
		    } catch (Exception e) {
		      JOptionPane.showMessageDialog(null, e.getMessage(), "Помилка БД при додаванні нового користувача", JOptionPane.OK_OPTION);
		    } finally {
		      if (session != null && session.isOpen()) {

		        session.close();
		      }
		    }
	}

	public void updateUserDAO(int user_id, User user) throws SQLException {
		Session session = null;
	    try {
	      session = HibernateUtil.getSessionFactory().openSession();
	      session.beginTransaction();
	      session.update(user);
	      session.getTransaction().commit();
	    } catch (Exception e) {
	      JOptionPane.showMessageDialog(null, e.getMessage(), "Помилка БД при додаванні нового користувача", JOptionPane.OK_OPTION);
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	}

	public void deleteUserDAO(User user) throws SQLException {
		Session session = null;
	    try {
	      session = HibernateUtil.getSessionFactory().openSession();
	      session.beginTransaction();
	      session.delete(user);
	      session.getTransaction().commit();
	    } catch (Exception e) {
	      JOptionPane.showMessageDialog(null, e.getMessage(), "Помилка БД при видаленні нового користувача", JOptionPane.OK_OPTION);
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	}
	
		
	public List<String> getLogins() throws SQLException {
		Session session = null;
		List<String> result = null;
	    try {
	      session = HibernateUtil.getSessionFactory().openSession();
	      session.beginTransaction();
	      result = session.createQuery("SELECT U.login from User as U").list();
	      session.getTransaction().commit();
	      
	    } catch (Exception e) {
	      JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	        
	      }
	    }
	    return result;
	}
}
