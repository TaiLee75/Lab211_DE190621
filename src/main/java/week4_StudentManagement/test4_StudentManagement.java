package week4_StudentManagement;

import java.util.Scanner;

public class test4_StudentManagement {

    public static void main(String[] args) {
        StudentListView slv = new StudentListView();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("========WELCOME TO STUDENT MANAGEMENT=========");
            System.out.println("1. Create");
            System.out.println("2. Find and Sort");
            System.out.println("3. Update/Delete");
            System.out.println("4. Report");
            System.out.println("5. Exit");
            System.out.print("Please enter your choice: ");
            choice = Validation.inputChoiceInt();
            switch (choice) {
                case 1 -> {
                 slv.addStudent();
                 break;
                }
                case 2 ->{
                    slv.findAndSort();
                    break;
                }
                case 3 ->{
                    slv.deleteOrUpDateStudent();
                    break;
                }
                case 4 ->{
                    System.out.println("Het cuu");
                }

            }
        }

    }

}
