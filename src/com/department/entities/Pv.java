package com.department.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.department.utils.CommonWithFile;
import com.department.utils._TableNames;

@Entity
@Table(name = _TableNames.Pv)
public class Pv extends CommonWithFile{

	@Lob
	@Column
	private String text;
	private Date date;
	private Boolean isValide=false;
	public Pv() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pv(Long id, String intitule, String text, Date date,
			Boolean isValide) {
		super(id, intitule);
		this.text = text;
		this.date = date;
		this.isValide = isValide;
	}
	public Pv(Long id, String intitule, String text, Date date, Boolean isValide, byte[] file_data, String file_name,
			String file_contentType) {
		super(id, intitule, file_data, file_name, file_contentType);
		this.text = text;
		this.date = date;
		this.isValide = isValide;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Boolean getIsValide() {
		return isValide;
	}
	public void setIsValide(Boolean isValide) {
		this.isValide = isValide;
	}
	
	
}
