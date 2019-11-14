
package privateschool2;

import java.time.LocalDate;
import java.time.Month;


public class SyntheticData {
    
    
    public void load(){
        
    
        LocalDate startDate = (LocalDate.of(2020, Month.MARCH, 12));
        LocalDate endDate = (LocalDate.of(2020, Month.JUNE, 12));

        // Create courses
        Course2 c1 = new Course2("MAthima1", "yoga", Boolean.TRUE, startDate, endDate);
        Course2 c2 = new Course2("Mathima2", "java", Boolean.FALSE,
                LocalDate.of(2020, Month.AUGUST, 06),
                LocalDate.of(2020, Month.OCTOBER, 25));
        Course2 c3 = new Course2("Mathima3", "c#", Boolean.FALSE,
                LocalDate.of(2020, Month.JANUARY, 06),
                LocalDate.of(2020, Month.APRIL, 25));
        
        //Create trainers
        Trainer2 t1 = new Trainer2("Daskalos1", "Daskalakis", "yoga");
        Trainer2 t2 = new Trainer2("Daskalos2", "Daskalopoulos", "C#");
        Trainer2 t3 = new Trainer2("Daskalos3", "Daskalidis", "java");
        Trainer2 t4 = new Trainer2("Daskalos4", "Daskalou", "SQL");
       
        //Create Students
        Student2 s1 = new Student2("Mathitis1", "Mathitopoulos", endDate, 10);
        Student2 s2 = new Student2("Mathitis2", "Mathitidis", startDate, 20);
        Student2 s3 = new Student2("Mathitis3", "Mathitakis", endDate, 30);
        Student2 s4 = new Student2("Mathitis4", "Mathitoglou", startDate, 40);
  
        //Create Assignments
        Assignment2 a1 = new Assignment2("Ergasia1", "Ftiaxte ena paixnidi", startDate);
        Assignment2 a2 = new Assignment2("Ergasia2", "Ftiaxte mia istoselida", endDate);
        Assignment2 a3 = new Assignment2("Ergasia3", "Ftiaxte mia vasi dedomenon", startDate.plusMonths(1));
        Assignment2 a4 = new Assignment2("Ergasia4", "Ftiaxte mia pasta", startDate.plusWeeks(2));
        
        //Set Students to courses
        Main2.setStudentToCourse(c1, s1);
        Main2.setStudentToCourse(c2, s2);
        Main2.setStudentToCourse(c3, s3);
        Main2.setStudentToCourse(c1, s4);
        
        //Set Assignments to courses
        Main2.setAssignmentToCourse(c1, a1);
        Main2.setAssignmentToCourse(c2, a2);
        Main2.setAssignmentToCourse(c3, a3);
        Main2.setAssignmentToCourse(c1, a4);
        
        //Set Trainers to courses
        Main2.setTrainerToCourse(c1, t1);
        Main2.setTrainerToCourse(c2, t2);
        Main2.setTrainerToCourse(c3, t3);
        Main2.setTrainerToCourse(c3, t4);
        
        
        
        
        
         
    }
    
}
