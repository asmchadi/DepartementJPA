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
	private Boolean isCurrent;

	public Boolean getIsCurrent() {
		return isCurrent;
	}

	public void setIsCurrent(Boolean isCurrent) {
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.intitule;
	}

}
