/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_Course;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    
    public static Date inputDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
         dateFormat.setLenient(false);
         while(true){
             try{
             Date result = dateFormat.parse(inputString());
             return result;
         }catch(ParseException e){
                 System.out.println("Wrong date format");
                 System.out.print("input again(dd/MM/yyyy): ");
         }
         }   
        
    }
    
    public static String yesOrNo(String[] choice) {
        while (true) {
            String result = inputString();
            for (String emp : choice) {
                if (result.equals(emp)) {
                    return result;
                }
            }
            System.out.println("Please input 'Y' or 'N'!");
            System.out.print("Input again: ");
        }
    }
   
    public static String printChoice(String[] choice) {
        while (true) {
            String result = inputString();
            for (String emp : choice) {
                if (result.equals(emp)) {
                    return result;
                }
            }
            System.out.println("Please input 'A' or 'O' or 'F'!");
            System.out.print("Input again: ");
        }
    }
}
