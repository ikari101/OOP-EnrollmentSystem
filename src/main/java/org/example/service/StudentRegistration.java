package org.example.service;

import org.example.model.Student;

import java.util.*;

public class StudentRegistration {
    private ArrayList<Student> studentList = new ArrayList<>();
    Scanner hh = new Scanner(System.in);

    //Create
    public void addStudent(Student student){
        studentList.add(student);
    }

    //Read
    public void displayAll(){
        System.out.println(studentList);
    }

    //Update
    public String updateStudent(Student student){
        for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getID() == (student.getID())){
                System.out.print("Enter student name: ");
                String studentName = hh.nextLine();

                System.out.print("Enter program: ");
                String program = hh.nextLine();

                studentList.set(i, new Student(student. getID(), studentName, program));
                return "Successfully updated";
            }
        }
        return "Student not found";
    }

    //Remove
    public String delete(Student student){
        for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getID() == (student.getID())){
                studentList.remove(i);
                return "Successfully deleted.";
            }
        }
        return "Error";
    }
}
