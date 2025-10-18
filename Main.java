import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        University uni = new University();

        Faculty itFaculty = new Faculty("Факультет информатики");
        Dean dean = new Dean(12345, "Иван Иванов", "ivanov@uni.edu");
        itFaculty.assignDean(dean);

        Institute aiInstitute = new Institute("Институт искусственного интеллекта", "ул. Науки, 1");
        itFaculty.addDepartment(aiInstitute);

        uni.addFaculty(itFaculty);

        Lecturer lecturer = new Lecturer(67890, "Петр Петров", "petrov@uni.edu", "Машинное обучение");
        aiInstitute.addResearch(lecturer);

        Course mlCourse = new Course(101, "Machine Learning", 6);
        Course dlCourse = new Course(102, "Deep Learning", 5);

        lecturer.addCourse(mlCourse);
        lecturer.addCourse(dlCourse);

        Project aiProject = new Project("AI Research", LocalDate.of(2024, 1, 10), LocalDate.of(2025, 1, 10));
        lecturer.addProject(aiProject, 120);

        System.out.println(" Информация о сотруднике:");
        System.out.println(lecturer.getContactInfo());

        System.out.println("\nКурсы преподавателя:");
        lecturer.listCourses();

        System.out.println("\nПроекты преподавателя:");
        System.out.println("Общее количество часов по проектам: " + lecturer.getTotalProjectHours());

        System.out.println("\nУниверситет:");
        System.out.println("Количество факультетов: " + uni.countEmployees());
    }
}