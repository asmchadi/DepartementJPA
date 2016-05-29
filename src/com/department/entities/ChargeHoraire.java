package com.department.entities;

import java.util.List;

import javax.persistence.*;

import com.department.utils._TableNames;

@Entity
@Table(name = _TableNames.ChargeHoraire)
public class ChargeHoraire {
	
	@Id
	private Long id;
	@ManyToOne
	private Enseignant enseignant;
	private String anneeUniversitaire;
	@OneToMany(mappedBy = "chargeHoraire")
	private List<ChargeModule> modules;
	private Integer vhModule;
	private Integer vhPFE;
	private Integer vhBonus;
	private Boolean isValid = false;
	
	public ChargeHoraire() {
	}

	
	
	public List<ChargeModule> getModules() {
		return modules;
	}



	public void setModules(List<ChargeModule> modules) {
		this.modules = modules;
	}



	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
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
		return anneeUniversitaire;
	}

	public void setAnneeUniversitaire(String anneeUniversitaire) {
		this.anneeUniversitaire = anneeUniversitaire;
	}

	public Integer getVhModule() {
		return vhModule;
	}

	public void setVhModule(Integer vhModule) {
		this.vhModule = vhModule;
	}

	public Integer getVhPFE() {
		return vhPFE;
	}

	public void setVhPFE(Integer vhPFE) {
		this.vhPFE = vhPFE;
	}

	public Integer getVhBonus() {
		return vhBonus;
	}

	public void setVhBonus(Integer vhBonus) {
		this.vhBonus = vhBonus;
	}

	public Boolean getIsValid() {
		return isValid;
	}

	public void setIsValide(Boolean isValide) {
		this.isValid = isValide;
	}
	

}
