package org.example;

public class Student {
    private String studentID;
    private String studentName;
    private String program;


    public Student(){

    }
    public Student(String ID, String name, String program){
        this.studentID = ID;
        this.studentName = name;
        this.program = program;
    }

    public String getStudentID(){
        return studentID;
    }

    public String getStudentName(){
        return studentName;
    }

    public String getProgram(){
        return program;
    }

    public void setName(String name){
        this.studentName = name;
    }

    public void setStudentID(String ID){
        this.studentID = ID;
    }

    public void setProgram(String program){
        this.program = program;
    }


    public void display(){
        System.out.println("Student ID: " + getStudentID());
        System.out.println("Student Name: " + getStudentName());
        System.out.println("Program: " + getProgram());
    }
//    public Person(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    //Getter
//    public String getName(){
//        return name;
//    }
//
//    //Setter
//    public void setName(String name){
//        this.name = name;
//    }
}
