package org.example.service;

import org.example.model.Student;
import org.example.service.StudentRegistration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentRegistrationTest {

    @Test
    void testAddStudent() {

        StudentRegistration studentService =
                new StudentRegistration();

        Student student =
                new Student(1, "John", "BSIT");

        studentService.addStudent(student);

        assertEquals(
                1,
                studentService.getAllStudents().size(),
                "Student was not added successfully."
        );
    }

    @Test
    void testRemoveStudent() {

        StudentRegistration studentService =
                new StudentRegistration();

        Student student =
                new Student(1, "John", "BSIT");

        studentService.addStudent(student);

        studentService.removeStudent(1);

        assertEquals(
                0,
                studentService.getAllStudents().size(),
                "Student was not removed successfully."
        );
    }
}