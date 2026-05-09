package org.example.service;

import org.example.interfaces.ICourseService;
import org.example.model.Course;

import java.util.ArrayList;

public class CourseRegistration implements ICourseService {

    private ArrayList<Course> courseList = new ArrayList<>();

    @Override
    public void addCourse(Course course) {

        for(Course c : courseList) {

            if(c.getCourseID().equals(course.getCourseID())) {
                System.out.println("Duplicate course ID.");
                return;
            }
        }

        courseList.add(course);

        System.out.println("Course added successfully.");
    }

    @Override
    public ArrayList<Course> getAllCourses() {
        return courseList;
    }

    @Override
    public String updateCourse(String courseID, String courseName, String program) {

        for(Course course : courseList) {

            if(course.getCourseID().equals(courseID)) {

                course.setCourseName(courseName);
                course.setProgram(program);

                return "Course updated successfully.";
            }
        }

        return "Course not found.";
    }

    @Override
    public String removeCourse(String courseID) {

        for(Course course : courseList) {

            if(course.getCourseID().equals(courseID)) {

                courseList.remove(course);

                return "Course removed successfully.";
            }
        }

        return "Course not found.";
    }
}