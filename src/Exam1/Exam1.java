package Exam1;
import java.util.Scanner;
public class Exam1 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(stringLength(getString(s)));

    }
public static int stringLength(int i){

    int count = 0;
    while (i > 0){
        i = i / 10;
        count = count + 1;

    }
    return count;


}
    public static int getString(Scanner s) {
        while (true) {
            System.out.println("Please enter an integer: ");
            if (s.hasNextInt()) {
                int i = s.nextInt();

                if (i < 0)
                    System.out.print("Error number should be positive, you entered: " + i + "\n");
                else if (i >= 7) {
                    String fruit = Integer.toString(i);
                    String index = fruit.substring(3, 7);
                    i = Integer.parseInt(index);
                    return i;

                }





            }




            else {
                String number = s.next();
                System.out.print("Error: integer is expected. You put: " + number + "\n");
            }

        }
    }
}
