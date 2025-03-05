/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6_Worker;

import java.util.List;

/**
 *
 * @author ADMIN
 */
public class WorkerListView {

    WorkerList worker = new WorkerList();

    public String inputAndCheckExistCode() {
        String code = Validation.inputString();
        for (Worker temp : worker.getAllWorkers()) {
            if (temp.getCode().equalsIgnoreCase(code)) {
                System.out.println("Code exist!");
                System.out.print("Please enter again: ");
                return inputAndCheckExistCode();
            }
        }
        return code;
    }

    public void addWorker() {
        System.out.println("------------ Add Worker -------------");
        System.out.print("Enter code: ");
        String code = inputAndCheckExistCode();
        System.out.print("Enter name: ");
        String name = Validation.inputString();
        System.out.print("Enter age: ");
        int age = Validation.inputAge();
        System.out.print("Enter salary: ");
        int salary = Validation.inputPositiveInt();
        System.out.print("Enter work location: ");
        String workLocation = Validation.inputString();

        Worker temp = new Worker(code, name, workLocation, age, salary);
        worker.addWorker(temp);
        System.out.println("WOrker added successfully");
    }

    public void printWorker() {
        System.out.println("----------------Display Information Worker--------------------");
        System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", "code", "name", "age", "salary", "Work Location");
        for (Worker temp : worker.getAllWorkers()) {
            System.out.println(temp);
        }
    }

    public void printSalaryWorker() {
        System.out.println("----------------Display Information Salary--------------------");
        System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s\n", "code", "name", "age", "salary", "Work Location", "Status");
        List<WorkerSalary> salaryList = worker.getSalaryWorkers();
        if (salaryList != null && !salaryList.isEmpty()) {
            for (WorkerSalary temp : worker.getSalaryWorkers()) {
                System.out.println(temp);
            }
        }else{
            System.out.println("Empty List");
        }

    }

    public void changeSalary() {
        
        System.out.print("Enter code of the worker you want to find: ");
        String code = Validation.inputString();
       Worker temp = worker.findByCode(code);
        if (temp != null) {
            System.out.print("Enter new salary: ");
            int newSalary = Validation.inputPositiveInt();
            worker.changeSalary(newSalary, temp);
        }else{
            System.out.println("Worker not found!");
        }

    }

}
