package fr.ynov.java.medium;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String string = input.next();
        String stringReturned = "";
        for (int i = 0; i < string.length(); i++) {
            stringReturned += string.charAt(string.length() - 1 - i);
        }
        if (stringReturned.equals(string)) {
            System.out.println("this is a palindrome");
        }else {
            System.out.println("this is not a palindrome");
        }
    }
}
