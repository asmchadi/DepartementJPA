package com.department.entities;


import com.department.utils.*;
import javax.persistence.*;



/**
 * Entity implementation class for Entity: Rubrique
 *
 */
@Entity
@Table(name="rubrique")
public class Rubrique extends Common {

	private String htmlContent;
	private String url;
	private Boolean isVisible = false;
	private Boolean isExtern = false;
	private Rubrique parent;
	
	public Rubrique() {
		super();
	}

	public String getHtmlContent() {
		return htmlContent;
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
