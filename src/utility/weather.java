package utility;

import java.util.Scanner;

public class weather {

    public static double windchill(double t, //temperature
                                   double v) { //velocity in mph
        return 35.74 + .6215 * t + (.4275*t - 35.75) *Math.pow(v, .16);
    }

    public static double getVelocity(Scanner s) {
        boolean valid = false;
        double velocity = 0;
        while (!valid) {
            System.out.print("Enter wind velocity in MPH: ");
            if (s.hasNextDouble()) {
                velocity = s.nextDouble();
                if (velocity < 0) {
                    System.out.printf("Error: velocity cannot be negative. you entered %.2f\n", velocity);
                }
                else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter a decimal number. You entered \"%s\"",
                        s.next());

            }
        } // while
        return velocity;
    }

    public static double getTemperature(Scanner s) {
        double temperature = 0;
        boolean temp = false;
        while (!temp) {
            System.out.print("Enter temperature in degrees F: ");

            // Make sure the user entered a number
            if (s.hasNextDouble()) {
                temperature = s.nextDouble();
                temp = true;

            } else {
                System.out.printf("Error: please enter a decimal number. You entered %.2f\n", temperature);
            }
        }
            return temperature;
        }

    public static void main(String [] args) {
        // Used for getting input from the keyboard
        Scanner kbd = new Scanner(System.in);

        double temperature = getTemperature(kbd);

        double velocity = getVelocity(kbd);


        System.out.printf("The windchill for %.1f degrees at %.1f MPH is %.2f\n",
                temperature, velocity, windchill(temperature, velocity));
        }

    }

