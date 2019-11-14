
package privateschool2;

import java.util.ArrayList;
import java.util.List;


public class TrainersPercourse {
    private Course2 course;
    private List<Trainer2> trainersPerCourseList;

    public TrainersPercourse(Course2 course) {
        this.course = course;
        trainersPerCourseList = new ArrayList<Trainer2>();
        
    }

    
    public List<Trainer2> getTrainersPerCourseList() {
        return trainersPerCourseList;
    }

    public void addTrainer(Trainer2 trainer) {
        this.trainersPerCourseList.add(trainer);
    }

    @Override
    public String toString() {
        return course.getTitle() + " Trainers " + trainersPerCourseList ;
    }
    
  
    
}
