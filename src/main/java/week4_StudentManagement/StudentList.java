package week4_StudentManagement;

import java.util.ArrayList;


public class StudentList {

    ArrayList<Student> studentList = new ArrayList<>();

    void addStudent(Student student) {
        studentList.add(student);
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public ArrayList<Student> findByID(String id) {
        ArrayList<Student> emp = new ArrayList<>();
        for (Student stu : studentList) {
            if (stu.getId().contains(id)) {
                emp.add(stu);
            }
        }
        return emp;
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


    public void deleteStudent(ArrayList<Student> student) {
        studentList.removeAll(student);
    }

    public void updateStudent(String stuName, String id, String semester, String couName, Student student) {
        student.setCourseName(couName);
        student.setId(id);
        student.setSemester(semester);
        student.setStudentName(stuName);

    }

}
