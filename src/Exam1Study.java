import java.util.Scanner;
public class Exam1Study {
    public static double c2f(double c) {
        return 9.0/5.0 * c + 32;
    }
    // Essentially the same function we wrote in class
// for validating inputs. We don’t need to check a valid
// range because temperatures can be positive or negative.
    public static double getValidTemp(Scanner kbd) {
        double c = -1;
        while (true) {
            System.out.print("Enter a temperature in celsius: ");
            if (kbd.hasNextDouble()) {
                c = kbd.nextDouble();
                return c;
            }
            else {
                String str = kbd.next();
                System.out.printf("Error: you entered: \"%s\"\n", str);
            }
        } // while
    }  // getValidTemp
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        double c = getValidTemp(s);
// Getting a little cute the character \u00B0 is the
// degree symbol.
        System.out.printf("%.1f\u00B0C converts to %.1f\u00B0F \n",
                c, c2f(c));
    }

}
