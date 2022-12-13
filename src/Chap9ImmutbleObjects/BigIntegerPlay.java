package Chap9ImmutbleObjects;

import java.math.BigInteger;
import java.sql.SQLOutput;

public class BigIntegerPlay {


    public static int fact(int n) {
        int prod = 1;
        for (int i = n; i > 0; i--) {
            prod = prod * i;
        }
        return prod;
    }

    public static BigInteger bigfact(int n) {
        BigInteger prod = new BigInteger("1");
        for (int i = 1; i <=n; i ++) {
            prod = prod.multiply(BigInteger.valueOf(i));

        }
        return prod;
    }

    public static void main(String[] args) {


        System.out.println(bigfact(100));
        // System.out.println(fact(5) == 120);


        // print the first 15 factorials

        //for (int i = 1; i <= 5; i++) {
           // System.out.printf("%d : %d\n", i, fact(i));
       // }
        //BigInteger
       // BigInteger x = new BigInteger("1234567890987654321234567890");

       // System.out.println(x.multiply(x).pow(2));
    }
}
