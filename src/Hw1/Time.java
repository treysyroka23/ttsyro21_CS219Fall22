package Hw1;
import java.util.Scanner;

public class Time {
    public static int midnight(int h, int m, int s)
    { return ((h * 60 * 60) + (m * 60) + s);

    }






    public static void main(String [] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter the hour of the day: ");
        int hour = kbd.nextInt();

        System.out.print("Enter the minute of the day: ");
        int minute = kbd.nextInt();

        System.out.print("Enter the amount of seconds: ");

        int second = kbd.nextInt();
        double line = (midnight(hour, minute, second));
        int remainder = (24 * 60 * 60) - (midnight(hour, minute, second));
        double day = 86400;

        double x = Math.round((line / day) * 100);

        // 86400 is the ammount of seconds in a full day

        System.out.println("There has been " + line + " seconds since midnight");
        System.out.println("There is " + remainder + " seconds remaining in the day");
        System.out.println( x + "% of the day has passed");








    }
}
