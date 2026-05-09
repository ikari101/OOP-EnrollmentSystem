package org.example.interfaces;

import org.example.exception.SectionFullException;
import org.example.model.Department;
import org.example.model.Section;
import org.example.model.Student;

public interface IEnrollmentService {

    void enrollStudentInSection(Student student, Section section)
            throws SectionFullException;

    void viewDepartmentHierarchy(Department department);
}