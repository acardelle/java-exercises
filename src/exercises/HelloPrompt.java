package exercises;

import java.util.Scanner;

public class HelloPrompt {
    public static void main(String[] args) {
        String firstName;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What is your name?");
        firstName = in.next();

        System.out.println("Hello " + firstName);
    }
}
