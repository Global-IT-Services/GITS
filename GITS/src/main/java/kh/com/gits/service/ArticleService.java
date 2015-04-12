package kh.com.gits.service;

import java.util.List;

import kh.com.gits.model.ArticleModel;

public interface ArticleService {
	
	public boolean addArticle(ArticleModel article);
	public boolean deleteArticleById(Integer id);
	public boolean updateArticle(ArticleModel article);
	public List<ArticleModel> getAllArticles();
	public ArticleModel getArticleById(Integer id);

}
