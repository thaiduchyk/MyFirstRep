package com.logos.java.DAO.impl;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.logos.java.DAO.inter.ArticleDAO;
import com.logos.java.DAO.inter.UserDAO;
import com.logos.java.entity.Article;
import com.logos.java.entity.Order;
import com.logos.java.entity.User;
import com.logos.java.util.HibernateUtil;
@Repository
public class ArticleDAOImpl implements ArticleDAO {
	

		public void addArticleDAO(Article article) throws SQLException {
			 Session session = null;
			    try {
			      session = HibernateUtil.getSessionFactory().openSession();
			      session.beginTransaction();
			      
			      session.save(article);
			      session.getTransaction().commit();
			    } catch (Exception e) {
			      JOptionPane.showMessageDialog(null, e.getMessage(), "Помилка БД при додаванні нового користувача", JOptionPane.OK_OPTION);
			    } finally {
			      if (session != null && session.isOpen()) {

			        session.close();
			      }
			    }
		}

		public void updateArticleDAO(Article article) throws SQLException {
			Session session = null;
		    try {
		      session = HibernateUtil.getSessionFactory().openSession();
		      session.beginTransaction();
		      session.update(article);
		      session.getTransaction().commit();
		    } catch (Exception e) {
		      JOptionPane.showMessageDialog(null, e.getMessage(), "Помилка БД при додаванні нового користувача", JOptionPane.OK_OPTION);
		    } finally {
		      if (session != null && session.isOpen()) {
		        session.close();
		      }
		    }
		}

		public void deleteArticleDAO(Article article) throws SQLException {
			Session session = null;
		    try {
		      session = HibernateUtil.getSessionFactory().openSession();
		      session.beginTransaction();
		      session.delete(article);
		      session.getTransaction().commit();
		    } catch (Exception e) {
		      JOptionPane.showMessageDialog(null, e.getMessage(), "Помилка БД при видаленні нового користувача", JOptionPane.OK_OPTION);
		    } finally {
		      if (session != null && session.isOpen()) {
		        session.close();
		      }
		    }
		}
		
			
		public List<String> getCodes() throws SQLException {
			Session session = null;
			List<String> result = null;
		    try {
		      session = HibernateUtil.getSessionFactory().openSession();
		      session.beginTransaction();
		      result = session.createQuery("SELECT A.code from Article as A").list();
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

		
		
		public ArticleDAOImpl() {
			
		}

		
}

