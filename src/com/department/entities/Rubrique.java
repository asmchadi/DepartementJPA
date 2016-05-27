package com.department.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.department.utils.Common;
import com.department.utils._TableNames;

/**
 * Entity implementation class for Entity: Rubrique
 * 
 */
@Entity
@Table(name = _TableNames.Rubrique)
public class Rubrique extends Common {
//id, intitule
	@Lob
	@Column
	private String htmlContent;
	private String url;
	private Boolean isVisible = false;
	private Boolean isExtern = false;
	
	@OneToOne
	private Rubrique parent;
	private Integer menu;
	private Integer position;

	public Rubrique() {
		super();
	}

	public String getHtmlContent() {
		return htmlContent;
	}
	
	

	public Rubrique(Long id, String intitule, String htmlContent, String url,
			Boolean isVisible, Boolean isExtern, Rubrique parent, Integer menu,
			Integer position) {
		super(id, intitule);
		this.htmlContent = htmlContent;
		this.url = url;
		this.isVisible = isVisible;
		this.isExtern = isExtern;
		this.parent = parent;
		this.menu = menu;
		this.position = position;
	}

	public Integer getMenu() {
		return menu;
	}

	public void setMenu(Integer menu) {
		this.menu = menu;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public void setHtmlContent(String htmlContent) {
		this.htmlContent = htmlContent;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Boolean getIsVisible() {
		return isVisible;
	}

	public void setIsVisible(Boolean isVisible) {
		this.isVisible = isVisible;
	}

	public Boolean getIsExtern() {
		return isExtern;
	}

	public void setIsExtern(Boolean isExtern) {
		this.isExtern = isExtern;
	}

	public Rubrique getParent() {
		return parent;
	}

	public void setParent(Rubrique parent) {
		this.parent = parent;
	}

}
