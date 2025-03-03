package fr.ynov.java.easy;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your number?");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println("Your number is even");
        }else {
            System.out.println("Your number is odd");
        }
    }
}
