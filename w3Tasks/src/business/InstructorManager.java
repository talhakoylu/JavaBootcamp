package business;

import entities.Course;
import entities.Instructor;

public class InstructorManager extends UserManager{
	
	public void addCourse(Instructor instructor, Course[] courses) {
		instructor.setCourses(courses);
		System.out.println("Courses were successfully added to list of the courses given by " + instructor.getFirstName());
	}
}
