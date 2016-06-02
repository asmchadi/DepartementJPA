package com.department.entities;

import java.util.List;

import javax.persistence.*;

import com.department.utils.Status;
import com.department.utils._TableNames;

@Entity
@Table(name = _TableNames.ChargeHoraire)
public class ChargeHoraire {
	
	@Id
	private Long id;
	@ManyToOne
	private Enseignant enseignant;
	@ManyToOne
	private AnneeUniversitaire anneeUniversitaire;
	private Integer vhModule;
	private Integer vhBonus;
	private Status status;

	@OneToMany(mappedBy = "chargeHoraire")
	private List<ChargeModule> modules;
	
	@OneToMany(mappedBy = "chargeHoraire")
	private List<BonusParticipant> bonus;
	public ChargeHoraire() {
	}
	
	public List<ChargeModule> getModules() {
		return modules;
	}

	public ChargeHoraire(Enseignant enseignant, List<ChargeModule> modules,
			Integer vhModule, Integer vhBonus, Status status,
			String anneeUniversitaire) {
		super();
		this.enseignant = enseignant;
		this.modules = modules;
		this.vhModule = vhModule;
		this.vhBonus = vhBonus;
		this.status = status;
		this.anneeUniversitaire = new AnneeUniversitaire(anneeUniversitaire);
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void setModules(List<ChargeModule> modules) {
		this.modules = modules;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public String getAnneeUniversitaire() {
		return anneeUniversitaire.getIntitule();
	}

	public void setAnneeUniversitaire(String anneeUniversitaire) {
		this.anneeUniversitaire = new AnneeUniversitaire(anneeUniversitaire);
	}

	public Integer getVhModule() {
		return vhModule;
	}

	public void setVhModule(Integer vhModule) {
		this.vhModule = vhModule;
	}

	public Integer getVhBonus() {
		return vhBonus;
	}

	public void setVhBonus(Integer vhBonus) {
		this.vhBonus = vhBonus;
	}

	public List<BonusParticipant> getBonus() {
		return bonus;
	}

	public void setBonus(List<BonusParticipant> bonus) {
		this.bonus = bonus;
	}
}
