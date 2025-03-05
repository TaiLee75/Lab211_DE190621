/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6_Worker;

/**
 *
 * @author ADMIN
 */
public class Worker {
    private String code, name, workLocation;
    private int age, salary;

    public Worker() {
    }

    public Worker(String code, String name, String workLocation, int age, int salary) {
        this.code = code;
        this.name = name;
        this.workLocation = workLocation;
        this.age = age;
        this.salary = salary;
      
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    

    @Override
    public String toString() {
        return String.format("%-10s %-15s %-15d %-15d %-15s", code,name,age,salary,workLocation);
    }
    
    
    
    
}
