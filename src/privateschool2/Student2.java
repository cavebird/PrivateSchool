
package privateschool2;

import java.time.LocalDate;


public class Student2 {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private double fees;
    public CoursesPerStudent enrolledCourses;

    
    public Student2(String firstName, String lastName, LocalDate dateOfBirth
            , double fees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.fees = fees;
        PrivateSchool.studentList.add(this);
        enrolledCourses = new CoursesPerStudent(this);
        
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "\nStudent{" + "firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", fees=" + fees + '}';
    }
    
}
