package week3;

import java.util.Random;

public class BubbleSort {

    private int arr[];

    public BubbleSort() {
    }

    public BubbleSort(int n) {
        this.arr = new int[n];
    }

    public void geneRandomArray() {
        Random rd = new Random();
        for (int i = 0; i < this.arr.length - 1; i++) {
            this.arr[i] = rd.nextInt(this.arr.length);
        }
    }

    void showArray() {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    void sortValue() {

        boolean check = false;
        for (int i = 0; i < arr.length - 1&& !check; i++) {
            check = true;
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (this.arr[j] > this.arr[j + 1]) {
                    int temp = this.arr[j];
                    this.arr[j] = this.arr[j + 1];
                    this.arr[j + 1] = temp;
                    check = false;

                }
            }

        }
    }

}
