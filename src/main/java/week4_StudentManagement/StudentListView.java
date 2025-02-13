package week4_StudentManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentListView {

    Scanner sc = new Scanner(System.in);
    StudentList stuList = new StudentList();

    public void addStudent() {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter semester: ");
        String semester = sc.nextLine();
        System.out.print("Enter course name: ");
        String courseName = sc.nextLine();

        Student temp = new Student(id, courseName, semester, courseName);
        stuList.addStudent(temp);
        System.out.println("Add student succesfully!");
    }

    public void showStudent(){
        for(Student temp : stuList.getStudentList()){
            System.out.println(temp);
        }
    }
    
    public void deleteStudent(ArrayList<Student> student) {
        stuList.removeStudent(student);
    }

    
    
    
}
