package org.example.service;

import org.example.interfaces.IInstructorService;
import org.example.model.Instructor;

import java.util.ArrayList;

public class InstructorRegistration implements IInstructorService {

    private ArrayList<Instructor> instructorList = new ArrayList<>();

    @Override
    public void addInstructor(Instructor instructor) {

        for(Instructor i : instructorList) {

            if(i.getID() == instructor.getID()) {
                System.out.println("Duplicate instructor ID.");
                return;
            }
        }

        instructorList.add(instructor);

        System.out.println("Instructor added successfully.");
    }

    @Override
    public ArrayList<Instructor> getAllInstructors() {
        return instructorList;
    }

    @Override
    public String updateInstructor(int id, String name, ArrayList<String> courses) {

        for(Instructor instructor : instructorList) {

            if(instructor.getID() == id) {

                instructor.setName(name);
                instructor.setCourses(courses);

                return "Instructor updated successfully.";
            }
        }

        return "Instructor not found.";
    }

    @Override
    public String removeInstructor(int id) {

        for(Instructor instructor : instructorList) {

            if(instructor.getID() == id) {

                instructorList.remove(instructor);

                return "Instructor removed successfully.";
            }
        }

        return "Instructor not found.";
    }

    @Override
    public String getInstructorDetails(int id) {

        for(Instructor instructor : instructorList) {

            if(instructor.getID() == id) {

                return instructor.toString();
            }
        }

        return "Instructor not found.";
    }

    @Override
    public void assignInstructorToSection(int instructorID, String sectionName) {

        System.out.println("Instructor assigned to section: " + sectionName);
    }
}