/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class test_week3 {

    //Bubble Sort
   
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of array: ");
//        int number = Validation.inputIntGreaterThanTwo();
//        BubbleSort bubble = new BubbleSort(number);
//        bubble.geneRandomArray();
//        bubble.showArray();
//        bubble.sortValue();
//        System.out.println("");
//        bubble.showArray();
//
//    }
 
    
    
    
    //Stack
    /*
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(5);
        stack.push(6);
        stack.push(3);
        stack.push(9);
        stack.traverse();
        System.out.println("");
        System.out.println("The pop value is: " +stack.pop().data);
        stack.traverse();
        System.out.println("");
        System.out.println("The get value is: "+stack.get().data);
        stack.traverse();
      
     
    }
  
    */
    
    
    
    
    //Binary Search
//    public static void main(String[] args) {
//        System.out.println("Enter number of array: ");
//        int number = Validation.inputIntGreaterThanTwo();
//        System.out.println("Enter search value: ");
//        int value = Validation.inputPositiveInt();
//        BinarySearch binary = new BinarySearch(number);
//        binary.geneRandomArray();
//        binary.sortValue();
//        binary.showArray();
//        System.out.println("");
//        int index = binary.searchValue(value);
//        if(index != -1){
//             System.out.println("\nFound " + value + " at index: " + index);
//        }else{
//             System.out.println("Value not found!");
//        }
//  }
    
    //Quick Sort
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of array: ");
        int number = Validation.inputIntGreaterThanTwo();
        QuickSort quick = new QuickSort(number);
        quick.geneRandomArray();
        quick.showArray();
        
        System.out.println("");
        quick.sortValue();
        quick.showArray();
    }
}
