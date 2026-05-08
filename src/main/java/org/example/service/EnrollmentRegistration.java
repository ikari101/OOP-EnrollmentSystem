package org.example.service;

import org.example.interfaces.IEnrollmentService;
import org.example.model.Department;
import org.example.model.Section;
import org.example.model.Student;

public class EnrollmentRegistration implements IEnrollmentService {

    @Override
    public boolean enrollStudentInSection(Student student, Section section) {

        if(section.getStudents().size() >= section.getMaxCapacity()) {

            System.out.println("Section is full.");
            return false;
        }

        section.getStudents().add(student);

        System.out.println("Student enrolled successfully.");

        return true;
    }

    @Override
    public void viewDepartmentHierarchy(Department department) {

        System.out.println("Department: " + department.getDepartmentName());

        for(Section section : department.getSections()) {

            System.out.println("Section: " + section.getSectionName());

            if(section.getInstructor() != null) {

                System.out.println("Instructor: " + section.getInstructor().getName());
            }

            System.out.println("Students:");

            for(Student student : section.getStudents()) {

                System.out.println("- " + student.getName());
            }

            System.out.println();
        }
    }
}