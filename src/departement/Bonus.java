package departement;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="bonus")
public class Bonus extends Common {

	public Bonus() {
		super();
	}

}
