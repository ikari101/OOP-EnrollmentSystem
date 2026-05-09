package org.example.model;

import java.util.ArrayList;

public class Instructor extends Person {
    private ArrayList<String> courses;

    // Constructors
    public Instructor(){
        this(0);
    }

    public Instructor(int ID) {
        this(ID, "Unknown", new ArrayList<>());
    }

    public Instructor(int ID, String name) {
        this(ID, name, new ArrayList<>());
    }

    public Instructor(int ID, String name, ArrayList<String> courses) {
        super(ID, name);
        this.courses = courses;
    }

    // Getter
    public ArrayList<String> getCourses() {
        return courses;
    }

    // Setter
    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    public void addCourse(String course) {
        this.courses.add(course);
    }

    public void setProgram(String program) {
        System.out.println("Program set: " + program);
    }

    // Display
    public void display() {
        System.out.println("Instructor ID: " + getID());
        System.out.println("Instructor Name: " + getName());
        System.out.println("Courses: " + courses);
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "ID=" + getID() +
                ", name='" + getName() + '\'' +
                ", courses=" + courses +
                '}';
    }

    @Override
    public void mainTask() {
        System.out.println("I Teach");
    }
}