package com.inti.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.formation.entities.Article;

public interface IArticleRepository extends JpaRepository<Article, Integer>{

	public Article findById(int id);
	
	
}
