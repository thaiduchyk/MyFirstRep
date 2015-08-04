//package com.logos.java.service.impl;
//
//import java.util.Map;
//
//import com.logos.java.DAO.impl.BasketDAU;
//import com.logos.java.entity.Article;
//import com.logos.java.entity.Basket;
//import com.logos.java.entity.User;
//import com.logos.java.service.inter.ArticleInBasket;
//
//public class ArticleInBasketImpl implements ArticleInBasket {
//
//	public void addToBasket(User user, Article article) {
//		if (BasketDAU.getBaskets().isEmpty() || !BasketDAU.getBaskets().containsKey(user)){
//			BasketDAU.getBaskets().put(user, new Basket());
//		} 
//		BasketDAU.getBaskets().get(user).getArticlesInBasket().put(article, 1);
//
//	}
//
//	public void deleteFromBasket(User user, Article article) {
//		if (BasketDAU.getBaskets().isEmpty() || !BasketDAU.getBaskets().containsKey(user)){
//			System.out.println("Basket for this user does not exist");
//		} 
//		BasketDAU.getBaskets().get(user).getArticlesInBasket().remove(article);
//	}
//
//	public void changeQuantity(User user, Article article, Integer quantity) {
//		if (BasketDAU.getBaskets().isEmpty() || !BasketDAU.getBaskets().containsKey(user)){
//			System.out.println("Basket for this user does not exist");
//		} 
//		BasketDAU.getBaskets().get(user).getArticlesInBasket().put(article,quantity);
//
//	}
//	
//	public double sumArticlesInBasket(User user){
//		double k;
//		double prevSum;
//		double sum = 0;
//		for (Map.Entry<Article, Integer> entry : BasketDAU.getBaskets().get(user).getArticlesInBasket().entrySet()){
//			k = entry.getKey().getPrice() * entry.getValue();
//			prevSum = sum;
//			sum = prevSum + k;
//		}
//		return sum;
//	}
//
//}
