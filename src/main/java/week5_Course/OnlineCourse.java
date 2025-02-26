/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_Course;

/**
 *
 * @author ADMIN
 */
public class OnlineCourse extends Course{
    private String platform;
    private String instructors;
    private String note;

    public OnlineCourse() {
    }

  

    public OnlineCourse(String platform, String instructors, String note, String courseId, String courseName, int credits) {
        super(courseId, courseName, credits);
        this.platform = platform;
        this.instructors = instructors;
        this.note = note;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getInstructors() {
        return instructors;
    }

    public void setInstructors(String instructors) {
        this.instructors = instructors;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return super.toString() + "platform=" + platform + ", instructors=" + instructors + ", note=" + note + '}';
    }
    
    
    
    
    
    
}
