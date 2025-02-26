package week5_Course;

import java.util.ArrayList;
import week4_StudentTeacher.Person;

public class CourseList {

    ArrayList<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);

    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public Course findByID(String id) {
        for (Course temp : courses) {
            if (id.equalsIgnoreCase(temp.courseId)) {
                return temp;
            }
        }
        return null;
    }
    
    public void deleteCourse(Course course){
        courses.remove(course);
    }
    
    
}
