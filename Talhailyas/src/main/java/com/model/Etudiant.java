package com.model;

public class Etudiant {
	private int  id;
	private String Nom,Prenom,log,pass;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Etudiant(int id, String nom, String prenom, String log, String pass) {
		super();
		this.id = id;
		Nom = nom;
		Prenom = prenom;
		this.log = log;
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", Nom=" + Nom + ", Prenom=" + Prenom + ", log=" + log + ", pass=" + pass + "]";
	}
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Etudiant(String nom, String prenom, String log, String pass) {
		super();
		Nom = nom;
		Prenom = prenom;
		this.log = log;
		this.pass = pass;
	}

	
}
