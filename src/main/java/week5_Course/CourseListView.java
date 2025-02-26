/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_Course;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class CourseListView {

    CourseList courseList = new CourseList();
    Scanner sc = new Scanner(System.in);

    public void addCourse() {
        System.out.println("*** Add new course ***");
        System.out.print("Online (O) or Offline (F): ");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("O")) {
            System.out.println("create new online course: ");
            System.out.print("Course ID: ");
            String courseId = Validation.inputString();
            System.out.print("Course name: ");
            String courseName = Validation.inputString();
            System.out.print("Credits: ");
            int credits = sc.nextInt();
            System.out.print("Platform: ");
            String platform = Validation.inputString();
            System.out.print("Instructors: ");
            String instructors = Validation.inputString();
            System.out.print("Note: ");
            String note = Validation.inputString();
            OnlineCourse emp = new OnlineCourse(platform, instructors, note, courseId, courseName, credits);
            courseList.addCourse(emp);
            System.out.println("Online course added!");
        } else {
            System.out.println("create new offline course: ");
            System.out.print("Course ID: ");
            String courseId = Validation.inputString();
            System.out.print("Course name: ");
            String courseName = Validation.inputString();
            System.out.print("Credits: ");
            int credits = sc.nextInt();
            System.out.print("Teacher name: ");
            String teacher = Validation.inputString();
            System.out.print("Campus: ");
            String campus = Validation.inputString();
            System.out.print("Begin: ");
            Date begin = Validation.inputDate();
            System.out.print("End");
            Date end = Validation.inputDate();
            OfflineCourse emp = new OfflineCourse(teacher, campus, begin, end, courseId, courseName, credits);
            courseList.addCourse(emp);
            System.out.println("Offline course added!");

        }

    }

    public void updateCourse() {
        System.out.println("*** Update course ***");
        System.out.print("Course ID: ");
        String courseId = Validation.inputString();
        Course temp = null;
        temp = courseList.findByID(courseId);
        if (temp != null) {
            if (temp instanceof OnlineCourse) {
                System.out.println("*** Updating ***\nNote: Enter empty if you don't want to change it.");
                System.out.print("Course ID: ");
                String newCourseId = sc.nextLine();
                System.out.print("Course name: ");
                String courseName = sc.nextLine();
                System.out.print("Credits: ");
                int credits = sc.nextInt();
                System.out.print("Platform: ");
                String platform = sc.nextLine();
                System.out.print("Instructors: ");
                String instructors = sc.nextLine();
                System.out.print("Note: ");
                String note = sc.nextLine();

                temp.setCredits(credits);
                if (!newCourseId.isEmpty()) {
                    temp.setCourseId(newCourseId);
                }
                if (!courseName.isEmpty()) {
                    temp.setCourseName(courseName);
                }
                if (!platform.isEmpty()) {
                    ((OnlineCourse) temp).setPlatform(platform);
                }
                if (!instructors.isEmpty()) {
                    ((OnlineCourse) temp).setInstructors(instructors);
                }
                if (!note.isEmpty()) {
                    ((OnlineCourse) temp).setNote(note);
                }
                System.out.println("Updated successfully");
            } else if (temp instanceof OfflineCourse) {
                System.out.println("*** Updating ***\nNote: Enter empty if you don't want to change it.");
                System.out.print("Course ID: ");
                String newCourseId = sc.nextLine();
                System.out.print("Course name: ");
                String courseName = sc.nextLine();
                System.out.print("Credits: ");
                int credits = sc.nextInt();
                System.out.print("Teacher name: ");
                String teacher = Validation.inputString();
                System.out.print("Campus: ");
                String campus = Validation.inputString();
                System.out.print("Begin: ");
                Date begin = Validation.inputDate();
                System.out.print("End");
                Date end = Validation.inputDate();

                temp.setCredits(credits);
                ((OfflineCourse) temp).setEnd(end);
                ((OfflineCourse) temp).setBegin(begin);
                if (!newCourseId.isEmpty()) {
                    temp.setCourseId(newCourseId);
                }
                if (!courseName.isEmpty()) {
                    temp.setCourseName(courseName);
                }
                if (!campus.isEmpty()) {
                    ((OfflineCourse) temp).setCampus(campus);
                }
                if (!teacher.isEmpty()) {
                    ((OfflineCourse) temp).setTeacher(teacher);
                }
                System.out.println("Updated successfully");

            }

        }else{
            String choice = Validation.yesOrNo(new String[]{"Y","N"});
            if(choice.equalsIgnoreCase("Y")){
                 updateCourse();
            }else{
                return;
            }
           
        }

    }
    
    public void deleteCourse(){
        System.out.println("*** Delete course ***");
        System.out.print("Course ID: ");
        String courseId = Validation.inputString();
        Course temp = null;
        temp = courseList.findByID(courseId);
        if (temp != null) {
            courseList.deleteCourse(temp);
            System.out.println("Delete succesfully");
        }else{
            String choice = Validation.yesOrNo(new String[]{"Y","N"});
            if(choice.equalsIgnoreCase("Y")){
                 deleteCourse();
            }else{
                return;
            }
           
        }
    }
    
     public void printCourse(){
            System.out.println("*** Print course ***");
            System.out.print("Do you want to print all (A), online course (O) or offline course (F): ");
            String choice = Validation.printChoice( new String[]{"A","O","F"});
            if(choice.equalsIgnoreCase("O")||choice.equalsIgnoreCase("A")){
                System.out.println("*** Online course ***");
                for(Course temp : courseList.getCourses()){
                    if(temp instanceof OnlineCourse ){
                        System.out.println(temp);
                    }
                }
            }
            if(choice.equalsIgnoreCase("F")||choice.equalsIgnoreCase("A")){
                System.out.println("*** Offline course ***");
                for(Course temp : courseList.getCourses()){
                    if(temp instanceof OfflineCourse ){
                        System.out.println(temp);
                    }
                }
            }
    }
     
     
     public void findByID(){
         System.out.println("*** Find course by ID ***");
        System.out.print("Course ID: ");
        String courseId = Validation.inputString();
        Course temp = null;
        temp = courseList.findByID(courseId);
        if (temp != null) {
            System.out.println("result: ");
            System.out.println(temp);
        }else{
            System.out.println("No result !");
        }
     }
}
