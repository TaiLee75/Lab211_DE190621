package week2_ComputerProgram;

import java.util.Scanner;

public class ComputerProgram {

    private double weight, height;
    private double num1, num2;
    private String operator;

    public ComputerProgram() {
    }

    public ComputerProgram(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    public ComputerProgram(double num1, double num2, String operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double normalCalculate(double num1, double num2, String operator) {
        Operator op = Operator.getOp(operator);

        if (op == null) {
            throw new IllegalArgumentException("illegal operator: " + operator);
        }

        switch (op) {
            case ADD -> {
                return num1 + num2;
            }
            case SUBTRACT -> {
                return num1 - num2;
            }
            case MULTIPLY -> {
                return num1 * num2;
            }
            case DIVIDE -> {
                if (num2 == 0) {
                    throw new ArithmeticException();
                }
                return num1 / num2;
            }
            case EXPONENT -> {
                return Math.pow(num1, num2);
            }
            default ->
                throw new IllegalStateException("Toán tử không được hỗ trợ: " + op);
        }
    }

    public double calculateBMI(double height, double weight) {
        return weight * 10000 / (height * height);
    }

    //Validation
    public String inputString() {
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

    public double inputDivide() {
        while (true) {

            double number = Double.parseDouble(inputString());
            if (number != 0) {
                return number;
            } else {
                System.out.println("cannot divide by 0!");
                System.out.println("Please input again: ");
            }
        }

    }

    public String inputOperator() {
        while (true) {
            String operator = inputString();
            if (operator.matches("[+\\-*/^=]")) {
                return operator;
            } else {
                System.out.println("invalid operator!");
                System.out.printf("Please input operator again: ");
            }

        }
    }
}
