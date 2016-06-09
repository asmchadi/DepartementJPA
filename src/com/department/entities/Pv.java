package com.department.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.department.utils.Common;
import com.department.utils._TableNames;

@Entity
@Table(name = _TableNames.Pv)
public class Pv extends Common {
	@Lob
	@Column
	private String content;
	private Date date;
	private int period = 15;
	private String state;

	public Pv() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pv(Long id, String intitule, String content, Date date, String state) {
		super(id, intitule);
		this.content = content;
		this.date = date;
		this.period = 15;
		this.state = state;
	}
	public Pv(Long id, String intitule, String content, Date date, int period, String state) {
		super(id, intitule);
		this.content = content;
		this.date = date;
		this.period = period;
		this.state = state;
	}

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Pv [content=" + content + ", date=" + date +", period)" + period + ", state=" + state + ", id=" + id + ", intitule="
				+ intitule + "]";
	}
}
