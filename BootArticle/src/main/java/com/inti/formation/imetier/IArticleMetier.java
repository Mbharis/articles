package com.inti.formation.imetier;

import org.springframework.data.repository.query.Param;

import com.inti.formation.entities.Article;

public interface IArticleMetier extends IGenericMetier<Article, Integer>{

	public Article rechercheParId(int id);
	
	
}
