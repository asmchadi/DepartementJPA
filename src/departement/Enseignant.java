package departement;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Enseignant
 *
 */

@Entity
public class Enseignant {

	@Id
	private Long id;
	
	public Enseignant() {
		super();
	}
   
}
