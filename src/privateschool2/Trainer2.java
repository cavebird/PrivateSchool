
package privateschool2;


public class Trainer2 {
      private String firstName;
    private String lastName;
    private String subject;

    public Trainer2(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        PrivateSchool.trainerList.add(this);
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "\nTrainer{" + "firstName=" + firstName + ", lastName=" + lastName + ", subject=" + subject + '}';
    }
    
    
}
