package com.department.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Module
 *
 */
@Entity
@Table(name="module")
public class Module extends Common {

	private Semestre semestre;
	private Integer vhCour;
	private Integer vhTP;
	private Integer vhTD;
	private Filiere filliere;
	private Enseignant responsable;
	
	public Module() {
		super();
	}

	public Semestre getSemestre() {
		return semestre;
	}

	public void setSemestre(Semestre semestre) {
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
