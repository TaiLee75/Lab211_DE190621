/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6_Worker;

/**
 *
 * @author ADMIN
 */
public class test_week6_worker {

    public static void main(String[] args) {
        WorkerListView worker = new WorkerListView();

        String[] options = {
            "Add Worker",
            "Change Salary",
            "Display Information salary",
            "Exit"
        };

        Menu menu = new Menu("========= Contact program =========", options) {
            @Override
            public void execute(int n) {
                switch (n) {
                    case 1:
                        worker.addWorker();
                        worker.printWorker();
                        break;
                    case 2:
                        worker.changeSalary();
                        break;
                    case 3:
                        worker.printSalaryWorker();
                        break;

                    case 4:
                        System.exit(0);
                }
            }

        };

        menu.run();

    }
}
