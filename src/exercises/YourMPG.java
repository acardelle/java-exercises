package exercises;

import java.util.Scanner;

public class YourMPG {
    public static void main(String[] args) {
        int milesDriven;
        int gallonsUsed;
        int mPG;
        Scanner askMiles;
        Scanner askGalls;

        askMiles = new Scanner(System.in);
        System.out.println("How many miles have been driven?");
        milesDriven = askMiles.nextInt();

        askGalls = new Scanner(System.in);
        System.out.println("How many gallons have been consumed?");
        gallonsUsed = askGalls.nextInt();

        mPG = milesDriven / gallonsUsed;
        System.out.println("Your current MPG is: " + mPG);
    }
}
