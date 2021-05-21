/*
Name: Willyan Aleksander
Date: 23th Feb 2021
Program: Calculator.java
 */

import java.util.Scanner;

/**
 *
 * @author Willyan
 */

public class Calculator {
     public static void main(String[] args) {
        Scanner inpKeyboard = new Scanner(System.in); 

        System.out.println("Welcome to the Calculator");

        System.out.println("Can you provide two numbers to be calculated?");
        System.out.println("First number: ");
        double num1 = inpKeyboard.nextDouble();
        System.out.println("Second number: ");
        double num2 = inpKeyboard.nextDouble();
        
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1+num2));
        System.out.println("The substraction of " + num1 + " and " + num2 + " is " + (num1-num2));
        System.out.println("The multiplication of " + num1 + " and " + num2 + " is " + (num1*num2));
        System.out.println("The division of " + num1 + " and " + num2 + " is " + (num1/num2));
        
    }
}
