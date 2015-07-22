package com.logos.java.entity;



import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Basket {
	
	private int id;
	private User user;
//	private Set Articles = new HashSet();
	
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
//	public Set getArticles() {
//		return Articles;
//	}
//	public void setArticles(Set articles) {
//		Articles = articles;
//	}
	public Basket() {
		
	}
	
//	public String toString() {
//		return "Basket [id=" + id + ", user=" + user + ", Articles=" + Articles
//				+ "]";
//	}
	
		
	
}
