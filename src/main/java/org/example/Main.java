package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main() {
        Student student = new Student();
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
    }
}
