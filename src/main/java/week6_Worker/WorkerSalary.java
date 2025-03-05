/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6_Worker;

/**
 *
 * @author ADMIN
 */
public class WorkerSalary extends Worker{
    private String status;

    public WorkerSalary() {
    }

  

    public WorkerSalary(String status, String code, String name, String workLocation, int age, int salary) {
        super(code, name, workLocation, age, salary);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-15s", status);
    }
    
    
}
