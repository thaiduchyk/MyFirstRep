package com.logos.java.DAO.inter;

import java.sql.SQLException;

import com.logos.java.entity.Article;

public interface ArticleDAO {
	  public void addArticle(Article article) throws SQLException;
	  public void deleteArticle(Article article) throws SQLException;
}
