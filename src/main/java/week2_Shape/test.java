package week2_Shape;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====Calculator Shape Program=====");
        System.out.println("Please input side width of Rectangle:");
        double width = inputDouble();
        System.out.println("Please input length of Rectangle:");
        double length =  inputDouble();
        System.out.println("Please input radius of Circle:");
        double radius =  inputDouble();
        System.out.println("Please input side A of Triangle:");
        double sideA =  inputDouble();
        System.out.println("Please input side B of Triangle:");
        double sideB = inputDouble();
        System.out.println("Please input side C of Triangle:");
        double sideC =  inputDouble();

        Shape rectangle = new Rectangle(width, length);
        Shape circle = new Circle(radius);
        Shape triangle = new Triangle(sideA, sideB, sideC);
        rectangle.printResult();
        circle.printResult();
        triangle.printResult();
    }

    //Validation
    public static String inputString() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String result = sc.nextLine();
            if (!result.isEmpty()) {
                return result;
            } else {
                System.out.println("Input must not be empty");
                System.out.printf("Please input again: ");
            }
        }
    }

    public static double inputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(inputString());
                if (result >= 0) {
                    return result;
                } else {
                    System.out.println("Input must be positive");
                    System.out.printf("Please input again: ");
                }

            } catch (NumberFormatException e) {
                System.out.println("Input must be a double");
                System.out.printf("Please input again: ");
            }
        }

    }

}
