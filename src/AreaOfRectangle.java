/*
Name: Willyan Aleksander
Date: 23th Feb 2021
Program: AreaOfRectangle.java
 */

/**
 *
 * @author Willyan
 */

public class AreaOfRectangle {
    public static void main(String[] args) {
        int length = 10;
        int width = 8;
        String unit = "feet";

        System.out.println("Welcome to the Rectangle Area Calculator");
        
        System.out.println("The area of a " + length + "x" + width + " rectangle is: " + (length*width) + unit + "^2");
    }
}
