/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6_Contact;

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

    public static String inputName() {
       

        while (true) {
             String result = inputString().trim();
            if (result.matches("[A-Za-zÀ-Ỹà-ỹ]+ [A-Za-zÀ-Ỹà-ỹ]+")) {
                return result;
            } else {
                System.out.println("Wrong name format!");
                System.out.print("Please input again: ");
            }
        }
    }

    public static String inputPhoneNumber() {
        String regex = "^(\\d{10}|\\d{3}[-.\\s]\\d{3}[-.\\s]\\d{4}"
                + "|\\d{3}[-.\\s]\\d{3}[-.\\s]\\d{4}\\s*x\\d{1,5}"
                + "|\\d{3}[-.\\s]\\d{3}[-.\\s]\\d{4}\\s*ext\\d{1,5})$";
        

        while (true) {
             String result = inputString().trim();
            if (result.trim().matches(regex)) {
                return result;
            } else {
                System.out.println("Wrong phone number format!");
                System.out.print("Please input again: ");
            }
        }

    }
}
