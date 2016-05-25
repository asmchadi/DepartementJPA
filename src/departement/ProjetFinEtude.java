package departement;

import departement.Common;

import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ProjetFinEtude
 *
 */
@Entity
@Table(name="projet_fin_etude")
public class ProjetFinEtude extends Common{

	private String lieu;
	// TODO
	private List<Object> participants; 
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

	public List<Object> getParticipants() {
		return participants;
	}

	public void setParticipants(List<Object> participants) {
		this.participants = participants;
	}

	public List<Enseignant> getEncadrants() {
		return encadrants;
	}

	public void setEncadrants(List<Enseignant> encadrants) {
		this.encadrants = encadrants;
	}
	
   
}
