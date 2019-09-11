package assignments;

import java.util.Scanner;

public class MetricConversion {

    public static void main(String[] args){

        int numLiters, numCent, numInches = 0, numGallons = 0;
        final int NUM_LITERS_IN_GALLON;
        final int NUM_CENT_TO_INCHES;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Number of liters you have >>>");
        numLiters = keyboard.nextInt();

        convertLitersToGallons(numLiters, numGallons);

        System.out.println("Now Enter how many Centimeters you have >>>");
        numCent = keyboard.nextInt();

        convertCentsToInches(numCent, numInches);
    }

    public static void convertLitersToGallons(int numLiters, int numGallons){
        

        numGallons = (int) (numLiters * 0.264);
        
        System.out.println("You have " + numGallons + ".");

    }
    
    public static void convertCentsToInches(int numCent, int numInches){

        numInches = (int) (numCent * 0.264);

        System.out.println("You have " + numInches + ".");
        
    }

}
