package com.department.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.department.utils.Common;
import com.department.utils.Status;
import com.department.utils._TableNames;

@Entity
@Table(name = _TableNames.Pv)
public class Pv extends Common{

	@Lob
	@Column
	private String text;
	private Date date;
	private Status status;
	private Integer period;
	public Integer getPeriod() {
		return period;
	}
	public void setPeriod(Integer period) {
		this.period = period;
	}
	public Pv() {
		super();
	}
	public Pv(Long id, String intitule, String text, Date date,
			Status status) {
		super(id, intitule);
		this.text = text;
		this.date = date;
		this.status = status;
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
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	
}
