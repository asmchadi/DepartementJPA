package com.department.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.department.utils.Common;
import com.department.utils._TableNames;

@Entity
@Table(name = _TableNames.Pv_Validators)
public class PvValidators extends Common {
	private Date date;
	@ManyToOne
	private Pv pv;
	@ManyToOne
	private Enseignant enseignant;
	@Lob
	@Column
	private String content;

	public PvValidators() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PvValidators(Long id, String intitule, Pv pv,
			Enseignant enseignant, Date date) {
		super(id, intitule);
		this.pv = pv;
		this.enseignant = enseignant;
		this.date = date;
	}

	public PvValidators(Long id, String intitule, String file_contentType,
			Pv pv, Enseignant enseignant, Date date, byte[] file_data,
			String file_name) {
		super(id, intitule);
		this.pv = pv;
		this.enseignant = enseignant;
		this.date = date;
	}

	public Pv getPv() {
		return pv;
	}

	public void setPv(Pv pv) {
		this.pv = pv;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "PvValidators [date=" + date + ", pv=" + pv + ", enseignant=" + enseignant + ", content=" + content
				+ ", id=" + id + ", intitule=" + intitule + "]";
	}	
}
