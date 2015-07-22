package com.logos.java.service.inter;

import com.logos.java.entity.Article;
import com.logos.java.entity.User;

public interface ArticleInBasket {
	public void addToBasket (User user, Article article);
	public void deleteFromBasket (User user, Article article);
	public void changeQuantity (User user, Article article, Integer quantity);
}


