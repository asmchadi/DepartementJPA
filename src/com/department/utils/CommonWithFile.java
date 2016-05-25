package com.department.utils;

import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class CommonWithFile extends Common {

	@Lob
	protected byte[] file_data;
	protected String file_name;
	protected String file_contentType;	
	
	public CommonWithFile() {
		super();
	}

	public CommonWithFile(Long id, String intitule) {
		super(id, intitule);
	}
	
	public CommonWithFile(byte[] file_data, String file_name,
			String file_contentType) {
		super();
		this.file_data = file_data;
		this.file_name = file_name;
		this.file_contentType = file_contentType;
	}
	
	public CommonWithFile(Long id, String intitule, byte[] file_data,
			String file_name, String file_contentType) {
		super(id, intitule);
		this.file_data = file_data;
		this.file_name = file_name;
		this.file_contentType = file_contentType;
	}

	public byte[] getFile_data() {
		return file_data;
	}
	public void setFile_data(byte[] file_data) {
		this.file_data = file_data;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getFile_contentType() {
		return file_contentType;
	}
	public void setFile_contentType(String file_contentType) {
		this.file_contentType = file_contentType;
	}	
	
}
