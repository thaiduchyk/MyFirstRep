package com.logos.java.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.logos.java.DAO.impl.UserDAU;
import com.logos.java.service.inter.UserService;
import com.logos.java.entity.User;

public class UserServiceImpl implements UserService {

	public void addUser(User user) {
		if (UserDAU.getUsers().isEmpty()){
			UserDAU.getUsers().add(user);
		} else {
				for (User u : UserDAU.getUsers()){
					if (u.getLogin().equals(user.getLogin())){
					System.out.println("This username allready exist");
					return;
					}
				}
				UserDAU.getUsers().add(user);
		}
	}
	
	
	public void deleteUser(User user) {
		int index = 0;
		List<String> logins = new ArrayList<String>();
		for (User u : UserDAU.getUsers()){
			logins.add(u.getLogin());
			if (u.getLogin().equals(user.getLogin())){
				index = UserDAU.getUsers().indexOf(u);
			}
		}
		if (logins.contains(user.getLogin())){
			UserDAU.getUsers().remove(index);
		} else {
			System.out.println("This user does not exist");
		}
}
	
	
	public void modifyUser(User user) {
		int index = 0;
		List<String> logins = new ArrayList<String>();
		for (User u : UserDAU.getUsers()){
			logins.add(u.getLogin());
			if (u.getLogin().equals(user.getLogin())){
				index = UserDAU.getUsers().indexOf(u);
			}
		}
		if (logins.contains(user.getLogin())){
			UserDAU.getUsers().get(index).setId(user.getId());
			UserDAU.getUsers().get(index).setName(user.getName());
			UserDAU.getUsers().get(index).setSurname(user.getSurname());
			UserDAU.getUsers().get(index).setLogin(user.getLogin());
			UserDAU.getUsers().get(index).setPassword(user.getPassword());
			UserDAU.getUsers().get(index).setEmail(user.getEmail());
			UserDAU.getUsers().get(index).setAge(user.getAge());
		} else {
			System.out.println("This user does not exist");
		}
	}

	
}
