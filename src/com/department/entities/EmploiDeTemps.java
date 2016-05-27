package com.department.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.department.utils.CommonWithFile;
import com.department.utils._TableNames;

@Entity
@Table(name = _TableNames.EmploiDeTemps)
public class EmploiDeTemps extends CommonWithFile{

	@ManyToOne
	private Filiere filiere;
	private Integer semestre;
	private String annee_universitaire;
	public EmploiDeTemps(Long id, String intitule, Filiere filiere,
			Integer semestre, String annee_universitaire) {
		super(id, intitule);
		this.filiere = filiere;
		this.semestre = semestre;
		this.annee_universitaire = annee_universitaire;
	}
	public EmploiDeTemps(Long id, String intitule, Filiere filiere,
			Integer semestre, String annee_universitaire, byte[] file_data,
			String file_name, String file_contentType) {
		super(id, intitule, file_data, file_name, file_contentType);
		this.filiere = filiere;
		this.semestre = semestre;
		this.annee_universitaire = annee_universitaire;
	}
	public EmploiDeTemps() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Filiere getFiliere() {
		return filiere;
	}
	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
	public Integer getSemestre() {
		return semestre;
	}
	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}
	public String getAnnee_universitaire() {
		return annee_universitaire;
	}
	public void setAnnee_universitaire(String annee_universitaire) {
		this.annee_universitaire = annee_universitaire;
	}
	
	
}
