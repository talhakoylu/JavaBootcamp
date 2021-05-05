import business.CourseManager;
import business.InstructorManager;
import business.StudentManager;
import entities.Course;
import entities.Instructor;
import entities.Student;

public class Main {
	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor(1, "Ahmet Talha", "Köylü", "ahmettalha.net@gmail.com", "123456", "12345678901");
		
		Student student1 = new Student(1, "Mehmet Burak", "Köylü", "abc@gmail.com", "123456", "12345678901", "123");
		
		Course course1 = new Course();
		course1.setCourseName("Course 1");
		course1.setCredit(4);
		course1.setInstructor(instructor1);
		
		Course[] courseArray = {course1};
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.addCourse(instructor1, courseArray);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.addCourses(student1, courseArray);
	}
}
