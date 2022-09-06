package HW2;

import java.util.Scanner;

public class DayOfWeek {

// This is the program that holds all my variables/equations
    public static int Date(int d, int m, int y) {
        // use integers so I don't get decimals
        int yy = y - (14 - m) / 12;
        int x = yy + (yy / 4) - (yy / 100) + (yy / 400);

        int mm = m + 12 * ((14-m) / 12) - 2;





// this takes all my variables and plus them into the final equation and returns the numbers
        return (d + x + (31 * mm) / 12)%7;
    }
// main program
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

// all these prints allow the us to request the information from the user
        System.out.print("Enter the day as an integer: ");

        int day = kbd.nextInt();


        System.out.print("Enter the month as an integer: ");
        int month = kbd.nextInt();

        System.out.print("Enter the year as an integer: ");
        int year = kbd.nextInt();
//this print give us the final answer of the 0-6 to determine the day
        System.out.println(Date(day, month, year));




    }
}



