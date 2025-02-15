package week4_StudentManagement;

import java.util.Scanner;

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

    public static int inputChoiceInt() {
        while (true) {
            try {
                int result = Integer.parseInt(inputString());
                if (result > 0 && result < 6) {
                    return result;
                } else {
                    System.out.println("Input must be between 1 and 4");
                    System.out.printf("Please input again: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input must be an integer");
                System.out.printf("Please input again: ");
            }
        }
    }

    public static String updateOrDelete(String[] choice) {
        while (true) {
            String result = inputString();
            for (String emp : choice) {
                if (result.equalsIgnoreCase(emp)) {
                    return result;
                }
            }
            System.out.println("Please input 'U' or 'D'!");
            System.out.print("Input again: ");
        }
    }
}
