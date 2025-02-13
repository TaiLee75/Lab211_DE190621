package week2_Matrix;

import java.util.Scanner;


public class Matrix {

    private int row;
    private int column;
    private int matrix[][];

    public Matrix() {
    }

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        this.matrix = new int[row][column];
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setValueMatrix(int row, int column, int value) {
        this.matrix[row][column] = value;
    }

    public int getValueMatrix(int row, int column) {
        return this.matrix[row][column];
    }

    public Matrix addMatrix(Matrix matrix2) {
        if (this.row != matrix2.getRow() || this.column != matrix2.getColumn()) {
            return null;
        }

        Matrix addMatrix = new Matrix(this.row, this.column);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                addMatrix.setValueMatrix(i, j, this.getValueMatrix(i, j) + matrix2.getValueMatrix(i, j));
            }
        }
        return addMatrix;

    }

    public Matrix subtractMatrix(Matrix matrix2) {
        if (this.row != matrix2.getRow() || this.column != matrix2.getColumn()) {
            return null;
        }

        Matrix subMatrix = new Matrix(this.row, this.column);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                subMatrix.setValueMatrix(i, j, this.getValueMatrix(i, j) - matrix2.getValueMatrix(i, j));
            }
        }
        return subMatrix;

    }

    public Matrix multiMatrix(Matrix matrix2) {
        if (this.column != matrix2.getRow()) {
            return null;
        }
        Matrix mulMatrix = new Matrix(this.row, matrix2.column);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < matrix2.getColumn(); j++) {
                int sum = 0;
                for (int k = 0; k < this.column; k++) {
                    sum += this.getValueMatrix(i, k) * matrix2.getValueMatrix(k, j);
                }
                mulMatrix.setValueMatrix(i, j, sum);
            }
        }
        return mulMatrix;
    }

    public void displayMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
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

    public int inputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(inputString());
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Input must be an integer");
                System.out.printf("Please input again: ");
            }
        }

    }

    public int inputPositiveInt() {
        while (true) {
            try {
                int result = Integer.parseInt(inputString());
                if (result > 0) {
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
    
    public int inputChoiceInt() {
        while (true) {
            try {
                int result = Integer.parseInt(inputString());
                if (result > 0 && result < 5) {
                    return result;
                } else {
                    System.out.println("Input must be between 1 and 4");
                    System.out.printf("Please input again: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input must be an integer");
                System.out.printf("Please input again: ");
            }
        }

    }

}
