/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4_StudentTeacher;

/**
 *
 * @author ADMIN
 */
public class Teacher extends Person {

    private int yearWork;
    private String contract;
    private int salary;

    public Teacher() {
        super();
        this.contract = "";
        this.yearWork = 0;
        this.salary = 0;
    }

    public void inputAll(int yearWork, String contract, int salary) {
        super.inputAll(id, fullName, phoneNumber, yearOfBirth, major);
        this.yearWork = yearWork;
        this.contract = contract;
        this.salary = salary;
    }

    public Teacher(int yearWork, String contract, int salary) {
        this.yearWork = yearWork;
        this.contract = contract;
        this.salary = salary;
    }

    public Teacher(int yearWork, String contract, int salary, int id, String fullName, int phoneNumber, int yearOfBirth, String major) {
        super(id, fullName, phoneNumber, yearOfBirth, major);
        this.yearWork = yearWork;
        this.contract = contract;
        this.salary = salary;
    }

    
    
    @Override
    public String toString() {
        return super.toString() + "Teacher{" + "yearWork=" + yearWork + ", contract=" + contract + ", salary=" + salary + '}';
    }

}
