class Participation {
	private int hours;
	private Project project;

	public Participation(Project project, int hours) {
		this.project = project;
		this.hours = hours;
	}

	public int getHours() {
		return hours;
	}

	public Project getProject() {
		return project;
	}
}