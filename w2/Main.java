package w2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ahmet", "Talha", 22);
        Student student2 = new Student("Mehmet", "Burak", 18);

        Instructor instructor1 = new Instructor("Sarp", "Dağdelen", 33);

        Lecture lecture = new Lecture("Lecture 1", instructor1);

        LectureManager lectureManager = new LectureManager();
        lectureManager.addLecture(lecture, instructor1);
        lectureManager.studentEnrollment(lecture, student);
        lectureManager.studentEnrollment(lecture, student2);
    }
}
