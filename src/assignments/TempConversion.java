package assignments;

import java.util.Scanner;

public class TempConversion {

            public static void main(String[] args) {
                float temperature;
                Scanner in = new Scanner(System.in);

                System.out.println("Enter temperature in Fahrenheit");
                temperature = in.nextInt();

                temperature = ((temperature - 32)*5)/9;

                System.out.println("temperature in Celsius = " + temperature);

                if (temperature <= 32) {
                    System.out.println("It is freezing out side");
                }
                if (temperature >= 100) {
                    System.out.println("It is very hot out side");
                }
            }
        }




