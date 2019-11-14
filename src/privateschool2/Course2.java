package privateschool2;

import java.time.LocalDate;

/**
 *
 * @author datura
 */
public class Course2 {

    private String title;
    private String stream;
    private Boolean type;
    private LocalDate startDate;
    private LocalDate endDate;
    public TrainersPercourse courseTrainers;
    public StudentsPerCourse courseStudents;
    public AssignmetsPerCourse courseAssignmets;

    public Course2(String title, String stream, Boolean type, LocalDate startDate, LocalDate endDate) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        PrivateSchool.courseList.add(this);
        courseTrainers = new TrainersPercourse(this);
        courseStudents = new StudentsPerCourse(this);
        courseAssignmets = new AssignmetsPerCourse(this);
        

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        if (this.type) {
            return "FullTime";
        } else {
            return "PartTime";
        }
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "\nCourse{" + "title=" + title + ", stream=" + stream + ", type=" + getType() + ", startDate=" + startDate + ", endDate=" + endDate + '}';
    }

}
