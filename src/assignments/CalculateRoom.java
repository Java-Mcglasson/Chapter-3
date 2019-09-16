package assignments;

import java.util.Scanner;

public class CalculateRoom {

    public static void main(String[] args){
        double wallHeight;
        double wallWidth;
        double wallLength;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the wall width >>>");
        wallWidth = input.nextInt();
        System.out.println("Enter the wall height >>>");
        wallHeight = input.nextInt();
        System.out.println("Enter the wall length >>>");
        wallLength = input.nextInt();
        wallArea(wallWidth, wallLength, wallHeight);

    }
    public static void wallArea(double wallWidth, double wallLength, double wallHeight){
        int WALL_AREA = (int) ((wallWidth * wallHeight) * 2 + (wallHeight * wallLength) * 2);
        System.out.println("Your wall area is " + WALL_AREA + ".");
        numGallons(WALL_AREA);
    }
    public static void numGallons(int WALL_AREA){

        int totalGallons = WALL_AREA /350;
        priceTotalGallon(totalGallons, WALL_AREA);
        System.out.println("           " + totalGallons);
    }
    public static void priceTotalGallon(int totalGallons, int WALL_AREA){

        int costPerGallon = 32;
        int total = costPerGallon * totalGallons;
        System.out.println("The total Price of paint is $" + total + " for " + WALL_AREA + " square footage.");

    }

}
