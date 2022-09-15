package Hw3;

import java.util.Scanner;

public class Investment {

    public static double investment(double c, double r, int t, int n) {

        return c * Math.pow(1 + r / n, t * n);
    }
    public static void main(String[] args) {
// allows me to ask for user input
        Scanner kbd = new Scanner(System.in);

// establishing a variable
        double deposit;

        System.out.print("Enter an initial deposit as a positive decimal: ");
// if else statement says if what the user enters is a double we save it into the deposit variable
        if (kbd.hasNextDouble()) {
            deposit = kbd.nextDouble();

        }
// if not it prints this and quit the program
        else {
            System.err.print("Please enter a decimal");
            // shuts down the  program after the condition is met
            System.exit(0);
            return;
        }
        // This allows me to check if numbers enter are negatives and invalid
        if (deposit < 0) {
            // prints an error code
            System.err.print("Please type a positive decimal number");
            // shuts down the  program after the condition is met
            System.exit(0);
        }

 // this section determines our rate variable and if it meets the criteria
        double rate;
        System.out.print("Enter an interest rate as a decimal between 0 and 1: ");

        if (kbd.hasNextDouble()) {
            rate = kbd.nextDouble();

        }
        else {
            System.err.print("Please type a positive decimal number");
            // shuts down the  program after the condition is met
            System.exit(0);

            return;

        }
        if (rate < 0 || rate > 1) {
            System.err.print("Please type a decimal number between 0 and 1");
            // shuts down the  program after the condition is met
            System.exit(0);
        }

// establishing a integer variable and if it meets the criteria from the user input
        int year;
        System.out.print("Enter how many years of interest as a positive integer: ");

        if (kbd.hasNextInt()) {
            year = kbd.nextInt();

        }

        else {
            System.err.print("Error, enter how many years as a positive integer: ");
            System.exit(0);
            return;
        }
        if (year < 0) {
            System.err.print("Please type a positive integer");
            // shuts down the  program after the condition is met
            System.exit(0);
        }
// establishing our compound variable

        int compound;
        System.out.print("Enter how many times your interest is compounded per year: ");

        if (kbd.hasNextInt()) {
            compound = kbd.nextInt();
        }
// produces system erros if the input entered doesn't match the requirements i want
        else{
            System.err.print("Please type a positive integer");
            // shuts down the  program after the condition is met
            System.exit(0);
            return;
        }
        if (compound < 0) {
            System.err.print("Please type a positive integer");
            // shuts down the  program after the condition is met
            System.exit(0);
        }
        // printing out the final answer with all our variables we established in the main program
        System.out.print(investment(deposit, rate, year, compound));
    }
}

