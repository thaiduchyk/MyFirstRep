package com.logos.java.DAO.impl;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.logos.java.DAO.inter.ArticleDAO;
import com.logos.java.entity.Article;
import com.logos.java.entity.Order;
import com.logos.java.entity.User;
import com.logos.java.util.HibernateUtil;
@Repository
public class ArticleDAOImpl implements ArticleDAO {
	@Override
	public void addArticle(Article article) throws SQLException {
		Session session = null;
	    try {
	      session = HibernateUtil.getSessionFactory().openSession();
	      session.beginTransaction();
	      session.save(article);
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
	public void deleteArticle(Article article) throws SQLException {
		Session session = null;
	    try {
	      session = HibernateUtil.getSessionFactory().openSession();
	      session.beginTransaction();
	      session.delete(article);
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
