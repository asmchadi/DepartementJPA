package com.department.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.department.utils._TableNames;

/**
 * Entity implementation class for Entity: Enseignant
 *
 */

@Entity
@Table(name = _TableNames.Enseignant)
public class Enseignant {

	@Id
	private Long id;
	private String nom;
	private String prenom;
	private String email;
	private String login;
	private String password;
	private Boolean isChefDepartement;
	private Boolean isValid;
	@Lob
	private Byte[] cvData;
	private String cvName;
	private String cvContentType;
	
	
	public Enseignant() {
		super();
	}

	/*
	 * creation d'un compte par default
	 */
	public Enseignant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = nom.toLowerCase() + "@edep";
		this.password = nom.toLowerCase();
	}

	public Enseignant(String nom, String prenom, String login, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsChefDepartement() {
		return isChefDepartement;
	}

	public void setIsChefDepartement(Boolean isChefDepartement) {
		this.isChefDepartement = isChefDepartement;
	}

	public Boolean getIsValid() {
		return isValid;
	}

	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}

	public Byte[] getCvData() {
		return cvData;
	}

	public void setCvData(Byte[] cvData) {
		this.cvData = cvData;
	}

	public String getCvName() {
		return cvName;
	}

	public void setCvName(String cvName) {
		this.cvName = cvName;
	}

	public String getCvContentType() {
		return cvContentType;
	}

	public void setCvContentType(String cvContentType) {
		this.cvContentType = cvContentType;
	}
   
}
