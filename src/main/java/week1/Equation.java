package week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Equation {

    private float a;
    private float b;
    private float c;

    public Equation() {
    }

    public Equation(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Equation(float a, float b) {
        this.a = a;
        this.b = b;
    }

    List<Float> calculateEquation(float a, float b) {
        List<Float> roots = new ArrayList<>();
        if (a == 0) {
            return null;
        }
        if (b == 0) {
            roots.add(0f);
            return roots;
        }
        roots.add(-b / a);
        return roots;
    }

    List<Float> calculateQuadraticEquation(float a, float b, float c) {
        List<Float> roots = new ArrayList<>();

        if (a == 0) {
            if (b != 0) {
                roots.add(-c / b);
            }
            return roots;
        }
        if (a == 0 && b == 0 & c == 0) {
            return roots;
        }

        double delta = b * b - 4 * a * c;

        if (delta > 0) {

            float root1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            float root2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
            roots.add(root1);
            roots.add(root2);
        } else if (delta == 0) {
            float root = -b / (2 * a);
            roots.add(root);
            roots.add(root);
            return roots;
        } else if (delta < 0) {
            return null;
        }

        return roots;

    }

    public boolean isEven(float a) {
        return a % 2 == 0;
    }

    public boolean isOdd(float a) {
        return a % 2 != 0;
    }

    public boolean isPerfectSquare(float a) {
        return Math.sqrt(a) * Math.sqrt(a) == a;
    }

    public void checkRoots(float... roots) {
        List<Float> oddNumbers = new ArrayList<>();
        List<Float> evenNumbers = new ArrayList<>();
        List<Float> perfectSquares = new ArrayList<>();

        for (float root : roots) {
            if (isOdd(root)) {
                oddNumbers.add(root);
            }
            else{
                evenNumbers.add(root);
            }
            if (isPerfectSquare(root)) {
                perfectSquares.add(root);
            }
        }

        if (!oddNumbers.isEmpty()) {
            System.out.print("Number is Odd:");
            for (float num : oddNumbers) {
                System.out.printf("%.1f, ", num);
            }
            System.out.println();
        }

        if (!evenNumbers.isEmpty()) {
            System.out.print("Number is Even:");
            for (float num : evenNumbers) {
                System.out.printf("%.1f, ", num);
            }
            System.out.println();
        }

        if (!perfectSquares.isEmpty()) {
            System.out.print("Number is Perfect Square:");
            for (float num : perfectSquares) {
                System.out.printf("%.1f, ", num);
            }
            System.out.println();
        }
    }

    
    
    
    
    
  //Validation  
    public  int inputRangeInt() {
        while (true) {
            try {
                int result = Integer.parseInt(inputString());
                if (result > 0 && result <4) {
                    return result;
                } else {
                    System.out.println("Input integer from 1 to 3!");
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
    
    
    public  float inputFloat() {
        while (true) {
            try {
                float result = Float.parseFloat(inputString());
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Input must be an float");
                System.out.printf("Please input again: ");
            }
        }

    }
}
