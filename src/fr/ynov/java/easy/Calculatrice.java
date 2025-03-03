package fr.ynov.java.easy;

import java.util.Scanner;

public class Calculatrice {
    public  static void main(String[] args){
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an opérator +,-,*,/");
        String operator = scanner.next();
        switch (operator){
            case "+":
                System.out.println(number1 + number2);
                break;
            case  "-":
                System.out.println(number1 - number2);
                break;
            case "*":
                System.out.println(number2 * number1);
                break;
            case "/":
                System.out.println(number1 / number2);
                break;
        }
    }
}
