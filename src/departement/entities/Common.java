package departement.entities;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Common {

	@Id
	private Long id;
	private String intitule;
	
	public Common() {
	}

	public Long getId() {
		return id;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
}
