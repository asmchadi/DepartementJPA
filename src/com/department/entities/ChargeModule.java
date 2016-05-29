package com.department.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
	@ManyToOne(fetch = FetchType.LAZY)
	private ChargeHoraire chargeHoraire;
	@ManyToOne
	private Module module;
	private Integer vhCour;
	private Integer vhTP;
	private Integer vhTD; 

	public ChargeModule() {
		super();
	}

	public ChargeHoraire getChargeHoraire() {
		return chargeHoraire;
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
