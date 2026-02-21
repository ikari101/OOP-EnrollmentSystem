package org.example.model;

public class Course {
    private String courseID;
    private String courseName;
    private String program;

    public Course(){

    }

    public Course(String cID, String cName, String program){
        this.courseID = cID;
        this.courseName = cName;
        this.program = program;
    }

    public String getCourseID(){
        return courseID;
    }

    public String getCourseName(){
        return courseName;
    }

    public String program(){
        return program;
    }

    public void setCourseName(String cName){
        this.courseName = cName;
    }

    public void setCourseID(String cID){
        this.courseID = cID;
    }

    public void setProgram(String program){
        this.program = program;
    }

    public void display() {
        System.out.println("Course ID: " + getCourseID());
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Program: " + program());
    }
}
