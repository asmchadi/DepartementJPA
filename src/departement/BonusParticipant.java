package departement;

import java.util.List;

import javax.persistence.*;

@Entity
public class BonusParticipant {
	
	@Id	
	private Integer id;
	private Bonus bonus;
	private List<Enseignant> participants;
	private String anneeUniversitaire;
	
	
	public BonusParticipant() {
		
	}

}
