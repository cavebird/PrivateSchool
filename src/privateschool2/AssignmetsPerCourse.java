
package privateschool2;

import java.util.ArrayList;
import java.util.List;


public class AssignmetsPerCourse {
    private Course2 course;
    private List<Assignment2> assignmentsPerCourseList;

    public AssignmetsPerCourse(Course2 course) {
        this.course = course;
         assignmentsPerCourseList = new ArrayList<Assignment2>();
    }

    public List<Assignment2> getAssignmentsPerCourseList() {
        return assignmentsPerCourseList;
    }

    public void addAssignment(Assignment2 assignment) {
        this.assignmentsPerCourseList.add(assignment);
    }

    @Override
    public String toString() {
        return "AssignmetsPerCourse{" + "course=" + course + ", assignmentsPerCourseList=" + assignmentsPerCourseList + '}';
    }
    
    
}
