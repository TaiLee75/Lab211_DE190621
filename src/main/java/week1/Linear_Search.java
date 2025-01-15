package week1;

import java.util.Random;
import java.util.Scanner;

public class Linear_Search {
     private int arr[];

    public Linear_Search() {
    }


     
     
    public Linear_Search(int n) {
       this.arr = new int[n];
    }

   
     
     
    
    
    public void geneRandomArray() {
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(arr.length);
        }
    } 
       

    void showArray(){
        System.out.printf("The array: [");
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length - 1){
                System.out.printf(arr[i]+"");
                break;
            }
            System.out.printf(arr[i] + ",");
        }
        System.out.printf("]");
    }
    
    
    public int searchValue(int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
               return i;
            }
        }
        return -1;
    }
    
    
    
    
    
    
    
}
