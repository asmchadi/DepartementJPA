package com.department.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.department.utils.Common;
import com.department.utils._TableNames;

@Entity
@Table(name = _TableNames.BonusParticipant)
public class BonusParticipant extends Common {
	
	@ManyToOne
	private Bonus bonus;
	@OneToMany
	private List<Enseignant> participants;
	private String anneeUniversitaire;
	private Integer volumeHoraire;
	
	public BonusParticipant(Long id, String intitule, Bonus bonus,
			String anneeUniversitaire, Integer volumeHoraire) {
		super(id, intitule);
		this.bonus = bonus;
		this.anneeUniversitaire = anneeUniversitaire;
		this.volumeHoraire = volumeHoraire;
	}

	public BonusParticipant() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getVolumeHoraire() {
		return volumeHoraire;
	}


	public void setVolumeHoraire(Integer volumeHoraire) {
		this.volumeHoraire = volumeHoraire;
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
