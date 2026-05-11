package org.example.model;

public class Student extends Person {
//    private int StudentID;
//    private String studentName;
    private String program;

    public Student(){
        this(0);
    }

    public Student(int StudentID){
        this(StudentID, "Unknown", "Unknown");
    }


    public Student(int StudentID, String name, String program){
        super(StudentID, name);
        this.program = program;
    }


    public String getProgram(){
        return program;
    }



    public void setProgram(String program){
        this.program = program;
    }


    public void display(){
        System.out.println("Student ID: " + getID());
        System.out.println("Student Name: " + getName());
        System.out.println("Program: " + getProgram());
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentID=" + getID() +
                ", studentName='" + getName() + '\'' +
                ", program='" + program + '\'' +
                '}';
    }

    @Override
    public void mainTask() {
        System.out.println("I Study");
    }
}