package privateschool2;

import java.util.ArrayList;
import java.util.List;

public class StudentsPerCourse {

    private Course2 course;
    private List<Student2> studentsPerCourseList;

    public StudentsPerCourse(Course2 course) {
        this.course = course;
        studentsPerCourseList = new ArrayList<Student2>();

    }

    public List<Student2> getStudentsPerCourseList() {
        return studentsPerCourseList;
    }

    public void addStudent(Student2 student) {
        this.studentsPerCourseList.add(student);
    }
    
    @Override
    public String toString() {
        return course.getTitle() + " Students " + studentsPerCourseList ;
    }

}
