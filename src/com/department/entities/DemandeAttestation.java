package com.department.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.department.utils.CommonWithFile;
import com.department.utils._TableNames;

@Entity
@Table(name = _TableNames.Demande_Attestation)
public class DemandeAttestation extends CommonWithFile {

	@ManyToOne
	private Enseignant enseignant;
	@ManyToOne
	private TypeAttestation type_attestation;
	private Boolean isPrepared = false;

	public DemandeAttestation(Long id, String intitule, Enseignant enseignant,
			TypeAttestation type_attestation) {
		super(id, intitule);
		this.enseignant = enseignant;
		this.type_attestation = type_attestation;
	}

	public DemandeAttestation(Long id, String intitule, Enseignant enseignant,
			TypeAttestation type_attestation, byte[] file_data,
			String file_name, String file_contentType) {
		super(id, intitule, file_data, file_name, file_contentType);
		this.enseignant = enseignant;
		this.type_attestation = type_attestation;
	}

	public DemandeAttestation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public TypeAttestation getType_attestation() {
		return type_attestation;
	}

	public void setType_attestation(TypeAttestation type_attestation) {
		this.type_attestation = type_attestation;
	}

	public Boolean getIsPrepared() {
		return isPrepared;
	}

	public void setIsPrepared(Boolean isPrepared) {
		this.isPrepared = isPrepared;
	}

}
