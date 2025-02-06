package week1;

import java.util.Scanner;
import java.util.Stack;

public class ChangeNumberSystem {

    private int number;

    public ChangeNumberSystem() {
    }

    public ChangeNumberSystem(int number) {
        this.number = number;
    }

    public void intToBinary(int number) {
        Stack<String> binary = new Stack<>();
        while (number > 0) {
            int temp = number % 2;
            binary.add(temp + "");
            number /= 2;
        }
        System.out.printf("The binary after changed from the integer is: ");
        int n = binary.size();
        for (int i = 0; i < n; i++) {
            System.out.printf(binary.pop());
        }
    }

    public void intToHexa(int number) {
        Stack<String> hexa = new Stack<>();
        while (number > 0) {
            int temp = number % 16;
            switch (temp) {
                case 10:
                    hexa.add("A");
                    break;
                case 11:
                    hexa.add("B");
                    break;
                case 12:
                    hexa.add("C");
                    break;
                case 13:
                    hexa.add("D");
                    break;
                case 14:
                    hexa.add("E");
                    break;
                case 15:
                    hexa.add("F");
                    break;
                default:
                    hexa.add(temp+"");  
                    break;
            }
            number /= 16;
        }
        System.out.printf("The hexadecimal after changed from the integer is: ");
        int n = hexa.size();
        for (int i = 0; i < n; i++) {
            System.out.printf(hexa.pop());
        }
}
    
    public void BinaryToInt(int number){
        String size = Integer.toString(number);
        int binary = 0;
        for(int i = 0; i<size.length(); i++){
            binary += (int) Math.pow(2, i)*(number%10) ;
            number /= 10;
        }
                
        System.out.println("The integer after changed from the binary is: "+ binary);
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  // Validation
    
    public  int inputRangeInt() {
        while (true) {
            try {
                int result = Integer.parseInt(inputString());
                if (result > 0 && result <5) {
                    return result;
                } else {
                    System.out.println("Input integer from 1 to 4!");
                    System.out.printf("Please input again: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input must be an integer");
                System.out.printf("Please input again: ");
            }
        }

    }
    
public  String inputString() {
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
