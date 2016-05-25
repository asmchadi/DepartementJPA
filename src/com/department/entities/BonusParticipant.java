package com.department.entities;

import java.util.List;

import javax.persistence.*;

@Entity
public class BonusParticipant {
	
	@Id	
	private Integer id;
	private Bonus bonus;
	private List<Enseignant> participants;
	private String anneeUniversitaire;
	
	
	public BonusParticipant() {
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Bonus getBonus() {
		return bonus;
	}


	public void setBonus(Bonus bonus) {
		this.bonus = bonus;
	}


	public List<Enseignant> getParticipants() {
		return participants;
	}


	public void setParticipants(List<Enseignant> participants) {
		this.participants = participants;
	}


	public String getAnneeUniversitaire() {
		return anneeUniversitaire;
	}


	public void setAnneeUniversitaire(String anneeUniversitaire) {
		this.anneeUniversitaire = anneeUniversitaire;
	}
	

}
