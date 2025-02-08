package week3;

import java.util.Random;

public class BinarySearch {

    private int arr[];

    public BinarySearch(int n) {
        this.arr = new int[n];
    }

    public BinarySearch() {
    }

    public void geneRandomArray() {
        Random rd = new Random();
        for (int i = 0; i < this.arr.length - 1 ; i++) {
            this.arr[i] = rd.nextInt(this.arr.length);
        }
    }

    void showArray() {
        for (int i = 0; i < this.arr.length ; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    void sortValue() {

        boolean check = false;
        for (int i = 0; i < arr.length - 1 && !check; i++) {
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

    public int Binary(int value, int left, int right) {
       while(left < right){
        int mid = (left + right) / 2;
        if (value == this.arr[mid]) {
            return mid;
        } else if (value < this.arr[mid]) {
            return Binary(value, mid + 1, right);
        } else if (value > this.arr[mid]) {
            return Binary(value, left, mid - 1);
        }
       }
        return -1;
    }

    public int searchValue(int value){
        int right = this.arr.length;
        int left = 0;
        int result = Binary(value, left, right);
        return result;
    }
    
}
