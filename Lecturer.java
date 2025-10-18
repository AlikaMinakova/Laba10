import java.util.ArrayList;
import java.util.List;

class Lecturer extends Research {
	private List<Course> courses = new ArrayList<>();

	public Lecturer(int ssn, String name, String email, String researchArea) {
		super(ssn, name, email, researchArea);
	}

	public void addCourse(Course c) {
		courses.add(c);
	}

	public void removeCourse(Course c) {
		courses.remove(c);
	}

	public void listCourses() {
		System.out.println("Курсы преподавателя " + getName() + ":");
		for (Course c : courses) {
			c.getInfo();
		}
	}
}