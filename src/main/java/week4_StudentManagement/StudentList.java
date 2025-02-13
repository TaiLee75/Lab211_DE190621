package week4_StudentManagement;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList {

    ArrayList<Student> studentList = new ArrayList<>();

    void addStudent(Student student) {
        studentList.add(student);
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public Student findByID(String id) {
        for (Student emp : studentList) {
            if (id.equals(emp.getId())) {
                return emp;
            }
        }
        return null;
    }

    public ArrayList<Student> findByName(String name) {
        ArrayList<Student> emp = new ArrayList<>();
        for (Student stu : studentList) {
            if (stu.getStudentName().contains(name)) {
                emp.add(stu);
            }
        }
        return emp;
    }

//    public void sortByName() {
//        Collections.sort(studentList);
//    }
    
    
    public void removeStudent(ArrayList<Student> student) {
        studentList.removeAll(student);
    }

}
