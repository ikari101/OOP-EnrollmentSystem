package org.example.service;

import org.example.interfaces.IStudentService;
import org.example.model.Student;

import java.util.ArrayList;

public class StudentRegistration implements IStudentService {

    private ArrayList<Student> studentList = new ArrayList<>();

    @Override
    public void addStudent(Student student) {

        for(Student s : studentList) {
            if(s.getID() == student.getID()) {
                System.out.println("Duplicate student ID.");
                return;
            }
        }

        studentList.add(student);
        System.out.println("Student added successfully.");
    }

    @Override
    public ArrayList<Student> getAllStudents() {
        return studentList;
    }

    @Override
    public String updateStudent(int id, String name, String program) {

        for(Student student : studentList) {

            if(student.getID() == id) {
                student.setName(name);
                student.setProgram(program);

                return "Student updated successfully.";
            }
        }

        return "Student not found.";
    }

    @Override
    public String removeStudent(int id) {

        for(Student student : studentList) {

            if(student.getID() == id) {
                studentList.remove(student);

                return "Student removed successfully.";
            }
        }

        return "Student not found.";
    }
}