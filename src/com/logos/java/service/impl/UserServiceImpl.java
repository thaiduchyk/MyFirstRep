package com.logos.java.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.logos.java.DAO.impl.UserDAOImpl;
import com.logos.java.service.inter.UserService;
import com.logos.java.entity.User;

public class UserServiceImpl implements UserService {
	UserDAOImpl ud = new UserDAOImpl();
	

	public void addUser(User user) {
		try {
			if (ud.getLogins().isEmpty() || !ud.getLogins().contains(user.getLogin())){
				ud.addUserDAO(user);
			} else {
						System.out.println("This username allready exist");
					}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	
	

	@Override
	public void modifyUser(User user) {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void deleteUser(User user) {
		try {
			if (ud.getLogins().isEmpty() || !ud.getLogins().contains(user.getLogin())){
				System.out.println("This user does not exist");
				} else {
			ud.deleteUserDAO(user);		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}

	
}
