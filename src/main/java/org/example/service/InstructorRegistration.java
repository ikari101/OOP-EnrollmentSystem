package org.example.service;

import org.example.model.Instructor;

import java.util.*;

public class InstructorRegistration {
    private ArrayList<Instructor> instructorList = new ArrayList<>();
    Scanner hh = new Scanner(System.in);

    //Create
    public void addInstructor(Instructor instructor){
        instructorList.add(instructor);
    }

    //Read
    public void displayAll(){
        System.out.println(instructorList);
    }

    //Update
    public String updateInstructor(Instructor instructor){
        for(int i = 0; i < instructorList.size(); i++){
            if(instructorList.get(i).getID() == (instructor.getID())){
                System.out.print("Enter instructor name: ");
                String instructorName = hh.nextLine();

                System.out.print("Enter course: ");
                String course = hh.nextLine();

                ArrayList<String> courses = new ArrayList<>();
                courses.add(course);
                instructorList.set(i, new Instructor(instructor.getID(), instructorName, courses));
                return "Successfully updated";
            }
        }
        return "Instructor not found";
    }

    //Remove
    public String delete(Instructor instructor){
        for(int i = 0; i < instructorList.size(); i++){
            if(instructorList.get(i).getID() == (instructor.getID())){
                instructorList.remove(i);
                return "Successfully deleted.";
            }
        }
        return "Error";
    }
}
