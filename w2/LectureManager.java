package w2;

public class LectureManager {
    Student student;
    Instructor instructor;
    Lecture lecture;

    public void addLecture(Lecture lecture, Instructor instructor){
        System.out.println("Lecture " + lecture.lectureName + " is given by " + instructor.firstName + ". Lecture has added successfully.");
    }

    public void studentEnrollment(Lecture lecture, Student student){
        System.out.println("Student " + student.firstName + " has enrolled to  the " + lecture.lectureName + " lesson.");
    }
}
