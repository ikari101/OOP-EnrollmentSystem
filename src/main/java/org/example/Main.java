package org.example;

import org.example.model.Course;
import org.example.model.Student;
import org.example.service.StudentRegistration;
import org.example.service.CourseRegistration;
import java.util.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static String name = "";
    static String program = "";
    public static void main() {
        Scanner hh = new Scanner(System.in);

        StudentRegistration studentRegistration = new StudentRegistration();

        int choice;
        int studID;
        String studName = "";
        String program = "";
        do {
            System.out.println("[1] Save Student");
            System.out.println("[2] Display Student");
            System.out.println("[3] Update Student");
            System.out.println("[4] Remove Student");

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
-----------------notes------------------------*/
