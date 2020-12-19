package com.anc.entities;

public class anc {
	private int code;
	private String nom;
	private String prenom;
	private int age;
	public anc(int code, String nom,String prenom,int age)
	{
		super();
		this.code=code;
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
	}
	public anc(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom=prenom;
		this.age=age;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		
		return "Profile [code: "+code+" Nom :"+nom+" "+prenom+" age :"+age+" ]";
	}
	

}
