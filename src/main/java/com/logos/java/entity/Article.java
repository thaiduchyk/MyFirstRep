package com.logos.java.entity;

import java.util.HashSet;
import java.util.Set;


public class Article {
	private int id;
	private String name;
	private String code;
	private String model;
	private String producer;
	private double price;
	private String category;
	private String fotoURL;
	private Set baskets = new HashSet();
	private Set orders = new HashSet();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getFotoURL() {
		return fotoURL;
	}
	public void setFotoURL(String fotoURL) {
		this.fotoURL = fotoURL;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public Set getBaskets() {
		return baskets;
	}

	public void setBaskets(Set baskets) {
		baskets = baskets;
	}
	
	
	public Set getOrders() {
		return orders;
	}
	public void setOrders(Set orders) {
		this.orders = orders;
	}
	public Article(){
		
	}
	
	public Article(String name, String code, String model, String producer,
			double price, String category, String fotoURL) {
		super();
		
		this.name = name;
		this.code = code;
		this.model = model;
		this.producer = producer;
		this.price = price;
		this.category = category;
		this.fotoURL = fotoURL;
	}
	
	
}
