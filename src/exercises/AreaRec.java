package exercises;

import java.util.Scanner;

public class AreaRec {
    public static void main(String[] args) {
        int length;
        int width;
        int area;
        Scanner askLen;
        Scanner askWid;

        askLen = new Scanner(System.in);
        System.out.println("What is the length?");
        length = askLen.nextInt();

        askWid = new Scanner(System.in);
        System.out.println("What is the width?");
        width = askWid.nextInt();

        area = length * width;
        System.out.println("The area of your rectangle is: " + area);
    }
}
