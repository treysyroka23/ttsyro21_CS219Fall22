package Hw4;

import java.util.Scanner;

public class Investment {

    public static double investment(double c, double r, int t, int n) {

        return c * Math.pow(1 + r / n, t * n);
    }





    public static void main(String[] args) {

        // establish my scanner system
        Scanner kbd = new Scanner(System.in);
        // ask user for input
        System.out.println("Please enter an initial deposit as a decimal: ");
// saves user input
        double deposit = kbd.nextDouble();


// this is my while loop for when they enter the deposit number
        while (deposit < 0) {
            System.out.println("You entered " + deposit + " That's not a positive number, try again: ");
            deposit = kbd.nextDouble();
        }
// asking user for my rate variable
        System.out.println("Please enter an initial rate between 0 and 1");

        double rate = kbd.nextDouble();
// rate while loop
        while (rate < 0 || rate > 1) {
            System.out.println("You entered " + rate + " that's not between 0 and 1, try again");
            rate = kbd.nextDouble();
        }
// ask user for years variable
        System.out.println("Enter an amount of years your investment is compounding as an integer: ");

        int years = kbd.nextInt();

// years input while loop
        while (years < 0) {
            System.out.println("You entered " + years + " please enter a positive number, try again: ");
            years = kbd.nextInt();

        }
        // asking for user input
        System.out.println("Please enter the amount of times your investment is compounded per year: ");


        int compound = kbd.nextInt();
        // while loop for my compound variable
        while (compound < 0) {
            System.out.println("You entered " + compound + " Please enter a positive integer, try again");
            compound = kbd.nextInt();
        }


        System.out.print("You're investment is worth " + Math.round(investment(deposit, rate, years, compound)));


    }
}

