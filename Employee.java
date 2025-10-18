/**
 * Абстрактный класс для сотрудников
 */
abstract class Employee {
	private int ssn;
	private String name;
	private String email;

	public Employee() {}

	public Employee(int ssn, String name, String email) {
		this.ssn = ssn;
		this.name = name;
		this.email = email;
	}

	public String getContactInfo() {
		return "Имя: " + name + ", Email: " + email + ", SSN: " + ssn;
	}

	public String getName() {
		return name;
	}
}