/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2_Shape;

/**
 *
 * @author ADMIN
 */
public class Triangle extends Shape {

    private double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
   }

    @Override
    public double getArea() {
      double temp = getPerimeter();
        return Math.sqrt(temp*(temp-sideA)*(temp-sideB)*(temp-sideC));
   }
     
    @Override
    public void printResult(){
        System.out.println("-----Triangle-----");
        System.out.println("Side A: "+ sideA);
        System.out.println("Side B: "+ sideB);
        System.out.println("Side C: "+ sideC);
        System.out.println("Area: "+getArea());
        System.out.println("Perimeter: "+getPerimeter());
    }
    
    
}
