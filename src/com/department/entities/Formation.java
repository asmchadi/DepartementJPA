package com.department.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.department.utils.Common;
import com.department.utils._TableNames;

@Entity
@Table(name = _TableNames.Formation)
public class Formation extends Common {
	
	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	} 

	public Formation(Long id, String intitule) {
		super(id, intitule);
		// TODO Auto-generated constructor stub
	}
}
