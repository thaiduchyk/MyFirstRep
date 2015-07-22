package com.logos.java.entity;

import java.util.HashSet;
import java.util.Set;

public class User {
	
	private int id;
	private String name;
	private String surname;
	private String login;
	private String password;
	private String email;
	private int age;
	private Basket basket;
	
	private Set orders = new HashSet();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Basket getBasket() {
		return basket;
	}
	public void setBasket(Basket basket) {
		this.basket = basket;
	}
	
	public Set getOrders() {
		return orders;
	}
	public void setOrders(Set orders) {
		this.orders = orders;
	}
	public User(String name, String surname, String login, String password,
			String email, int age) {
		super();
		
		this.name = name;
		this.surname = surname;
		this.login = login;
		this.password = password;
		this.email = email;
		this.age = age;
	}
	
	public User(){
		
	}
	
//	public String toString() {
//		return "User [id=" + id + ", name=" + name + ", surname=" + surname
//				+ ", login=" + login + ", password=" + password + ", email="
//				+ email + ", age=" + age + "]";
//	}
	
	
	
}
