package org.example;

import org.example.exception.SectionFullException;

import org.example.interfaces.ICourseService;
import org.example.interfaces.IInstructorService;
import org.example.interfaces.IStudentService;

import org.example.model.Course;
import org.example.model.Department;
import org.example.model.Instructor;
import org.example.model.Section;
import org.example.model.Student;

import org.example.service.CourseRegistration;
import org.example.service.EnrollmentRegistration;
import org.example.service.InstructorRegistration;
import org.example.service.StudentRegistration;
import org.example.service.TuitionRegistration;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner hh = new Scanner(System.in);

        IStudentService studentRegistration = new StudentRegistration();
        IInstructorService instructorRegistration = new InstructorRegistration();
        ICourseService courseRegistration = new CourseRegistration();

        EnrollmentRegistration enrollmentRegistration = new EnrollmentRegistration();
        TuitionRegistration tuitionRegistration = new TuitionRegistration();

        ArrayList<Department> departments = new ArrayList<>();
        ArrayList<Section> sections = new ArrayList<>();

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

            System.out.println("[13] Create Department");
            System.out.println("[14] Create Section");
            System.out.println("[15] Assign Instructor To Section");
            System.out.println("[16] Enroll Student In Section");
            System.out.println("[17] View Department Hierarchy");

            System.out.println("[18] Calculate Tuition");

            System.out.println("[0] Exit");

            System.out.print("Enter choice: ");

            try {

                choice = hh.nextInt();
                hh.nextLine();

            } catch(InputMismatchException e) {

                System.out.println("Invalid input.");
                hh.nextLine();
                choice = -1;
            }

            switch(choice) {

                case 1:

                    try {

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

                    } catch(InputMismatchException e) {

                        System.out.println("Invalid input.");
                        hh.nextLine();
                    }

                    break;

                case 2:

                    for(Student student : studentRegistration.getAllStudents()) {

                        System.out.println(student);
                    }

                    break;

                case 3:

                    try {

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

                    } catch(InputMismatchException e) {

                        System.out.println("Invalid input.");
                        hh.nextLine();
                    }

                    break;

                case 4:

                    try {

                        System.out.print("Enter Student ID to Remove: ");
                        int removeStudID = hh.nextInt();
                        hh.nextLine();

                        System.out.println(
                                studentRegistration.removeStudent(removeStudID)
                        );

                    } catch(InputMismatchException e) {

                        System.out.println("Invalid input.");
                        hh.nextLine();
                    }

                    break;

                case 5:

                    try {

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

                    } catch(InputMismatchException e) {

                        System.out.println("Invalid input.");
                        hh.nextLine();
                    }

                    break;

                case 6:

                    for(Instructor instructor : instructorRegistration.getAllInstructors()) {

                        System.out.println(instructor);
                    }

                    break;

                case 7:

                    try {

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

                    } catch(InputMismatchException e) {

                        System.out.println("Invalid input.");
                        hh.nextLine();
                    }

                    break;

                case 8:

                    try {

                        System.out.print("Enter Instructor ID to Remove: ");
                        int removeInstrID = hh.nextInt();
                        hh.nextLine();

                        System.out.println(
                                instructorRegistration.removeInstructor(removeInstrID)
                        );

                    } catch(InputMismatchException e) {

                        System.out.println("Invalid input.");
                        hh.nextLine();
                    }

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

                case 13:

                    System.out.print("Enter Department Name: ");
                    String departmentName = hh.nextLine();

                    departments.add(
                            new Department(departmentName)
                    );

                    System.out.println("Department created.");

                    break;

                case 14:

                    if(departments.isEmpty()) {

                        System.out.println("Create a department first.");
                        break;
                    }

                    System.out.print("Enter Section Name: ");
                    String sectionName = hh.nextLine();

                    System.out.print("Enter Max Capacity: ");
                    int capacity = hh.nextInt();
                    hh.nextLine();

                    Section section = new Section(sectionName, capacity);

                    sections.add(section);

                    System.out.println("\nDepartments:");

                    for(int i = 0; i < departments.size(); i++) {

                        System.out.println("[" + i + "] "
                                + departments.get(i).getDepartmentName());
                    }

                    System.out.print("Select Department Index: ");
                    int depIndex = hh.nextInt();
                    hh.nextLine();

                    departments.get(depIndex).getSections().add(section);

                    System.out.println("Section created.");

                    break;

                case 15:

                    if(sections.isEmpty()) {

                        System.out.println("No sections available.");
                        break;
                    }

                    if(instructorRegistration.getAllInstructors().isEmpty()) {

                        System.out.println("No instructors available.");
                        break;
                    }

                    System.out.println("\nSections:");

                    for(int i = 0; i < sections.size(); i++) {

                        System.out.println("[" + i + "] "
                                + sections.get(i).getSectionName());
                    }

                    System.out.print("Select Section Index: ");
                    int sectionIndex = hh.nextInt();
                    hh.nextLine();

                    System.out.println("\nInstructors:");

                    for(int i = 0; i < instructorRegistration.getAllInstructors().size(); i++) {

                        System.out.println("[" + i + "] "
                                + instructorRegistration.getAllInstructors().get(i).getName());
                    }

                    System.out.print("Select Instructor Index: ");
                    int instructorIndex = hh.nextInt();
                    hh.nextLine();

                    sections.get(sectionIndex).setInstructor(
                            instructorRegistration.getAllInstructors().get(instructorIndex)
                    );

                    System.out.println("Instructor assigned.");

                    break;

                case 16:

                    if(sections.isEmpty()) {

                        System.out.println("No sections available.");
                        break;
                    }

                    if(studentRegistration.getAllStudents().isEmpty()) {

                        System.out.println("No students available.");
                        break;
                    }

                    System.out.println("\nStudents:");

                    for(int i = 0; i < studentRegistration.getAllStudents().size(); i++) {

                        System.out.println("[" + i + "] "
                                + studentRegistration.getAllStudents().get(i).getName());
                    }

                    System.out.print("Select Student Index: ");
                    int studentIndex = hh.nextInt();
                    hh.nextLine();

                    System.out.println("\nSections:");

                    for(int i = 0; i < sections.size(); i++) {

                        System.out.println("[" + i + "] "
                                + sections.get(i).getSectionName());
                    }

                    System.out.print("Select Section Index: ");
                    int selectedSectionIndex = hh.nextInt();
                    hh.nextLine();

                    try {

                        enrollmentRegistration.enrollStudentInSection(
                                studentRegistration.getAllStudents().get(studentIndex),
                                sections.get(selectedSectionIndex)
                        );

                        System.out.println("Student enrolled successfully.");

                    } catch (SectionFullException e) {

                        System.out.println("ERROR: " + e.getMessage());
                    }

                    break;

                case 17:

                    if(departments.isEmpty()) {

                        System.out.println("No departments available.");
                        break;
                    }

                    System.out.println("\nDepartments:");

                    for(int i = 0; i < departments.size(); i++) {

                        System.out.println("[" + i + "] "
                                + departments.get(i).getDepartmentName());
                    }

                    System.out.print("Select Department Index: ");
                    int viewDepIndex = hh.nextInt();
                    hh.nextLine();

                    enrollmentRegistration.viewDepartmentHierarchy(
                            departments.get(viewDepIndex)
                    );

                    break;

                case 18:

                    try {

                        System.out.print("Enter Units: ");
                        int units = hh.nextInt();

                        System.out.print("Enter Rate Per Unit: ");
                        double rate = hh.nextDouble();

                        double totalFee = tuitionRegistration.calculateFee(units, rate);

                        System.out.println("Total Fee: " + totalFee);

                        System.out.print("Enter Payment: ");
                        double payment = hh.nextDouble();
                        hh.nextLine();

                        double remaining =
                                tuitionRegistration.getRemainingBalance(
                                        totalFee,
                                        payment
                                );

                        System.out.println("Remaining Balance: " + remaining);

                    } catch(InputMismatchException e) {

                        System.out.println("Invalid input.");
                        hh.nextLine();
                    }

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
