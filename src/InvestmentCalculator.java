import utility.Investment;
import java.util.Scanner;
public class InvestmentCalculator {


public static void main(String[] args){
    // prompt the user c, r, t, n


    Scanner kbd = new Scanner(System.in);
// takeInteger = kbd
    System.out.print("Please enter an initial deposit as a decimal: ");
    double c = kbd.nextDouble();


    // c = entered number

    System.out.print("Enter a interest rate as a decimal: ");
    double r = kbd.nextDouble();



    System.out.print("Enter the amount of years as an integer: ");
    int t = kbd.nextInt();




    System.out.print("Enter a number of times to compound the interest per year as an integer: ");
    int n = kbd.nextInt();




    System.out.printf("Your investment is worth %.2f", Investment.investment(c, r, t, n));







}


}
