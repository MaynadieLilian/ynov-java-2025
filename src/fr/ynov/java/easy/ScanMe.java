package fr.ynov.java.easy;

import java.util.Scanner;

public class ScanMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("How old are you ?");
        int age = scanner2.nextInt();
        System.out.println("Your name is " +name+ " and you have "+age+" years old");
    }
}
