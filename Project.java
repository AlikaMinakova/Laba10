import java.time.LocalDate;

class Project {
	private String name;
	private LocalDate startDate;
	private LocalDate endDate;

	public Project(String name, LocalDate startDate, LocalDate endDate) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getName() {
		return name;
	}

	public int getList() {
		return (int) (endDate.toEpochDay() - startDate.toEpochDay());
	}
}