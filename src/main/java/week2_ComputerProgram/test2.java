package week2_ComputerProgram;

import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ComputerProgram calculate = new ComputerProgram();

        while (true) {
            System.out.println("========= Calculator Program =========");
            System.out.println("1. Normal Calculator");
            System.out.println("2. BMI Calculator");
            System.out.println("3. Exit");
            System.out.println("Please choose one option:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    doCalculate();
                    break;
                case 2:
                    doCalculateBMI();
                    break;

                case 3:
                    System.exit(0);
                default:
                    System.out.println("Please enter from 1 to 3");

            }

        }
    }

    static void doCalculate() {
        Scanner sc = new Scanner(System.in);
        ComputerProgram calculate = new ComputerProgram();
        System.out.printf("Enter number: ");
        double number0 = Double.parseDouble(sc.nextLine());
        double temp = number0;
        while (true) {
            System.out.printf("Enter operator: ");
            String operator =  calculate.inputOperator();
            if ("=".equals(operator)) {
                System.out.println("Result: " + temp);
                return;
            }
            double number;
            if ("/".equals(operator)) {
                System.out.printf("Enter number: ");
                number = calculate.inputDivide();
            } else {
                System.out.printf("Enter number: ");
                number = Double.parseDouble(sc.nextLine());
            }
            temp = calculate.normalCalculate(temp, number, operator);
            System.out.println("Memory: " + temp);
        }
    }

    static void doCalculateBMI() {
        Scanner sc = new Scanner(System.in);
        ComputerProgram calculate = new ComputerProgram();
        System.out.println("Enter Weight(kg): ");
        double weight = Double.parseDouble(sc.nextLine());
        System.out.println("Enter Height(cm): ");
        double height = Double.parseDouble(sc.nextLine());

        double bmi = calculate.calculateBMI(height, weight);
        if (bmi < 19) {
            System.out.println("BMI Number: " + bmi);
            System.out.println("BMI Status: Under-standard");
        } else if (bmi >= 19 && bmi <= 25) {
            System.out.printf("BMI Number: %.2f", bmi);
            System.out.println("\nBMI Status: Standard");
        } else if (bmi > 25 && bmi <= 30) {
            System.out.printf("BMI Number: %.2f", bmi);
            System.out.println("\nBMI Status: Overweight");
        } else if (bmi > 30 && bmi <= 40) {
            System.out.printf("BMI Number: %.2f", bmi);
            System.out.println("\nBMI Status: Fat - should lose weight");
        } else if (bmi > 40) {
            System.out.printf("BMI Number: %.2f", bmi);
            System.out.println("\nBMI Status: Overweight");
        }
    }

}
