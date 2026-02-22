package org.example.model;

public class Student {
    private int StudentID;
    private String studentName;
    private String program;


    public Student(){
        this(0);
    }

    public Student(int StudentID){
        this(StudentID, "Unknown");
    }

    public Student(int StudentID, String studentName) {
        this(StudentID, studentName, "Information Technology");
    }

    public Student(int ID, String name, String program){
        this.StudentID = ID;
        this.studentName = name;
        this.program = program;
    }

    public int getStudentID(){
        return StudentID;
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

//    public void setStudentID(int ID){
//        this.StudentID = ID;
//    }

    public void setProgram(String program){
        this.program = program;
    }


    public void display(){
        System.out.println("Student ID: " + getStudentID());
        System.out.println("Student Name: " + getStudentName());
        System.out.println("Program: " + getProgram());
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentID=" + StudentID +
                ", studentName='" + studentName + '\'' +
                ", program='" + program + '\'' +
                '}';
    }
}
/*
------------------------Notes----------------------------
   public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Getter
    public String getName(){
        return name;
    }

    //Setter
    public void setName(String name){
        this.name = name;

------------------------Notes----------------------------
 */