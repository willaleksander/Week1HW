/*
Name: Willyan Aleksander
Date: 23th Feb 2021
Program: AgeConverter.java
 */

import java.util.Scanner;

/**
 *
 * @author Willyan
 */

public class AgeConverter {
    public static void main(String[] args) {
        Scanner inpKeyboard = new Scanner(System.in); 

        System.out.println("Welcome to the Age Converter");

        System.out.println("Can you provide your age:");
        int age = inpKeyboard.nextInt();

        System.out.println("Age in years: " + age);
        System.out.println("Converted age into months: " + age*12);
        System.out.println("Converted age into weeks: " + age*52);
        System.out.println("Converted age into days: " + (age*365+age/4));
    }
}
