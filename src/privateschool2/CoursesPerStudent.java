package privateschool2;

import java.util.ArrayList;
import java.util.List;

public class CoursesPerStudent {

    private Student2 student;
    private List<Course2> coursesPerStudentList;

    public CoursesPerStudent(Student2 student) {
        this.student = student;
        coursesPerStudentList = new ArrayList<Course2>();
    }

    public void addCourse(Course2 courses) {
        this.coursesPerStudentList.add(courses);
    }

    public List<Course2> getCoursesPerStudentList() {
        return coursesPerStudentList;
    }

  

    
}
