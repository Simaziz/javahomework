package homeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseImplement implements CourseService {
    private List<Course> courses;

    public CourseImplement() {
        this.courses = new ArrayList<>();
    }

    @Override
    public void addNewCourse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">".repeat(30));

        System.out.print("[+] Insert Course Title     = ");
        String course = scanner.next();
        System.out.println("[+] Insert Instructor Name = ");
        String instructor =scanner.next();
        System.out.println("[+] Insert Course requirement = ");
        String requirement =scanner.next();


        if(course.isEmpty()){
            System.out.println("Course ID or Title should not be empty!");
            return;
        }


        Course course1 = new Course(course);
        courses.add(course1);
        System.out.println("Course added successfully.");
        Course instructor1 = new Course(instructor);
        instructores.add(instructor1);
        System.out.println("Course added successfully.");
    }

    @Override
    public void listCourse() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            System.out.println("Available Courses:");
            for (Course course : courses) {
                System.out.println(course);
            }
        }
        if (instructores.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            System.out.println("Available Courses:");
            for (Course course : courses) {
                System.out.println(course);
            }
        }
    }

    @Override
    public void findCourseByID() {
        // Implementation for finding a course by its ID
    }

    @Override
    public void findCourseByTitle() {
        // Implementation for finding a course by its title
    }

    @Override
    public void removeCourseByID() {
        // Implementation for removing a course by its ID
    }
}
