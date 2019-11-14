package privateschool2;

import java.util.Scanner;

public class Menu {

    public Scanner sc = new Scanner(System.in);

    public void startMenu() {
        while (true) {         
            printStartMenu();
            int choice = sc.nextInt();
            SyntheticData sd = new SyntheticData();
            switch(choice){
                case 0 : 
                    System.exit(choice);
                case 1 : 
                    mainMenu();
                case 2 :
                    sd.load();
                    mainMenu();
                    
            }
            
        }

    }

    public void mainMenu() {
        while (true) {
            printMainMenu();
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    startMenu();
                case 1:
                    courseMenu();
                case 2:
                    studentMenu();
                case 3:
                    trainerMenu();
                case 4:
                    assignmentMenu();
                default:
                    System.out.println("Wrong choice");
            }
        }
    }

    public void courseMenu() {
        while (true) {
            printCourseMenu();
            int choice = sc.nextInt();
            AskUserInput t = new AskUserInput();
            switch (choice) {
                case 0:
                    mainMenu();
                case 1:
                    t.createCourse();
                    break;
                case 2:
                    System.out.println(PrivateSchool.courseList);
                    break;
                case 3:
                    for (Course2 course : PrivateSchool.courseList) {
                        System.out.println(course.courseTrainers);
                    }
                    break;
                case 4:
                    for (Course2 course : PrivateSchool.courseList) {
                        System.out.println(course.courseStudents);
                    }
                    break;
                case 5:
                    for (Course2 course : PrivateSchool.courseList) {
                        System.out.println(course.courseAssignmets);
                    }
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }

    public void studentMenu() {
        while (true) {
            printStudentMenu();
            AskUserInput t = new AskUserInput();
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    mainMenu();
                case 1:

                    t.createStudent();
                    break;
                case 2:
                    t.setStudentToCourse();
                    break;

                case 3:
                    System.out.println(PrivateSchool.studentList);
                    break;
                case 4:
                    t.printCoursesPerStudent();
                    break;

                case 5:
                    t.printAssignmentsPerStudent();
                    break;
                case 6:
                    Main2.printStudentsInMultipleCourses();
                    break;

                default:
                    System.out.println("Wrong choice");
            }
        }
    }

    public void trainerMenu() {
        while (true) {
            printTrainerMenu();
            AskUserInput t = new AskUserInput();
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    mainMenu();
                case 1:
                    t.createTrainer();
                    break;
                case 2:
                    t.setTrainerToCourse();
                    break;
                case 3:
                    System.out.println(PrivateSchool.trainerList);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }

    public void assignmentMenu() {
        while (true) {
            printAssignmentMenu();
            AskUserInput t = new AskUserInput();
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    mainMenu();
                case 1:
                    t.createAssignment();
                    break;
                case 2:
                    t.setAssignmentToCourse();
                    break;
                case 3:
                    System.out.println(PrivateSchool.assignmentList);
                    break;
                case 4:
                   Main2.printStudentsPendingSubmissions(t.getSubmissionDates());
                   break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }

    public void printStartMenu() {
        System.out.println("***** Welcome to private school system *****");
        System.out.println("Please choose the category you want to perform "
                + "\nactions to by pressing the respective number\n");
        System.out.println("0 : Exit");
        System.out.println("1 : Proceed to main menu");
        System.out.println("2 : Load synthetic data and proceed to main menu \n"
                + "Students/Trainers?assignments have to be linked manually to courses");
    }

    public void printMainMenu() {

        System.out.println("Please choose the category you want to perform "
                + "\nactions to by pressing the respective number\n");
        System.out.println("0 : Back");
        System.out.println("1 : Course");
        System.out.println("2 : Student");
        System.out.println("3 : Trainer");
        System.out.println("4 : Assignment");

    }

    public void printCourseMenu() {
        System.out.println("***** Course options *****");
        System.out.println("Please choose the category you want to perform "
                + "\nactions to by pressing the respective number\n");
        System.out.println("0 : Back");
        System.out.println("1 : Create course");
        System.out.println("2 : Print all courses");
        System.out.println("3 : Print trainers per course");
        System.out.println("4 : Print students per course");
        System.out.println("5 : Print assignments per course");

    }

    public void printStudentMenu() {
        System.out.println("***** Student options *****");
        System.out.println("Please choose the category you want to perform "
                + "\nactions to by pressing the respective number\n");
        System.out.println("0 : Back");
        System.out.println("1 : Create student");
        System.out.println("2 : Set student to course");
        System.out.println("3 : Print all students");
        System.out.println("4 : Print student courses");
        System.out.println("5 : Print student assignments");
        System.out.println("6 : Print students enrolled in multiple courses");

    }

    public void printTrainerMenu() {
        System.out.println("***** Trainer options *****");
        System.out.println("Please choose the category you want to perform "
                + "\nactions to by pressing the respective number\n");
        System.out.println("0 : Back");
        System.out.println("1 : Create trainer");
        System.out.println("2 : Set trainer to course");
        System.out.println("3 : Print all trainers");

    }

    public void printAssignmentMenu() {
        System.out.println("***** Assignment options *****");
        System.out.println("Please choose the category you want to perform "
                + "\nactions to by pressing the respective number\n");
        System.out.println("0 : Back");
        System.out.println("1 : Create assignment");
        System.out.println("2 : Set assignment to course");
        System.out.println("3 : Print all assignments");
        System.out.println("4 : Print students with pending submissions");

    }

}
