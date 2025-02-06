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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array: ");
        int number = Integer.parseInt(sc.nextLine());
       BubbleSort bubble = new BubbleSort(number);
       bubble.geneRandomArray();
       bubble.showArray();
       bubble.sortValue();
        System.out.println("");
       bubble.showArray();
        
    }
    
    
    
    
    
}
