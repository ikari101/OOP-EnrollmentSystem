package org.example;

import org.example.model.Course;
import org.example.model.Student;
import org.example.model.Instructor;
import org.example.service.StudentRegistration;
import org.example.service.CourseRegistration;
import org.example.service.InstructorRegistration;
import java.util.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static String name = "";
    static String program = "";
    public static void main() {
        Scanner hh = new Scanner(System.in);

        StudentRegistration studentRegistration = new StudentRegistration();
        InstructorRegistration instructorRegistration = new InstructorRegistration();
        CourseRegistration courseRegistration = new CourseRegistration();
        int choice;
        int studID;
        int instrID;
        String studName = "";
        String instrName = "";
        String program = "";
        String courseID = "";
        String courseName = "";
        ArrayList<String> courses = new ArrayList<>();
        do {
            System.out.println("[1] Save Student");
            System.out.println("[2] Display Student");
            System.out.println("[3] Update Student");
            System.out.println("[4] Remove Student");
            System.out.println("[5] Save Instructor");
            System.out.println("[6] Display Instructors");
            System.out.println("[7] Update Instructor");
            System.out.println("[8] Remove Instructor");
            System.out.println("[9] Save Course");
            System.out.println("[10] Display Courses");
            System.out.println("[11] Update Course");
            System.out.println("[12] Remove Course");
            System.out.println("[13] Display All");
            System.out.println("[0] End");

            System.out.print("Enter choice: ");
            choice = hh.nextInt();
            switch (choice){
                case 1:
                //Create
                    System.out.print("Enter student ID: ");
                    studID = hh.nextInt();

                    System.out.print("Enter student name: ");
                    studName = hh.nextLine();
                    studName = hh.nextLine();

                    System.out.print("Enter program: ");
                    program = hh.nextLine();
                    studentRegistration.addStudent(new Student(studID, studName, program));
                    break;

                case 2:
                //Read
                    studentRegistration.displayAll();
                    break;

                case 3:
                //Update
                    System.out.print("Enter student ID to be updated: ");
                    studID = hh.nextInt();
                    studentRegistration.updateStudent(new Student(studID));
                    break;

                case 4:
                //Delete
                    System.out.print("Enter student ID to be removed: ");
                    studID = hh.nextInt();
                    studentRegistration.delete(new Student(studID));
                    break;


                case 5:
                    System.out.print("Enter instructor ID: ");
                    instrID = hh.nextInt();

                    System.out.print("Enter instructor name: ");
                    instrName = hh.nextLine();
                    instrName = hh.nextLine();

                    System.out.print("Enter course: ");
                    String course = hh.nextLine();

                    courses = new ArrayList<>();
                    courses.add(course);

                    instructorRegistration.addInstructor(new Instructor(instrID, instrName, courses));
                    break;

                case 6:
                    instructorRegistration.displayAll();
                    break;

                case 7:
                    System.out.print("Enter instructor ID to update: ");
                    instrID = hh.nextInt();
                    instructorRegistration.updateInstructor(new Instructor(instrID));
                    break;

                case 8:
                    System.out.print("Enter instructor ID to remove: ");
                    instrID = hh.nextInt();
                    instructorRegistration.delete(new Instructor(instrID));
                    break;

                case 9:
                    System.out.print("Enter course ID: ");
                    courseID = hh.next();

                    System.out.print("Enter course name: ");
                    courseName = hh.nextLine();
                    courseName = hh.nextLine();

                    System.out.print("Enter program: ");
                    program = hh.nextLine();

                    courseRegistration.addCourse(new Course(courseID, courseName, program));
                    break;

                case 10:
                    courseRegistration.displayAll();
                    break;

                case 11:
                    System.out.print("Enter course ID to update: ");
                    courseID = hh.next();
                    courseRegistration.updateCourse(new Course(courseID));
                    break;

                case 12:
                    System.out.print("Enter course ID to remove: ");
                    courseID = hh.next();
                    courseRegistration.delete(new Course(courseID));
                    break;

                case 13:
                    studentRegistration.displayAll();
                    instructorRegistration.displayAll();
                    courseRegistration.displayAll();

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice!=0);

    }
}

/*------------------------notes---------------------------
        student.setStudentID("000123");
        student.setName("John Doe");
        student.setProgram("Information Technology");

        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Program: " + student.getProgram());
        System.out.println();
        Student student2 = new Student();
        student2.setStudentID("000124");
        student2.setName("Jane Doe");
        student2.setProgram("Information Technology");

        System.out.println("Student ID: " + student2.getStudentID());
        System.out.println("Student Name: " + student2.getStudentName());
        System.out.println("Program: " + student2.getProgram());
        System.out.println();
        Course course = new Course();
        course.setCourseID("00001");
        course.setCourseName("Integrative Programming");
        course.setProgram("Information Technology");
        System.out.println();
        System.out.println("Course ID: " + course.getCourseID());
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Program: " + course.program());
        System.out.println();

        System.out.println("Display");
        student.display();
        System.out.println();
        student2.display();
        System.out.println();
        course.display();
-------------------------notes------------------------*/
