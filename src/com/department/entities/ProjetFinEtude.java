package com.department.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.department.utils.Common;
import com.department.utils._TableNames;

/**
 * Entity implementation class for Entity: ProjetFinEtude
 * 
 */
@Entity
@Table(name = _TableNames.ProjetFinEtude)
public class ProjetFinEtude extends Common {

	private String lieu;
	private String participants;

  @ManyToMany
  @JoinTable(
      name = _TableNames.ProjetFinEtude + _TableNames.Enseignant,
      joinColumns=@JoinColumn(name="PROJ_ID", referencedColumnName="ID"),
      inverseJoinColumns=@JoinColumn(name="EMP_ID", referencedColumnName="ID"))
	private List<Enseignant> encadrants;
	private Integer nbHeureEncadre;

	public Integer getNbHeureEncadre() {
		return nbHeureEncadre;
	}

	public void setNbHeureEncadre(Integer nbHeureEncadre) {
		this.nbHeureEncadre = nbHeureEncadre;
	}

	public ProjetFinEtude() {
		super();
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}


	public String getParticipants() {
		return participants;
	}

	public void setParticipants(String participants) {
		this.participants = participants;
	}

	public List<Enseignant> getEncadrants() {
		return encadrants;
	}

	public void setEncadrants(List<Enseignant> encadrants) {
		this.encadrants = encadrants;
	}

}
