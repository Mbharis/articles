package com.inti.formation.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.entities.Article;
import com.inti.formation.imetier.IArticleMetier;
import com.inti.formation.repository.IArticleRepository;
@Service
public class ArticleMetier implements IArticleMetier{

	@Autowired
	IArticleRepository prodrepo;
	public IArticleRepository getProdrepo() {
		return prodrepo;
	}

	public void setProdrepo(IArticleRepository prodrepo) {
		this.prodrepo = prodrepo;
	}

	@Override
	public Article ajouter(Article p) {
		// TODO Auto-generated method stub
		return prodrepo.save(p);
	}

	@Override
	public Article update(Article p) {
		// TODO Auto-generated method stub
		return prodrepo.save(p);
	}

	@Override
	public void delete(Integer ref) {
      prodrepo.deleteById(ref);		
	}

	@Override
	public Article findOne(Integer id) {
		// TODO Auto-generated method stub
		return prodrepo.getOne(id);
	}

	@Override
	public List<Article> findAll() {
		// TODO Auto-generated method stub
		return prodrepo.findAll()
				;
	}

	@Override
	public Article rechercheParId(int id) {
		// TODO Auto-generated method stub
		return prodrepo.findById(id);
	}

	
}
