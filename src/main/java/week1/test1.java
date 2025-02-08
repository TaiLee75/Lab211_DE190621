package week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test1 {

    // LinearSearch
    
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of array: ");
        int na = sc.nextInt();
        System.out.println("Enter search value: ");
        int sv = sc.nextInt();
        
     Linear_Search linearSearch = new Linear_Search(na);
        linearSearch.geneRandomArray();
        linearSearch.showArray();
      
        int index = linearSearch.searchValue(sv);
        if(index != -1){
            System.out.println("\nFound " + sv + " at index: " + index);
        }else{
            System.out.println("Value not found!");
        }
    }
        
        
    // Count Word and Character
    /*
    public static void main(String[] args) {
        String input = "Hello the beautiful World";
         CountWC count = new CountWC(input);
         
         System.out.println(count.countWord());
         System.out.println(count.countCharacter());
        
    }
     */
    //Equation
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Equation valid = new Equation();
//
//        System.out.println("========= Equation Program =========");
//        System.out.println("1. Calculate Superlative Equation");
//        System.out.println("2. Calculate Quadratic Equation");
//        System.out.println("3. Exit");
//        System.out.println("Please choose one option:");
//        int choice = valid.inputRangeInt();
//        switch (choice) {
//            case 1: {
//                System.out.printf("Enter A: ");
//                float a = valid.inputFloat();
//                System.out.printf("Enter B: ");
//                float b = valid.inputFloat();
//
//                Equation root = new Equation(a, b);
//                System.out.printf("Solution: x =");
//                System.out.println(root.calculateEquation(a, b).toString());
//                root.checkRoots(a, b);
//                break;
//            }
//            case 2: {
//                System.out.printf("Enter A: ");
//                float a = valid.inputFloat();
//                System.out.printf("Enter B: ");
//                float b = valid.inputFloat();
//                System.out.printf("Enter C: ");
//                float c = valid.inputFloat();
//                Equation root = new Equation(a, b, c);
//                List<Float> roots = new ArrayList<>();
//                roots = root.calculateQuadraticEquation(a, b, c);
//                if (roots == null) {
//                    System.out.println("This equation has no solutions!");
//                } else if (roots.isEmpty()) {
//                    System.out.println("This equation has infinitely solutions!");
//                } else {
//                    int i = 1;
//                    for (float x : roots) {
//                        System.out.printf("Solution: ");
//                        System.out.printf(" x" + i + " = " + x + "   ");
//                        i++;
//                    }
//                }
//                System.out.println("\n");
//                root.checkRoots(a, b, c);
//                break;
//            }
//            case 3: {
//                return;
//            }
//        }
//
//    }
    
    //Change base number system
    /*
    public static int Menu2() {
        ChangeNumberSystem valid = new ChangeNumberSystem();
        System.out.println("========= Choose The Base Output Number =========");
        System.out.println("1. Binary");
        System.out.println("2. Decimal");
        System.out.println("3. Hexadecimal");
        System.out.println("4. Exit the program");
        System.out.println("Please choose one option:");
        return valid.inputRangeInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChangeNumberSystem change = new ChangeNumberSystem();

        System.out.println("========= Choose The Base Input Number =========");
        System.out.println("1. Binary");
        System.out.println("2. Decimal");
        System.out.println("3. Hexadecimal");
        System.out.println("4. Exit the program");
        System.out.println("Please choose one option:");
        int choice1 = change.inputRangeInt();
        switch (choice1) {
            case 1 -> {
                int choice2 = Menu2();
                switch (choice2) {
                    case 1 -> {
                        System.out.printf("Enter the binary value: ");
                        int binary1 = sc.nextInt();
                        System.out.println("The binary after changed from the binary is: " + binary1);
                    }
                    case 2 -> {
                        System.out.printf("Enter the binary value: ");
                        int binary2 = sc.nextInt();
                        change.BinaryToInt(binary2);
                    }
                    case 3 -> {
                    }
                    case 4 -> {
                        return;
                    }
                }
            }
            case 2 -> {
                int choice2 = Menu2();
                switch (choice2) {
                    case 1:
                        System.out.printf("Enter the integer value: ");
                        int integer1 = sc.nextInt();
                        change.intToBinary(integer1);
                        break;
                    case 2:
                        System.out.printf("Enter the integer value: ");
                        int integer2 = sc.nextInt();
                        System.out.println("The integer after changed from the integer is: " + integer2);
                        break;
                    case 3:
                        System.out.printf("Enter the integer value: ");
                        int integer3 = sc.nextInt();
                        change.intToHexa(integer3);
                        break;
                    case 4:
                        return;
                }

            }
            case 3 -> {
             int choice3 = Menu2();
             switch(choice3){
                 
             }
            }

        }
    }
*/
}
