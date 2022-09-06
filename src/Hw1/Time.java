package Hw1;
import java.util.Scanner;

public class Time {
    public static int midnight(int h, int m, int s)
            // This is the formula i used to change everything into seconds
    { return ((h * 60 * 60) + (m * 60) + s);

    }
    
    public static void main(String [] args) {
        Scanner kbd = new Scanner(System.in);
// saving variables that the users can enter in their answers
        // this will also print out the questions I am asking
        System.out.print("Enter the hour of the day: ");
        int hour = kbd.nextInt();

        System.out.print("Enter the minute of the day: ");
        int minute = kbd.nextInt();

        System.out.print("Enter the amount of seconds: ");

        int second = kbd.nextInt();
        double line = (midnight(hour, minute, second));
        int remainder = (24 * 60 * 60) - (midnight(hour, minute, second));
        double day = 86400;
// using doubles for some of my variables above allows me to use the math.round while also being able to
        // successfully print out the correct answer
        double x = Math.round((line / day) * 100);

        // 86400 is the ammount of seconds in a full day

        System.out.println("There has been " + line + " seconds since midnight");
        System.out.println("There is " + remainder + " seconds remaining in the day");
        System.out.println( x + "% of the day has passed");








    }
}
