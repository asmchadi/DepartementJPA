package com.department.entities;

import com.department.utils.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Module
 * 
 */
@Entity
@Table(name = _TableNames.Module)
public class Module extends Common {

	private Integer vhCour;
	private Integer vhTP;
	private Integer vhTD;
	private Integer semestre;
	@ManyToOne
	private Filiere filliere;
	@ManyToOne
	private Enseignant responsable;

	public Module() {
		super();
	}
	
	

	public Module(Long id, String intitule, Filiere filliere,
			Enseignant responsable, Integer semestre, Integer vhCour,
			Integer vhTP, Integer vhTD) {
		super(id, intitule);
		this.filliere = filliere;
		this.responsable = responsable;
		this.semestre = semestre;
		this.vhCour = vhCour;
		this.vhTP = vhTP;
		this.vhTD = vhTD;
	}



	public Integer getInteger() {
		return semestre;
	}

	public void setInteger(Integer semestre) {
		this.semestre = semestre;
	}

	public Integer getVhCour() {
		return vhCour;
	}

	public void setVhCour(Integer vhCour) {
		this.vhCour = vhCour;
	}

	public Integer getVhTP() {
		return vhTP;
	}

	public void setVhTP(Integer vhTP) {
		this.vhTP = vhTP;
	}

	public Integer getVhTD() {
		return vhTD;
	}

	public void setVhTD(Integer vhTD) {
		this.vhTD = vhTD;
	}

	public Filiere getFilliere() {
		return filliere;
	}

	public void setFilliere(Filiere filliere) {
		this.filliere = filliere;
	}

	public Enseignant getResponsable() {
		return responsable;
	}

	public void setResponsable(Enseignant responssable) {
		this.responsable = responssable;
	}

}
