package privateschool2;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import jdk.nashorn.internal.codegen.CompilerConstants;

public class Main2 {

    public static void main(String[] args) {
       
        PrivateSchool school = new PrivateSchool();
        Menu m = new Menu();
        m.startMenu();
        
        
    }

    
    
    public static void setTrainerToCourse(Course2 course, Trainer2 trainer) {
        course.courseTrainers.addTrainer(trainer);
        System.out.printf("%s %s was added as a trainer to course: %s %s %s\n",
                trainer.getFirstName(), trainer.getLastName(),
                course.getTitle(), course.getStream(), course.getType());
    }

    public static void setStudentToCourse(Course2 course, Student2 student) {
        course.courseStudents.addStudent(student);
        student.enrolledCourses.addCourse(course);
        System.out.printf("%s %s was added as a student to course: %s %s %s\n",
                student.getFirstName(), student.getLastName(),
                course.getTitle(), course.getStream(), course.getType());

    }

    public static void setAssignmentToCourse(Course2 course, Assignment2 assignment) {
        course.courseAssignmets.addAssignment(assignment);
        System.out.printf("Assignment %s was added to course: %s %s %s\n",
                assignment.getTitle(), course.getTitle(),
                course.getStream(), course.getType());
    }


    public static void printCoursesPerStudent(Student2 student){
        System.out.printf("\n******** Printing Courses of %s %s *********\n",
                     student.getFirstName(), student.getLastName());
        for (Course2 course : student.enrolledCourses.getCoursesPerStudentList()) {
                System.out.println(course);
            }
    }
    

    public static void printAssignmentsPerStudent(Student2 student) {
            System.out.printf("\n******** Printing Assignments of %s %s *********\n",
                     student.getFirstName(), student.getLastName());
            for (Course2 course : student.enrolledCourses.getCoursesPerStudentList()) {
                System.out.println(course.courseAssignmets.getAssignmentsPerCourseList());
            }
    }
    
    public static void printStudentsInMultipleCourses(){
        for (Student2 student : PrivateSchool.studentList) {
            if (student.enrolledCourses.getCoursesPerStudentList().size() > 1) {
                System.out.println("****** Students in multiple courses ******");
                System.out.println(student);
                System.out.println("Enrolled in courses: ");
                printCoursesPerStudent(student);
            }
        }
    }
    
    public static void printStudentsPendingSubmissions(List<LocalDate> array){
        
        Set<Student2> set = new HashSet();
        List<LocalDate> lista = array;
        System.out.println("List of students that have to submit during the "
                + "week of the requested day: \n");
        for (Student2 student : PrivateSchool.studentList) {
            for (Course2 course : student.enrolledCourses.getCoursesPerStudentList()) {
                for (Assignment2 assignment : course.courseAssignmets.getAssignmentsPerCourseList()) {
                    if (assignment.getSubmissionDateTime().isAfter(lista.get(0))
                            && assignment.getSubmissionDateTime().isBefore(lista.get(1))){
                        set.add(student);
                        break;
                    }
                }
            }
        }
        for (Student2 student : set) {
            System.out.println(student);

        }
        
        
        
        
        
        
    }

}
