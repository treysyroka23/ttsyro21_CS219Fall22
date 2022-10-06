import java.util.Scanner;
public class exam1spring {
    public static double volume(double r, double h) {
        return (1.0 / 3) * Math.PI * Math.pow(r, 2) * h;
    }
    public static double getValidDouble(Scanner s, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (s.hasNextDouble()) {
                double d = s.nextDouble();
                if (d < 0)
                    System.out.printf("Error: number should be positive. You entered %f\n",d);
                else
                    return d;
            }
            else {
                String tok = s.next();
                System.out.printf("Error: expected a number. You entered %s\n",tok);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double r = getValidDouble(s, "Radius:");
        double h = getValidDouble(s, "Height: ");
        System.out.printf("The volume of your cone is %.2f", volume(r, h));
    }
}

