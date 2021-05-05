package business;

import entities.Course;

public class CourseManager {
	public void add(Course course) {
		System.out.println(course.getCourseName() + " has successfully added.");
	}
}
