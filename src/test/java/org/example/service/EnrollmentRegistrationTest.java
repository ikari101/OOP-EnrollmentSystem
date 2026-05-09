package org.example.service;

import org.example.exception.SectionFullException;
import org.example.model.Section;
import org.example.model.Student;
import org.example.service.EnrollmentRegistration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EnrollmentRegistrationTest {

    @Test
    void testEnrollStudentSuccessfully()
            throws SectionFullException {

        EnrollmentRegistration enrollmentService =
                new EnrollmentRegistration();

        Section section =
                new Section("BSIT-1A", 2);

        Student student =
                new Student(1, "John", "BSIT");
                new Student(2, "Mark", "BSIT");

        enrollmentService.enrollStudentInSection(
                student,
                section
        );

        assertEquals(
                1,
                section.getStudents().size(),
                "Student was not enrolled successfully."
        );
    }

    @Test
    void testSectionFullException() {

        EnrollmentRegistration enrollmentService =
                new EnrollmentRegistration();

        Section section =
                new Section("BSIT-1A", 1);

        Student student1 =
                new Student(1, "John", "BSIT");

        Student student2 =
                new Student(2, "Jane", "BSIT");

        assertDoesNotThrow(() ->
                enrollmentService.enrollStudentInSection(
                        student1,
                        section
                )
        );

        assertThrows(
                SectionFullException.class,
                () -> enrollmentService.enrollStudentInSection(
                        student2,
                        section
                ),
                "SectionFullException was not thrown."
        );
    }
}