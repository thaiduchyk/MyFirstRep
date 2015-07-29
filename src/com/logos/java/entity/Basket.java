package com.logos.java.entity;



import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Basket {
	
	private int id;
	private User user;
	private Set articles = new HashSet();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Set getArticles() {
		return articles;
	}
	public void setArticles(Set articles) {
		articles = articles;
	}
	public Basket() {
		
	}
	
	
}
