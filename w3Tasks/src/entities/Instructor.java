package entities;

public class Instructor extends User{

	private Course[] courses;

	public Instructor(int id, String firstName, String lastName, String email, String password, String nationalIdentity) {
		super(id, firstName, lastName, email, password, 
				nationalIdentity);
	}
	
	public Course[] getCourses() {
		return courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	
} 

