package com.department.entities;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.department.utils.CommonWithFile;
import com.department.utils._TableNames;

/**
 * Entity implementation class for Entity: ProjetFinEtude
 * 
 */
@Entity
@Table(name = _TableNames.ProjetFinEtude)
public class ProjetFinEtude extends CommonWithFile {

	private String lieu;
	private String participants;
	private String anneeUniversitaire;
	@ManyToOne
	private Filiere filiere;
	@ManyToOne
	private Enseignant encadrants;
	
	@Lob
	protected byte[] pageGarde_data;
	protected String pageGarde_name;
	protected String pageGarde_contentType;	
	
	public ProjetFinEtude() {
		super();
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getParticipants() {
		return participants;
	}

	public void setParticipants(String participants) {
		this.participants = participants;
	}

	public String getAnneeUniversitaire() {
		return anneeUniversitaire;
	}

	public void setAnneeUniversitaire(String anneeUniversitaire) {
		this.anneeUniversitaire = anneeUniversitaire;
	}

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}

	public Enseignant getEncadrants() {
		return encadrants;
	}

	public void setEncadrants(Enseignant encadrants) {
		this.encadrants = encadrants;
	}

	public byte[] getPageGarde_data() {
		return pageGarde_data;
	}

	public void setPageGarde_data(byte[] pageGarde_data) {
		this.pageGarde_data = pageGarde_data;
	}

	public String getPageGarde_name() {
		return pageGarde_name;
	}

	public void setPageGarde_name(String pageGarde_name) {
		this.pageGarde_name = pageGarde_name;
	}

	public String getPageGarde_contentType() {
		return pageGarde_contentType;
	}

	public void setPageGarde_contentType(String pageGarde_contentType) {
		this.pageGarde_contentType = pageGarde_contentType;
	}



}
