package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double pi = 3.14159;
        double r;
        double area;
        Scanner askR;


        askR = new Scanner(System.in);
        System.out.println("Enter your circle's radius:");
        r = askR.nextDouble();

        area = pi * r * r;
        System.out.println("Your circle's area is: " + area);



    }
}