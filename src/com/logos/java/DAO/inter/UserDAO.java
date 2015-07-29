package com.logos.java.DAO.inter;

import java.sql.SQLException;

import com.logos.java.entity.User;

public interface UserDAO {
	  public void addUserDAO(User user) throws SQLException;
	  public void updateUserDAO(int user_id, User user) throws SQLException;
	  public void deleteUserDAO(User user) throws SQLException;
}
