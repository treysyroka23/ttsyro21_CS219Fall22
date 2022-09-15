package utility;

import java.util.Scanner;

public class Investment {

    public static double investment(double c, double r, int t, int n) {

        return c * Math.pow(1 + r / n, t * n);
    }
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        double deposit;

        System.out.print("Enter an initial deposit as a decimal: ");

        if (kbd.hasNextDouble()) {
            deposit = kbd.nextDouble();

        }

        else {
            System.out.printf("Error please enter a decimal you entered", kbd.next());
            return;
        }
        if (deposit > 0) {
            deposit = kbd.nextDouble();
        }

        else {
            System.out.print("Error please enter a positive number");
            return;
        }

        double rate;
        System.out.print("Enter an interest rate as a decimal between 0 and 1: ");

        if (kbd.hasNextDouble()) {
            rate = kbd.nextDouble();

        }
        else {
            System.out.print("Error please enter a decimal between 0 and 1: ");

            return;
        }
        int year;
        System.out.print("Enter how many years of interest as an integer: ");

        if (kbd.hasNextInt()) {
            year = kbd.nextInt();
        }
        else {
            System.out.print("Error, enter how many years as an integer: ");
            return;
        }

        int compound;
        System.out.print("Enter how many times your interest is compounded per year: ");

        if (kbd.hasNextInt()) {
            compound = kbd.nextInt();
        }
        else{
            System.out.print("Error enter the compound a s a integer: ");
            return;
        }
        System.out.print(investment(deposit, rate, year, compound));
    }
}

