package fr.ynov.java.medium;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        if (args.length == 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose a number:");
            int number = scanner.nextInt();
            int result = getSquare(number);
            System.out.println("the square of " + number + " is " + result);
        }else{
            int number =  Integer.parseInt(args[0]);
            int result = getSquare(number);
            System.out.println("the square of " + number + " is " + result);
        }
    }

    public static int getSquare(int number) {
        return number  * number;
    }
}
