package com.logos.java.DAO.inter;

import java.sql.SQLException;

import com.logos.java.entity.Order;
import com.logos.java.entity.User;

public interface OrderDAO {
	  public void addOrder(Order order) throws SQLException;
	  public void deleteOder(Order order) throws SQLException;
}
