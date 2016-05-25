package com.department.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.department.utils.CommonWithFile;
import com.department.utils._TableNames;

@Entity
@Table(name = _TableNames.Document)
public class Document extends CommonWithFile{

	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Document(Long id, String intitule, byte[] file_data,
			String file_name, String file_contentType) {
		super(id, intitule, file_data, file_name, file_contentType);
		// TODO Auto-generated constructor stub
	}

	public Document(Long id, String intitule) {
		super(id, intitule);
		// TODO Auto-generated constructor stub
	}

	
}
