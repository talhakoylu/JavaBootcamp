package entities;

public class Student extends User{
	private Course[] courses;
	private String studentNumber;
	
	public Student(int id, String firstName, String lastName, String email, String password, String nationalIdentity, String studentNumber) {
		super(id, firstName, lastName, email, password, nationalIdentity);
		this.studentNumber = studentNumber;
	}

	public Course[] getCourses() {
		return courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
}
