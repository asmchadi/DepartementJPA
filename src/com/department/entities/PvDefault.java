package com.department.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.department.utils.Common;
import com.department.utils._TableNames;

@Entity
@Table(name = _TableNames.PvDefault)
public class PvDefault extends Common {

	@Lob
	@Column
	private String model;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public PvDefault() {
		super();
	}

	public PvDefault(Long id, String intitule, String model) {
		super(id, intitule);
		this.model = model;
	}

}
