package com.department.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.department.utils.CommonWithFile;
import com.department.utils._TableNames;

@Entity
@Table(name = _TableNames.Cours)
public class Cours extends CommonWithFile{
	
	@ManyToOne
	private Module module;
	@ManyToOne
	private Enseignant enseignant;
	public Cours() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cours(Long id, String intitule, Module module, Enseignant enseignant) {
		super(id, intitule);
		this.module = module;
		this.enseignant = enseignant;
	}
	public Cours(Long id, String intitule, Module module, Enseignant enseignant, byte[] file_data, String file_name,
			String file_contentType) {
		super(id, intitule, file_data, file_name, file_contentType);
		this.module = module;
		this.enseignant = enseignant;
	}
}
