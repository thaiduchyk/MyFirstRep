package com.logos.java.DAO.inter;

import java.sql.SQLException;

import com.logos.java.entity.User;

public interface UserDAO {
	  public void addUser(User user) throws SQLException;
	  public void updateUser(int user_id, User user) throws SQLException;
	  public User getUserByLogin(String login) throws SQLException;
	  public void deleteUser(User user) throws SQLException;
}
