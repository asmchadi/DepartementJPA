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

@Entity
@Table(name = _TableNames.BonusParticipant)
public class BonusParticipant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;
	@ManyToOne(fetch = FetchType.LAZY)
	private ChargeHoraire chargeHoraire;
	@ManyToOne
	private Bonus bonus;
	private Integer nbSection;
	private String message;
	private Status status;

	public BonusParticipant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BonusParticipant(Long id, ChargeHoraire chargeHoraire, Bonus bonus
			, Integer nbSection, Status status) {
		super();
		this.id = id;
		this.chargeHoraire = chargeHoraire;
		this.bonus = bonus;
		this.nbSection = nbSection;
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

	public ChargeHoraire getChargeHoraire() {
		return chargeHoraire;
	}

	public void setChargeHoraire(ChargeHoraire chargeHoraire) {
		this.chargeHoraire = chargeHoraire;
	}

	public Integer getNbSection() {
		return nbSection;
	}

	public void setNbSection(Integer nbSection) {
		this.nbSection = nbSection;
	}

	public Bonus getBonus() {
		return bonus;
	}


	public void setBonus(Bonus bonus) {
		this.bonus = bonus;
	}
}
