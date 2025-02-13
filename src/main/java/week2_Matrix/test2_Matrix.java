package week2_Matrix;

public class test2_Matrix {

    public static void main(String[] args) {
        Matrix check = new Matrix();
        int choice = 0;
        while (choice != 4) {

            System.out.println("=====MATRIX OPERATION=====");
            System.out.println("1. Addition of matrices");
            System.out.println("2. Subtraction of matrices");
            System.out.println("3. Multiplication of matrices");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            choice = check.inputChoiceInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("=====SUBTRACTION========");
                    Matrix matrix1 = new Matrix();
                    System.out.println("Enter value for matrix 1: ");
                    matrix1 = inputValue();

                    Matrix matrix2 = new Matrix();
                    System.out.println("Enter value for matrix 2: ");
                    matrix2 = inputValue();

                    Matrix result = matrix1.addMatrix(matrix2);
                    if (result != null) {
                        System.out.println("Result: ");
                        result.displayMatrix();
                    } else {
                        System.out.println("Invalid form of 2 matrix.");
                    }
                    break;
                }
                case 2 -> {
                    System.out.println("=====SUBTRACTION========");
                    Matrix matrix1 = new Matrix();
                    System.out.println("Enter value for matrix 1: ");
                    matrix1 = inputValue();

                    Matrix matrix2 = new Matrix();
                    System.out.println("Enter value for matrix 2: ");
                    matrix2 = inputValue();

                    Matrix result = matrix1.subtractMatrix(matrix2);
                    if (result != null) {
                        System.out.println("Result: ");
                        result.displayMatrix();
                    } else {
                        System.out.println("Invalid form of 2 matrix.");
                    }
                    break;
                }
                case 3 -> {
                    System.out.println("=====MULTIPLICATION========");
                    Matrix matrix1 = new Matrix();
                    System.out.println("Enter value for matrix 1: ");
                    matrix1 = inputValue();

                    Matrix matrix2 = new Matrix();
                    System.out.println("Enter value for matrix 2: ");
                    matrix2 = inputValue();

                    Matrix result = matrix1.multiMatrix(matrix2);
                    if (result != null) {
                        System.out.println("Result: ");
                        result.displayMatrix();
                    } else {
                        System.out.println("Invalid form of 2 matrix.");
                    }
                    break;
                }
            }

        }
    }

    public static Matrix inputValue() {
        Matrix check = new Matrix();
        System.out.print("row: ");
        int row = check.inputPositiveInt();
        System.out.print("column: ");
        int column = check.inputPositiveInt();
        Matrix matrix = new Matrix(row, column);
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < column ; j++) {
                System.out.print("a[" + i + "][" + j + "]: ");
                int value = check.inputInt();
                matrix.setValueMatrix(i, j, value);
            }
        }
        matrix.displayMatrix();
        System.out.println("");

        return matrix;
    }

}
