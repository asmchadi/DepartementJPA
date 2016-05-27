package com.department.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.department.utils.Common;
import com.department.utils._TableNames;

@Entity
@Table(name = _TableNames.Cycle)
public class Cycle extends Common{

	public Cycle() {
		super();
		// TODO Auto-generated constructor stub
	} 

	public Cycle(Long id, String intitule) {
		super(id, intitule);
		// TODO Auto-generated constructor stub
	}
}
