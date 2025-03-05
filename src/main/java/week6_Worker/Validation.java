/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6_Worker;

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
    
    
    public static int inputPositiveInt() {
        while (true) {
            try {
                int result = Integer.parseInt(inputString());
                if (result > 0) {
                    return result;
                } else {
                    System.out.println("Input must be positive");
                    System.out.printf("Please input again: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input must be an integer");
                System.out.printf("Please input again: ");
            }
        }
    }
    
     public static int inputAge() {
        while (true) {
            try {
                int result = Integer.parseInt(inputString());
                if (result >= 18 && result <=50) {
                    return result;
                } else {
                    System.out.println("Input must be from 18 to 50");
                    System.out.printf("Please input again: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input must be an integer");
                System.out.printf("Please input again: ");
            }
        }
    }
    
    
}
