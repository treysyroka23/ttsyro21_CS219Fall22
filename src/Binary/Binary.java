package Binary;

import java.util.Arrays;

public class Binary {
    public static void printbinary(int n) {
    if (n == 0)
        System.out.print("");
        else {
            printbinary(n / 2);
            System.out.print(n % 2);

        }

    }

    public static String toBinary(int n) {
        String r = "";

        while (n > 0) {
            r = (n % 2) + r;
            n = n / 2;
        }
        return r;
    }

    public static int parseint(String bits) {

        int curr_pow_2 = 1;
        int r = 0;

        for (int i = bits.length() - 1; i >= 0; i --) {
            if (bits.charAt(i) == '1') {
                r = r + curr_pow_2;

            }
                curr_pow_2 = curr_pow_2 * 2;


        }

        return r;
    }

    public static void main(String[] args) {
        printbinary(43); // should print 101011
        System.out.println();
        System.out.println(toBinary(43));
        System.out.println(parseint("101011") == 43);
        System.out.println(0b1111);
    }
}
