package week4_StudentManagement;

import java.util.ArrayList;
import java.util.Collections;

public class StudentListView {

    StudentList stuList = new StudentList();

    public void addStudent() {
        System.out.print("Enter ID: ");
        String id = Validation.inputString();
        System.out.print("Enter name: ");
        String name = Validation.inputString();
        System.out.print("Enter semester: ");
        String semester = Validation.inputString();
        System.out.print("Enter course name: ");
        String courseName = Validation.inputString();

        Student temp = new Student(id, name, semester, courseName);
        stuList.addStudent(temp);
        System.out.println("Add student succesfully!\n");
        showStudent();
        System.out.println("");
    }

    public void showStudent() {
        for (Student temp : stuList.getStudentList()) {
            System.out.println(temp);
        }
    }

    public void deleteOrUpDateStudent() {
        ArrayList<Student> emp = null;
        System.out.print("Enter Id of the student that you want to find: ");
        String id = Validation.inputString();
        emp = stuList.findByID(id);
        if (emp != null && !emp.isEmpty()) {
            System.out.println("Student found: ");
            for (Student student : emp) {
                System.out.println(student);
            }
            System.out.print("Do you want to update (U) or delete (D) student: ");
            String choice = Validation.updateOrDelete(new String[]{"U", "D"});
            if (choice.equalsIgnoreCase("U")) {
                for (Student student : emp) {
                    int n = 1;
                    System.out.println("Update student " + n + ": ");
                    System.out.print("Enter new ID: ");
                    String newId = Validation.inputString();
                    System.out.print("Enter new name: ");
                    String name = Validation.inputString();
                    System.out.print("Enter new semester: ");
                    String semester = Validation.inputString();
                    System.out.print("Enter new course name: ");
                    String courseName = Validation.inputString();
                    stuList.updateStudent(name, id, semester, courseName, student);
                    n++;
                }
                System.out.println("Update student succesfully!");
                showStudent();
            }
            if (choice.equalsIgnoreCase("D")) {
                stuList.deleteStudent(emp);
                System.out.println("Delete student succesfully!");
                stuList.deleteStudent(emp);
                showStudent();
            }
        } else {
            System.out.println("Student not found!");
        }

    }

    public void findAndSort() {
        ArrayList<Student> emp = null;
        System.out.print("Enter name of the student that you want to find: ");
        String name = Validation.inputString();
        emp = stuList.findByName(name);
        if (emp != null && !emp.isEmpty()) {
            Collections.sort(emp);
            System.out.println("Student found: ");
            for (Student student : emp) {
                System.out.println(student);
            }
        } else {
            System.out.println("Student not found");
        }
    }

}
