
package week3;

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
                if (result >= 2) {
                    return result;
                } else {
                    System.out.println("Input must be a positive integer");
                    System.out.printf("Please input again: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input must be an integer");
                System.out.printf("Please input again: ");
            }
        }

    }
    
    
}
