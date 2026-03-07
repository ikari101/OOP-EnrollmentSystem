package org.example.model;

public class Student extends Person {
//    private int StudentID;
//    private String studentName;
    private String program;


//    public Student(){
//        this(0);
//    }
//
    public Student(int StudentID){
        this(StudentID, "Unknown", "Unknown");
    }
//
//    public Student(int StudentID, String studentName) {
//        this(StudentID, studentName, "Information Technology");
//    }

    public Student(int StudentID, String name, String program){
        super(StudentID, name);
        this.program = program;
    }

//    public int getStudentID(){
//        return StudentID;
//    }
//
//    public String getStudentName(){
//        return studentName;
//    }

    public String getProgram(){
        return program;
    }


//    public void setName(String name){
//        this.studentName = name;
//    }

//    public void setStudentID(int ID){
//        this.StudentID = ID;
//    }

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

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
------------------------Notes----------------------------
 */