
package week3;

import java.util.Random;


public class QuickSort {
    private int arr[];

    public QuickSort() {
    }

    public QuickSort(int n) {
        this.arr = new int[n];
    }
    
    
     public void geneRandomArray() {
        Random rd = new Random();
        for (int i = 0; i < this.arr.length - 1; i++) {
            this.arr[i] = rd.nextInt(this.arr.length);
        }
    }

    void showArray() {
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
    
    void swapValue(int i, int j){
        int temp = this.arr[i];
        this.arr[i] = this.arr[j];
        this.arr[j] = temp;
    }
    
   public int partition(int left, int right){
       int mid = (left + right) / 2;
       int pivot = arr[mid];
       swapValue(mid, right);
       
       int i = left - 1;
       for(int j = left; j < right; j++){
           if(arr[j]<pivot){
               i++;
               swapValue(i, j);
           }
       }
       swapValue(i+1, right);
       return i+1;
   }
   public void quickSort(int left,int right){
       if(left < right){
           int pivotIndex = partition(left, right);
           quickSort(left, pivotIndex - 1);
           quickSort(pivotIndex + 1, right);
       }
   } 
   
   public void sortValue(){
       int left = 0;
       int right = arr.length;
       
       quickSort(left, right-1);
   }
   
}
