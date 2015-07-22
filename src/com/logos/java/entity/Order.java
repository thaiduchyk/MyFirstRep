package com.logos.java.entity;

import java.util.HashSet;
import java.util.Set;

public class Order {
	
	private int id;
	private String date;
	private User user;
	private double sum;
	
//	private Set articles = new HashSet();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	
	
	public Order(){
		
	}

	public Order(String date, User user, double sum) {
		super();
		
		this.date = date;
		this.user = user;
		this.sum = sum;
	}

//	@Override
//	public String toString() {
//		return "Order [id=" + id + ", date=" + date + ", user=" + user
//				+ ", sum=" + sum + ", articles=" + articles + "]";
//	}




}
