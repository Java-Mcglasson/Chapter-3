package examples;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int userEntry1;
        int userEntry2;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number >>> ");
        userEntry1 = input.nextInt();

        System.out.println("Enter a number >>> ");
        userEntry2 = input.nextInt();
        calculateAddition(userEntry1, userEntry2);
        calculateSub(userEntry1, userEntry2);
        calculateMultiply(userEntry1, userEntry2);
        calculateDivide(userEntry1, userEntry2);
        calculateModlus(userEntry1, userEntry2);
    }

    public static void calculateAddition(int num1, int num2) {

        int total = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + total);
    }

    public static void calculateSub(int num1, int num2) {

        int total = num1 - num2;

        System.out.println(num1 + " - " + num2 + " = " + total);
    }

    public static void calculateMultiply(int num1, int num2) {

        int total = num1 * num2;

        System.out.println(num1 + " * " + num2 + " = " + total);
    }

    public static void calculateDivide(int num1, int num2) {

        int total = num1 / num2;

        System.out.println(num1 + " / " + num2 + " = " + total);
    }

    public static void calculateModlus(int num1, int num2) {

        int total = num1 % num2;

        System.out.println(num1 + " % " + num2 + " = " + total);
    }
}
