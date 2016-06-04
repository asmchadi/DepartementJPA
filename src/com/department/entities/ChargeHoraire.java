package com.department.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.department.utils.Status;
import com.department.utils._TableNames;

@Entity
@Table(name = _TableNames.ChargeHoraire)
public class ChargeHoraire {
	
	@Id
	private Long id;
	@ManyToOne
	private Enseignant enseignant;
	private String anneeUniversitaire;
	private Double vhModule;
	private Double vhBonus;
	private Status status;

	@OneToMany(mappedBy = "chargeHoraire",fetch = FetchType.EAGER)
	private List<ChargeModule> modules;
	
	@OneToMany(mappedBy = "chargeHoraire",fetch = FetchType.EAGER)
	private List<BonusParticipant> bonus;
	public ChargeHoraire() {
	}
	
	public List<ChargeModule> getModules() {
		return modules;
	}

	public ChargeHoraire(Enseignant enseignant, List<ChargeModule> modules,
			Double vhModule, Double vhBonus, Status status,
			String anneeUniversitaire) {
		super();
		this.enseignant = enseignant;
		this.modules = modules;
		this.vhModule = vhModule;
		this.vhBonus = vhBonus;
		this.status = status;
		this.anneeUniversitaire = anneeUniversitaire;
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

	public String getString() {
		return anneeUniversitaire;
	}

	public void setString(String anneeUniversitaire) {
		this.anneeUniversitaire = anneeUniversitaire;
	}

	public Double getVhModule() {
		return vhModule;
	}

	public void setVhModule(Double vhModule) {
		this.vhModule = vhModule;
	}

	public Double getVhBonus() {
		return vhBonus;
	}

	public void setVhBonus(Double vhBonus) {
		this.vhBonus = vhBonus;
	}

	public List<BonusParticipant> getBonus() {
		return bonus;
	}

	public void setBonus(List<BonusParticipant> bonus) {
		this.bonus = bonus;
	}
}
