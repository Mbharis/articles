package com.inti.formation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.inti.formation.entities.Article;
import com.inti.formation.imetier.IArticleMetier;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BootArticleApplication   {
	
	@Autowired
	private IArticleMetier metier;

	
	@Bean
	public Docket ArticleApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.inti.formation")).build();}
	public static void main(String[] args) {
		SpringApplication.run(BootArticleApplication.class, args);
	}

	public void run(String... args) throws Exception {
		
		
	
		Article p = new Article(3,"Le dragon de tonerre", "le dragon attaque le roi", "/eau", "24 avril 2018");
		Article p1= new Article(4,"Le dragon de glace", "le dragon attaque la reine", "/feu", "28 avril 2018");
	metier.ajouter(p);
		metier.ajouter(p1);
	
	//	System.out.println(metier.findOne(1));
//		List<Article> articles=metier.findAll();
//		for (Article article : articles) {
//			System.out.println(article);}
	//	System.out.println(metier.rechercheParId(1);
		
	}

}
