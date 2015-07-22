package com.logos.java.DAO.impl;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import org.hibernate.Session;

import com.logos.java.DAO.inter.UserDAO;
import com.logos.java.entity.User;
import com.logos.java.util.HibernateUtil;

public class UserDAOImpl implements UserDAO {

	public void addUser(User user) throws SQLException {
		 Session session = null;
		    try {
		      session = HibernateUtil.getSessionFactory().openSession();
		      session.beginTransaction();
		      session.save(user);
		      session.getTransaction().commit();
		    } catch (Exception e) {
		      JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
		    } finally {
		      if (session != null && session.isOpen()) {

		        session.close();
		      }
		    }
	}

	public void updateUser(int user_id, User user) throws SQLException {
		Session session = null;
	    try {
	      session = HibernateUtil.getSessionFactory().openSession();
	      session.beginTransaction();
	      session.update(user);
	      session.getTransaction().commit();
	    } catch (Exception e) {
	      JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	}

	public User getUserByLogin(String login) throws SQLException {
		 Session session = null;
		    User user = null;
		    try {
		      session = HibernateUtil.getSessionFactory().openSession();
		      user = (User) session.load(User.class, login);
		    } catch (Exception e) {
		      JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'findById'", JOptionPane.OK_OPTION);
		    } finally {
		      if (session != null && session.isOpen()) {
		        session.close();
		      }
		    }
		    return user;
	}

	public void deleteUser(User user) throws SQLException {
		Session session = null;
	    try {
	      session = HibernateUtil.getSessionFactory().openSession();
	      session.beginTransaction();
	      session.delete(user);
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
