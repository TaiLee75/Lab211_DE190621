/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4_StudentTeacher;

/**
 *
 * @author ADMIN
 */
public class Student extends Person{
    private int yearOfAd;
    private int score;

    public Student() {
        super();
        this.score = 0;
        this.yearOfAd = 0;
    }

    public Student(int yearOfAd, int score) {
        this.yearOfAd = yearOfAd;
        this.score = score;
    }

    public Student(int yearOfAd, int score, int id, String fullName, int phoneNumber, int yearOfBirth, String major) {
        super(id, fullName, phoneNumber, yearOfBirth, major);
        this.yearOfAd = yearOfAd;
        this.score = score;
    }

    
    
    public void inputAll(int yearOfAd, int score) {
        super.inputAll(id, fullName, phoneNumber, yearOfBirth, major);
        this.yearOfAd = yearOfAd;
        this.score = score;
    }

    @Override
    public String toString() {
        return super.toString() + "yearOfAd=" + yearOfAd + ", score=" + score + '}';
    }
    
    
    
}
