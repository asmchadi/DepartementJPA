package com.department.entities;


import com.department.utils.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = _TableNames.Bonus)
public class Bonus extends Common {

	private Integer volumeHoraire;
	
	
	public Integer getVolumeHoraire() {
		return volumeHoraire;
	}

	public void setVolumeHoraire(Integer volumeHoraire) {
		this.volumeHoraire = volumeHoraire;
	}

	public Bonus() {
		super();
		// TODO Auto-generated constructor stub
	} 

	public Bonus(Long id, String intitule, Integer volumeHoraire) {
		super(id, intitule);
		this.volumeHoraire = volumeHoraire; 
	}
}
