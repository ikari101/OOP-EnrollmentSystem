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
    public void updateStudent(Student student){
        for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getStudentID() == (student.getStudentID())){
                studentList.set(i, student);
                break;
            }
        }
    }

    //Remove
    public String delete (Student student){
        for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getStudentID() == (student.getStudentID())){
                studentList.remove(i);
                return "Successfully deleted.";
            }
        }
        return "Error";
    }
}
