package entities;

public class Course {
	private String courseName;
	private int credit;
	private Instructor instructor;
	
	public Course() {
		super();
	}

	public Course(String courseName, int credit, Instructor instructor) {
		super();
		this.courseName = courseName;
		this.credit = credit;
		this.instructor = instructor;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
}
