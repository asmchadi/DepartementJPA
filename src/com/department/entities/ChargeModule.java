package com.department.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.department.utils.Status;
import com.department.utils._TableNames;

/**
 * Entity implementation class for Entity: Module
 * 
 */
@Entity
@Table(name = _TableNames.ChargeHoraire+_TableNames.Module)
public class ChargeModule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;
	
	@ManyToOne
	private Module module;
	private Integer vhCour;
	private Integer nbCour;
	private Integer vhTP;
	private Integer nbTP;
	private Integer vhTD; 
	private Integer nbTD;
	private Status status;
	private String message;

	@ManyToOne(fetch = FetchType.LAZY)
	private ChargeHoraire chargeHoraire;
	public ChargeModule() {
		super();
	}

	public ChargeHoraire getChargeHoraire() {
		return chargeHoraire;
	}

	public ChargeModule(ChargeHoraire chargeHoraire, Module module,
			Integer vhCour, Integer nbCour, Integer vhTP, Integer nbTP,
			Integer vhTD, Integer nbTD, Status status) {
		super();
		this.chargeHoraire = chargeHoraire;
		this.module = module;
		this.vhCour = vhCour;
		this.nbCour = nbCour;
		this.vhTP = vhTP;
		this.nbTP = nbTP;
		this.vhTD = vhTD;
		this.nbTD = nbTD;
		this.status = status;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNbCour() {
		return nbCour;
	}

	public void setNbCour(Integer nbCour) {
		this.nbCour = nbCour;
	}

	public Integer getNbTP() {
		return nbTP;
	}

	public void setNbTP(Integer nbTP) {
		this.nbTP = nbTP;
	}

	public Integer getNbTD() {
		return nbTD;
	}

	public void setNbTD(Integer nbTD) {
		this.nbTD = nbTD;
	}

	public void setChargeHoraire(ChargeHoraire chargeHoraire) {
		this.chargeHoraire = chargeHoraire;
	}



	public Module getModule() {
		return module;
	}



	public void setModule(Module module) {
		this.module = module;
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
 
}
