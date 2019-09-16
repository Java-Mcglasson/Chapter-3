package assignments;

import java.util.Scanner;

public class PoundsConversion {

    public static void main(String[] args) {
        double userEntry;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of pounds >>> ");
        userEntry = input.nextInt();
        System.out.println("What do you want to convert to Kilos, ");

        poundsToKilos(userEntry);
        poundsToOunces(userEntry);
        poundsToMilligrams(userEntry);
    }
    public static void poundsToKilos(double userEntry){

        double kilos = userEntry * 0.453592;
        System.out.println("You have " + kilos + " kilos in " + userEntry + " pounds.");
    }
    public static void poundsToOunces(double userEntry){

        double ounces = userEntry * 16;
        System.out.println("You have " + ounces + " ounces in " + userEntry + " pounds.");
    }
    public static void poundsToMilligrams(double userEntry){

        double milligrams = userEntry * 453592;
        System.out.println("You have " + milligrams + " milligrams in " + userEntry + " pounds.");
    }
}
