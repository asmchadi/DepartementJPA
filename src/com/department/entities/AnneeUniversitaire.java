package com.department.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.department.utils._TableNames;

@Entity
@Table(name = _TableNames.AnneeUniversitaire)
public class AnneeUniversitaire {
	
	@Id
	protected String intitule;
	private boolean isCurrent;
	
	public boolean isCurrent() {
		return isCurrent;
	}

	public void setCurrent(boolean isCurrent) {
		this.isCurrent = isCurrent;
	}

	public AnneeUniversitaire() {
		// TODO Auto-generated constructor stub
	}

	public AnneeUniversitaire(String anneeUniversitaire) {
		this.intitule = anneeUniversitaire;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

}
