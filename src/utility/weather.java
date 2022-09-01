package utility;

import java.util.Scanner;

public class weather {

    public static double windchill(double t, //temperature
                                   double v) { //velocity in mph
        return 35.74 + .6215 * t + (.4275*t - 35.75) *Math.pow(v, .16);
    }
    public static void main(String [] args) {
        Scanner kbd = new Scanner(System.in);
        // used for getting input from the keyboard
        System.out.print("enter temperature in degrees F: ");
        double temperature = kbd.nextDouble();
        System.out.print("enter wind velocity in mph: ");
        double velocity = kbd.nextDouble();

        System.out.printf("The windchill for %.2f degrees \n at %.2f mph is %.2f\n",
                temperature, velocity, windchill(temperature, velocity));

        System.out.println("They said \"Don't do it\"");
    }
}
