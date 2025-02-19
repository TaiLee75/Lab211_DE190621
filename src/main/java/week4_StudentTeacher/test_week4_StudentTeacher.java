/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4_StudentTeacher;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class test_week4_StudentTeacher {

    public static void main(String[] args) {

        PersonListView plv = new PersonListView();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("*** Information Management ***");
            System.out.println("1.Teacher");
            System.out.println("2.Student");
            System.out.println("3.Person");
            System.out.println("4.Exit");
            System.out.print("Your choose: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    int choice1 = 0;
                    while (choice1 != 3) {

                        System.out.println("*** Teacher Management ***");
                        Menu();
                        choice1 = sc.nextInt();
                        switch (choice1) {
                            case 1 -> {
                                plv.addPerson(choice);
                                break;
                            }
                            case 2 -> {
                                plv.printPerson(choice);
                                break;
                            }
                        }

                    }
                    break;
                }
                case 2 -> {
                    int choice2 = 0;
                    while (choice2 != 3) {

                        System.out.println("*** Student Management ***");
                        Menu();
                        choice2 = sc.nextInt();
                        switch (choice2) {
                            case 1 -> {
                                plv.addPerson(choice);
                                break;
                            }
                            case 2 -> {
                                plv.printPerson(choice);
                                break;
                            }
                        }

                    }
                    break;

                }
                case 3 -> {
                    int choice2 = 0;
                    while (choice2 != 3) {

                        System.out.println("*** Person Management ***");
                        System.out.println("1. Search");
                        System.out.println("2. Print all");
                        System.out.println("3. Exit");
                        System.out.print("Your choose: ");
                        choice2 = sc.nextInt();
                        switch (choice2) {
                            case 1 -> {
                                plv.addPerson(choice);
                                break;
                            }
                            case 2 -> {
                                plv.findPerson();
                                break;
                            }
                        }

                    }
                    break;

                }
            }
        }

    }

    public static void Menu() {

        System.out.println("1. Input");
        System.out.println("2. Print");
        System.out.println("3. Exit");
        System.out.print("Your choose: ");

    }

}
