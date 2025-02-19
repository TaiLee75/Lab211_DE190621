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
public class Validation {
    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String result = scanner.nextLine();
            if (!result.isEmpty()) {
                return result;
            } else {
                System.out.println("Input must not be empty");
                System.out.printf("Please input again: ");
            }
        }
    }
}
