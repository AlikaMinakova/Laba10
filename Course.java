/**
 * Курс
 */
class Course {
	private int id;
	private String name;
	private int weeklyDuration;

	public Course(int id, String name, int weeklyDuration) {
		this.id = id;
		this.name = name;
		this.weeklyDuration = weeklyDuration;
	}

	public void getInfo() {
		System.out.println("Курс: " + name + " (ID: " + id + "), часов в неделю: " + weeklyDuration);
	}

	public String getName() {
		return name;
	}
}
