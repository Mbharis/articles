package com.inti.formation.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.entities.Article;
import com.inti.formation.imetier.IArticleMetier;


@RestController
@RequestMapping("/apiProduit")
public class WebControllerArticle {
	
	@Autowired
	private IArticleMetier metier;

	public IArticleMetier getMetier() {
		return metier;
		
	}
	public void setMetier(IArticleMetier metier) {
		this.metier = metier;
	}
	@RequestMapping(value="/articles", method=RequestMethod.GET)
	public List<Article> findAll(){
		
		return metier.findAll();		
	}
	
	@RequestMapping(value="/article/{id}", method=RequestMethod.GET)

	public Article findOne(@PathVariable("id") int id){
		return metier.findOne(id);}

	
	@RequestMapping(value="/deletea/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") int ref){
		 metier.delete(ref);}
	

	@RequestMapping(value="/ajouterarticle", method=RequestMethod.POST)
	public Article ajouter(@RequestBody Article a) {
		return metier.ajouter(a);
	}
	
	
	@RequestMapping(value="/updatearticle", method=RequestMethod.PUT)
	public Article update(@RequestBody Article a) {
		return metier.update(a);}
	
	
}
