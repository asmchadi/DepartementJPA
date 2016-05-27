package com.department.entities;


import com.department.utils.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = _TableNames.Bonus)
public class Bonus extends Common {

	public Bonus() {
		super();
		// TODO Auto-generated constructor stub
	} 

	public Bonus(Long id, String intitule) {
		super(id, intitule);
		// TODO Auto-generated constructor stub
	}
}
