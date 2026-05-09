package org.example;

import org.example.interfaces.ICourseService;
import org.example.interfaces.IInstructorService;
import org.example.interfaces.IStudentService;

import org.example.model.Course;
import org.example.model.Instructor;
import org.example.model.Student;

import org.example.service.CourseRegistration;
import org.example.service.InstructorRegistration;
import org.example.service.StudentRegistration;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner hh = new Scanner(System.in);

        IStudentService studentRegistration = new StudentRegistration();
        IInstructorService instructorRegistration = new InstructorRegistration();
        ICourseService courseRegistration = new CourseRegistration();

        int choice;

        do {

            System.out.println("\n===== ENROLLMENT SYSTEM =====");
            System.out.println("[1] Add Student");
            System.out.println("[2] Display Students");
            System.out.println("[3] Update Student");
            System.out.println("[4] Remove Student");

            System.out.println("[5] Add Instructor");
            System.out.println("[6] Display Instructors");
            System.out.println("[7] Update Instructor");
            System.out.println("[8] Remove Instructor");

            System.out.println("[9] Add Course");
            System.out.println("[10] Display Courses");
            System.out.println("[11] Update Course");
            System.out.println("[12] Remove Course");

            System.out.println("[0] Exit");

            System.out.print("Enter choice: ");
            choice = hh.nextInt();
            hh.nextLine();

            switch(choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int studID = hh.nextInt();
                    hh.nextLine();

                    System.out.print("Enter Student Name: ");
                    String studName = hh.nextLine();

                    System.out.print("Enter Program: ");
                    String program = hh.nextLine();

                    studentRegistration.addStudent(
                            new Student(studID, studName, program)
                    );

                    break;

                case 2:

                    for(Student student : studentRegistration.getAllStudents()) {

                        System.out.println(student);
                    }

                    break;

                case 3:

                    System.out.print("Enter Student ID to Update: ");
                    int updateStudID = hh.nextInt();
                    hh.nextLine();

                    System.out.print("Enter New Student Name: ");
                    String newStudName = hh.nextLine();

                    System.out.print("Enter New Program: ");
                    String newProgram = hh.nextLine();

                    System.out.println(
                            studentRegistration.updateStudent(
                                    updateStudID,
                                    newStudName,
                                    newProgram
                            )
                    );

                    break;

                case 4:

                    System.out.print("Enter Student ID to Remove: ");
                    int removeStudID = hh.nextInt();
                    hh.nextLine();

                    System.out.println(
                            studentRegistration.removeStudent(removeStudID)
                    );

                    break;

                case 5:

                    System.out.print("Enter Instructor ID: ");
                    int instrID = hh.nextInt();
                    hh.nextLine();

                    System.out.print("Enter Instructor Name: ");
                    String instrName = hh.nextLine();

                    System.out.print("Enter Course: ");
                    String course = hh.nextLine();

                    ArrayList<String> courses = new ArrayList<>();
                    courses.add(course);

                    instructorRegistration.addInstructor(
                            new Instructor(instrID, instrName, courses)
                    );

                    break;

                case 6:

                    for(Instructor instructor : instructorRegistration.getAllInstructors()) {

                        System.out.println(instructor);
                    }

                    break;

                case 7:

                    System.out.print("Enter Instructor ID to Update: ");
                    int updateInstrID = hh.nextInt();
                    hh.nextLine();

                    System.out.print("Enter New Instructor Name: ");
                    String newInstrName = hh.nextLine();

                    System.out.print("Enter New Course: ");
                    String newCourse = hh.nextLine();

                    ArrayList<String> updatedCourses = new ArrayList<>();
                    updatedCourses.add(newCourse);

                    System.out.println(
                            instructorRegistration.updateInstructor(
                                    updateInstrID,
                                    newInstrName,
                                    updatedCourses
                            )
                    );

                    break;

                case 8:

                    System.out.print("Enter Instructor ID to Remove: ");
                    int removeInstrID = hh.nextInt();
                    hh.nextLine();

                    System.out.println(
                            instructorRegistration.removeInstructor(removeInstrID)
                    );

                    break;

                case 9:

                    System.out.print("Enter Course ID: ");
                    String courseID = hh.nextLine();

                    System.out.print("Enter Course Name: ");
                    String courseName = hh.nextLine();

                    System.out.print("Enter Program: ");
                    String courseProgram = hh.nextLine();

                    courseRegistration.addCourse(
                            new Course(courseID, courseName, courseProgram)
                    );

                    break;

                case 10:

                    for(Course courseObj : courseRegistration.getAllCourses()) {

                        System.out.println(courseObj);
                    }

                    break;

                case 11:

                    System.out.print("Enter Course ID to Update: ");
                    String updateCourseID = hh.nextLine();

                    System.out.print("Enter New Course Name: ");
                    String updateCourseName = hh.nextLine();

                    System.out.print("Enter New Program: ");
                    String updateProgram = hh.nextLine();

                    System.out.println(
                            courseRegistration.updateCourse(
                                    updateCourseID,
                                    updateCourseName,
                                    updateProgram
                            )
                    );

                    break;

                case 12:

                    System.out.print("Enter Course ID to Remove: ");
                    String removeCourseID = hh.nextLine();

                    System.out.println(
                            courseRegistration.removeCourse(removeCourseID)
                    );

                    break;

                case 0:

                    System.out.println("System Closed.");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while(choice != 0);

        hh.close();
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
--------------------~-----notes------------------------*/
