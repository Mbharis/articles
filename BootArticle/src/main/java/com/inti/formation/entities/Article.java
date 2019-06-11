package com.inti.formation.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Article implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String titre;
	private String contenu;
	private String url;
	private String parution;
	public Article() {
		super();
	}
	public Article(int id, String titre, String contenu, String url, String parution) {
		super();
		this.id = id;
		this.titre = titre;
		this.contenu = contenu;
		this.url = url;
		this.parution = parution;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getParution() {
		return parution;
	}
	public void setParution(String parution) {
		this.parution = parution;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", titre=" + titre + ", contenu=" + contenu + ", url=" + url + ", parution="
				+ parution + "]";
	}
	
	
}
