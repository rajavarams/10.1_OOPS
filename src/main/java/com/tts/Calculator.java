package com.tts;

public class Calculator {
 public double add(double num1, double num2){
     return num1+num2;
 }
 public double subtract(double num1, double num2){
     return num1-num2;
 }
 public double multiplication(double num1, double num2){
     return num1*num2;
 }
 public double divison(double num1, double num2){
     return num1/num2;
 }
 public double square(double num1){
     return num1*num1;
 }

}

class MagicCalculator extends Calculator {
    public double squareRoot(double num1) {
        return Math.sqrt(num1);
    }

    public double sin(double num1) {
        return Math.sin(num1);
    }

    public double cosine(double num1) {
        return Math.cos(num1);
    }

    public double tangent(double num1) {
        return Math.tan(num1);
    }

    public double factorial(double num1) {
        if (num1 < 2) {
            return num1;
        }
        return num1 * factorial(num1 - 1);
    }


    public static void main(String[] args) {
        MagicCalculator myCal = new MagicCalculator();
        System.out.println();
        System.out.println("The square root of 16 is " + myCal.squareRoot(16));
        System.out.println("The factorial of 4 is " + myCal.factorial(4));
        System.out.println("The product of 20 & 40 is " + myCal.multiplication(20, 40));
        System.out.println("The sine for 0.4 is " + myCal.sin(0.4));
    }
}
