/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4_StudentTeacher;



/**
 *
 * @author ADMIN
 */
public class Person {

    protected int id;
    protected String fullName;
    protected int phoneNumber;
    protected int yearOfBirth;
    protected String major;

    public Person() {
        this.id = 0;
        this.fullName = "";
        this.phoneNumber = 0;
        this.yearOfBirth = 0;
        this.major = "";
    }

    public void inputAll(int id, String fullName, int phoneNumber, int yearOfBirth, String major) {
        this.id = id;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.yearOfBirth = yearOfBirth;
        this.major = major;
    }

    public Person(int id, String fullName, int phoneNumber, int yearOfBirth, String major) {
        this.id = id;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.yearOfBirth = yearOfBirth;
        this.major = major;
    }

    
    
    public String getFullName() {
        return fullName;
    }

    

    @Override
    public String toString() {
        return  "id=" + id + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", yearOfBirth=" + yearOfBirth + ", major=" + major + '}';
    }

    
    
    
    
}
