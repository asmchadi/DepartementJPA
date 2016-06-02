package com.department.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.department.utils.Status;
import com.department.utils._TableNames;

/**
 * Entity implementation class for Entity: Enseignant
 *
 */

@Entity
@Table(name = _TableNames.Enseignant)
public class Enseignant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nom;
	private String prenom;
	private String email;
	private String login;
	private String password;
	private String role;
	private Status isValide;
	@Lob
	private Byte[] cvData;
	private String cvName;
	private String cvContentType;
	
	public Enseignant() {
		super();
	}

	public Enseignant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = nom.toLowerCase() + "@edep";
		this.password = nom.toLowerCase();
	}

	public Enseignant(String nom, String prenom, String login, String password, String role) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.role = role;
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


	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}


	public Status getIsValide() {
		return isValide;
	}

	public void setIsValide(Status isValide) {
		this.isValide = isValide;
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
