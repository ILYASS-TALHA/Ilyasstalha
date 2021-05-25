package com.model;

public class Liver {
	protected  int id;
	protected  String Auteur,Titre,Categorie;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuteur() {
		return Auteur;
	}
	public void setAuteur(String auteur) {
		Auteur = auteur;
	}
	public String getTitre() {
		return Titre;
	}
	public void setTitre(String titre) {
		Titre = titre;
	}
	public String getCategorie() {
		return Categorie;
	}
	public void setCategorie(String categorie) {
		Categorie = categorie;
	}
	@Override
	public String toString() {
		return "Liver [id=" + id + ", Auteur=" + Auteur + ", Titre=" + Titre + ", Categorie=" + Categorie + "]";
	}
	public Liver(int id, String auteur, String titre, String categorie) {
		super();
		this.id = id;
		Auteur = auteur;
		Titre = titre;
		Categorie = categorie;
	}
	public Liver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Liver(String auteur, String titre, String categorie) {
		super();
		Auteur = auteur;
		Titre = titre;
		Categorie = categorie;
	}
	
	

	

}
