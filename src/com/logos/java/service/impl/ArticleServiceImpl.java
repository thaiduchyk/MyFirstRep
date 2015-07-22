package com.logos.java.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.logos.java.DAO.impl.ArticleDAU;
import com.logos.java.DAO.impl.UserDAU;
import com.logos.java.entity.Article;
import com.logos.java.entity.User;
import com.logos.java.service.inter.ArticleService;

public class ArticleServiceImpl implements ArticleService {

	public void addArticle(Article ar) {
		if (ArticleDAU.getArticles().isEmpty()){
			ArticleDAU.getArticles().add(ar);
		} else {
				for (Article a : ArticleDAU.getArticles()){
					if (a.getCode().equals(ar.getCode())){
					System.out.println("This article allready exist");
					return;
					}
				}
				ArticleDAU.getArticles().add(ar);
		}
	}
	
	
	public void deleteArticle(Article ar) {
		int index = 0;
		List<String> codes = new ArrayList<String>();
		for (Article a : ArticleDAU.getArticles()){
			codes.add(a.getCode());
			if (a.getCode().equals(ar.getCode())){
				index = ArticleDAU.getArticles().indexOf(a);
			}
		}
		if (codes.contains(ar.getCode())){
			ArticleDAU.getArticles().remove(index);
		} else {
			System.out.println("This article does not exist");
		}
	}
			

	public void modifyArticle(Article ar) {
		int index = 0;
		List<String> codes = new ArrayList<String>();
		for (Article a : ArticleDAU.getArticles()){
			codes.add(ar.getCode());
			if (a.getCode().equals(ar.getCode())){
				index = ArticleDAU.getArticles().indexOf(a);
			}
		}
		if (codes.contains(ar.getCode())){
			ArticleDAU.getArticles().get(index).setId(ar.getId());
			ArticleDAU.getArticles().get(index).setName(ar.getName());
			ArticleDAU.getArticles().get(index).setCode(ar.getCode());
			ArticleDAU.getArticles().get(index).setModel(ar.getModel());
			ArticleDAU.getArticles().get(index).setProducer(ar.getProducer());
			ArticleDAU.getArticles().get(index).setPrice(ar.getPrice());
			ArticleDAU.getArticles().get(index).setCategory(ar.getCategory());
			ArticleDAU.getArticles().get(index).setFotoURL(ar.getFotoURL());
		} else {
			System.out.println("This article does not exist");
		}
	}

}
