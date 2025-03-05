/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6_Worker;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class WorkerList {

    ArrayList<Worker> workers = new ArrayList<>();
    List<WorkerSalary> salaryWorkers = new ArrayList<>();

    public void addWorker(Worker temp) {
        workers.add(temp);
    }

   

    public ArrayList<Worker> getAllWorkers() {
        return workers;
    }

    public List<WorkerSalary> getSalaryWorkers() {
        return salaryWorkers;
    }
    
    
    

    public Worker findByCode(String code) {
        Worker result = null;
        for (Worker temp : workers) {
            if (code.equalsIgnoreCase(temp.getCode())) {
                return temp;
            }
        }
        return null;
    }

    public void changeSalary(int newSalary, Worker worker) {
        if (worker.getSalary() > newSalary) {
            worker.setSalary(newSalary);
            WorkerSalary temp = new WorkerSalary("DOWN", worker.getCode(), worker.getName(), worker.getWorkLocation(), worker.getAge(),newSalary );
            salaryWorkers.add(temp);
            System.out.println("Salary changed");
        } else if (worker.getSalary() < newSalary) {
            worker.setSalary(newSalary);
            WorkerSalary temp = new WorkerSalary("UP", worker.getCode(), worker.getName(), worker.getWorkLocation(), worker.getAge(),newSalary );
            salaryWorkers.add(temp);
            System.out.println("Salary changed");
        }else{
            System.out.println("Same Salary");
        }

    }


    
}
