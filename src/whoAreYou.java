/*
Name: Willyan Aleksander
Date: 23th Feb 2021
Program: whoAreYou.java
 */

import java.util.Scanner;

/**
 *
 * @author Willyan
 */

public class whoAreYou {
    public static void main(String[] args) {
        Scanner inpKeyboard = new Scanner(System.in); 

        System.out.println("Welcome to the Who are You program");

        System.out.println("Can you provide your full name:");
        String name = inpKeyboard.nextLine();

        System.out.println("Your name is " + name);
    }
}
