package org.example.service;

import org.example.exception.SectionFullException;
import org.example.interfaces.IEnrollmentService;
import org.example.model.Department;
import org.example.model.Section;
import org.example.model.Student;

public class EnrollmentRegistration implements IEnrollmentService {

    @Override
    public void enrollStudentInSection(Student student, Section section)
            throws SectionFullException {

        if(section.getStudents().size() >= section.getMaxCapacity()) {

            throw new SectionFullException(
                    "Enrollment failed: "
                            + section.getSectionName()
                            + " is currently full."
            );
        }

        section.getStudents().add(student);
    }

    @Override
    public void viewDepartmentHierarchy(Department department) {

        System.out.println("Department: "
                + department.getDepartmentName());

        for(Section section : department.getSections()) {

            System.out.println("Section: "
                    + section.getSectionName());

            if(section.getInstructor() != null) {

                System.out.println("Instructor: "
                        + section.getInstructor().getName());
            }

            System.out.println("Students:");

            for(Student student : section.getStudents()) {

                System.out.println("- "
                        + student.getName());
            }

            System.out.println();
        }
    }
}