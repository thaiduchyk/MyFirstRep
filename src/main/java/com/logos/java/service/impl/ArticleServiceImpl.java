//package com.logos.java.service.impl;
//
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.logos.java.DAO.impl.ArticleDAU;
//import com.logos.java.DAO.impl.UserDAOImpl;
//import com.logos.java.DAO.impl.UserDAU;
//import com.logos.java.entity.Article;
//import com.logos.java.entity.User;
//import com.logos.java.service.inter.ArticleService;
//
//public class ArticleServiceImpl implements ArticleService {
//
//private ArticleDAOImpl ad;
//	
//	public ArticleDAOImpl getAd() {
//		return ad;
//	}
//
//	public void setAd(ArticleDAOImpl ud) {
//		this.ad = ad;
//	}
//
//	public void addArticle(Article article) {
//		try {
//			if (ad.getCodes().isEmpty() || !ad.getLogins().contains(article.getCodes())){
//				ad.addArticleDAO(article);
//			} else {
//						System.out.println("This username allready exist");
//					}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//
//	
//	
//
//	@Override
//	public void modifyUser(Article article) {
//		try {
//			if (ad.getCodes().isEmpty() || !ad.getLogins().contains(article.getCodes())){
//				System.out.println("This user does not exist");
//				} else {
//			ud.updateUserDAO(user);		
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//	
//	
//	@Override
//	public void deleteUser(Article article) {
//		try {
//			if (ad.getCodes().isEmpty() || !ad.getLogins().contains(article.getCodes())){
//				System.out.println("This user does not exist");
//				} else {
//			ud.deleteUserDAO(user);		
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//}
//}
