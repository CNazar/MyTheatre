import java.util.Set;
import java.util.TreeSet;

public class Scedule {

	private Set<Seance> seances;

	public Scedule() {
		super();
		this.seances = new TreeSet<Seance>();
	}

	public Set<Seance> getSeances() {
		return seances;
	}

	public void addSeance(Seance seance) {
        seances.add(seance);
	}
	
	public void removeSeance(Seance seance){
		seances.remove(seance);
	}

	
}
