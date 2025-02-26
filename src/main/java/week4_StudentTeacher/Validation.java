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

    public static int input6Digit() {
        while (true) {
            String result = inputString();
            if (result.matches("^\\d{6}$")) {
                return Integer.parseInt(result);
            } else {
                System.out.println("Input must not be a 6 digits");
                System.out.print("Please input again: ");
            }

        }

    }

     public static String updateOrDelete(String[] choice) {
        while (true) {
            String result = inputString();
            for (String emp : choice) {
                if (result.equals(emp)) {
                    return result;
                }
            }
            System.out.println("Please input 'Long' or 'Short'!");
            System.out.print("Input again: ");
        }
    }
    
      public static int input12Digit() {
        while (true) {
            String result = inputString();
            if (result.matches("^\\d{12}$")) {
                return Integer.parseInt(result);
            } else {
                System.out.println("Input must not be a 12 digits");
                System.out.print("Please input again: ");
            }

        }

    }
     public static String stringLowerThan30(){
         while(true){
             String result = inputString();
             if(result.length() <= 30){
                 return result;
             }
         }
         
         
         
         
         
     } 
      
      
     
}
