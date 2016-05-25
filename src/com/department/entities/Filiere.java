package com.department.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.department.utils.CommonWithFile;
import com.department.utils._TableNames;

@Entity
@Table(name = _TableNames.Filiere)
public class Filiere extends CommonWithFile{

	@ManyToOne
	private Cycle cycle;
	@ManyToOne
	private Formation formation;
	@OneToOne
	private Enseignant coordonnateur;
	public Filiere() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Filiere(Long id, String intitule, Cycle cycle,
			Formation formation, Enseignant coordonnateur, byte[] file_data,
			String file_name, String file_contentType) {
		super(id, intitule, file_data, file_name, file_contentType);
		this.cycle = cycle;
		this.formation = formation;
		this.coordonnateur = coordonnateur;
	}


	public Filiere(Long id, String intitule, Cycle cycle, Formation formation,
			Enseignant coordonnateur) {
		super(id, intitule);
		this.cycle = cycle;
		this.formation = formation;
		this.coordonnateur = coordonnateur;
	}


	public Cycle getCycle() {
		return cycle;
	}
	public void setCycle(Cycle cycle) {
		this.cycle = cycle;
	}
	public Formation getFormation() {
		return formation;
	}
	public void setFormation(Formation formation) {
		this.formation = formation;
	}
	public Enseignant getCoordonnateur() {
		return coordonnateur;
	}
	public void setCoordonnateur(Enseignant coordonnateur) {
		this.coordonnateur = coordonnateur;
	}
	
	
	
}
