import java.util.ArrayList;
import java.util.List;

class Research extends Employee {
	private String researchArea;
	private List<Participation> projects = new ArrayList<>();

	public Research(int ssn, String name, String email, String researchArea) {
		super(ssn, name, email);
		this.researchArea = researchArea;
	}

	public void addProject(Project p, int hours) {
		projects.add(new Participation(p, hours));
	}

	public int getTotalProjectHours() {
		int total = 0;
		for (Participation p : projects) {
			total += p.getHours();
		}
		return total;
	}

	public void assignToProject(Participation p) {
		projects.add(p);
	}
}
