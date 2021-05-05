package business;

import entities.Course;
import entities.Student;

public class StudentManager extends UserManager{
	
	public void addCourses(Student student, Course[] courses) {
		student.setCourses(courses);
		System.out.println("Courses were successfully added to the list of the courses taken by " + student.getFirstName());
	}
	
}
