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
public class PersonListView {

    Scanner sc = new Scanner(System.in);
    PersonList person = new PersonList();

    public void addPerson(int choice) {
        System.out.print("Enter id: ");
        int id = sc.nextInt();
        System.out.print("Enter full name: ");
        String name = sc.nextLine();
        System.out.print("Enter phone number: ");
        int phoneNum = sc.nextInt();
        System.out.print("Enter year of birth: ");
        int yearBirth = sc.nextInt();
        System.out.print("Enter major: ");
        String major = sc.nextLine();
        if (choice == 1) {
            System.out.print("Enter year of profession: ");
            int yearWork = sc.nextInt();
            System.out.print("Enter contract type: ");
            String contract = sc.nextLine();
            System.out.print("Enter salary: ");
            int salary = sc.nextInt();

            Person teacher = new Teacher(yearWork, contract, salary, id, name, phoneNum, yearBirth, major);
            person.addPerson(teacher);
            System.out.println("Add teacher succesfully!");

        } else if (choice == 2) {
            System.out.print("Enter year of admission: ");
            int yearOfAd = sc.nextInt();
            System.out.println("Enter entrance English score: ");
            int score = sc.nextInt();

            Person student = new Student(yearOfAd, score, id, name, phoneNum, yearBirth, major);
            person.addPerson(student);
            System.out.println("Add student succesfully!");

        } else {
            Person person1 = new Person(id, name, phoneNum, yearBirth, major);
            person.addPerson(person1);
            System.out.println("Add person succesfully");
        }

    }

    public void printPerson(int choice) {
        if (choice == 1) {
            for (Person emp : person.getPersons()) {
                if (emp instanceof Teacher) {
                    System.out.println(emp);
                }
            }
        } else if (choice == 2) {
            for (Person emp : person.getPersons()) {
                if (emp instanceof Student) {
                    System.out.println(emp);
                }
            }
        } else {
            for (Person emp : person.getPersons()) {
                if (emp instanceof Person) {
                    System.out.println(emp);
                }
            }
        }
    }

    public void findPerson() {
        System.out.print("Enter name of the person that you want to find: ");
        String name = sc.nextLine();
        Person temp = person.findByName(name);
        if(temp != null){
            System.out.println(temp);
        }
    }
}
