package privateschool2;

import java.util.ArrayList;
import java.util.List;

public class PrivateSchool {

    public static List<Course2> courseList;
    public static List<Student2> studentList;
    public static List<Trainer2> trainerList;
    public static List<Assignment2> assignmentList;
    
    

    public PrivateSchool() {
        courseList = new ArrayList<Course2>();
        studentList = new ArrayList<Student2>();
        trainerList = new ArrayList<Trainer2>();
        assignmentList = new ArrayList<Assignment2>();
        System.out.println("New Private School system created");
    }

    public List<Course2> getCourseList() {
        return courseList;
    }

    public void addCourseToList(Course2 course) {
        PrivateSchool.courseList.add(course);
    }

    public  List<Student2> getStudentList() {
        return studentList;
    }

    public  void addStudentToList(Student2 student) {
        this.studentList.add(student);
    }

    public  List<Trainer2> getTrainerList() {
        return trainerList;
    }

    public  void setTrainerList(Trainer2 trainer) {
        this.trainerList.add(trainer);
    }

    public  List<Assignment2> getAssignmentList() {
        return assignmentList;
    }

    public  void setAssignmentList(Assignment2 assignment) {
        this.assignmentList.add(assignment);
    }

    @Override
    public String toString() {
        return "PrivateSchool{" + "courseList=" + courseList + '}';
    }
    
    

}
