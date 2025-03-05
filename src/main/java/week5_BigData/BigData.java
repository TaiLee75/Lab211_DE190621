/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_BigData;

import java.math.BigInteger;
import java.util.Scanner;


/**
 *
 * @author ADMIN
 */
public class BigData {

    private String a, b;

    public BigData() {
    }

    public BigData(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String add(){
        StringBuilder result = new StringBuilder();
        int rememberValue = 0;
       
        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();

        int maxLen = Math.max(a.length(), b.length());
        for (int i = 0; i < maxLen; i++) {
            int sum = rememberValue;
            if (i < a.length()) sum += a.charAt(i) - '0';
            if (i < b.length()) sum += b.charAt(i) - '0';

            result.append(sum % 10);
            rememberValue = sum / 10;
        }
        if (rememberValue > 0) result.append(rememberValue);

        return result.reverse().toString();
        
        
}
    
    public void checkAdd(String check, String int1,String int2){
        BigInteger num1 =  new BigInteger(int1);
        BigInteger num2 = new BigInteger(int2);
        BigInteger result = new BigInteger(check);
        if(result == num1.add(num2)){
            System.out.println("Right");
        }else{
            System.out.println("Wrong");
        }
        
    
        
        
        
    }
    
    
    
    
    
    
    
    
    //Validation
     public String inputString() {
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
    
     
     
     public int inputPositiveInt() {
        while (true) {
            try {
                int result = Integer.parseInt(inputString());
                if (result  >= 0) {
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
