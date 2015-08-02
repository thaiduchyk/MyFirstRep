package com.logos.java.DAO.inter;

import java.sql.SQLException;

import com.logos.java.entity.Article;

public interface ArticleDAO {
	  public void addArticleDAO(Article article) throws SQLException;
	  public void deleteArticleDAO(Article article) throws SQLException;
	  public void updateArticleDAO(Article article) throws SQLException;
}
