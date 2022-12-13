package Chap9ImmutbleObjects;
import java.util.Random;
import java.math.BigInteger;

public class DiffieHellman {
     // rewrite this using big Int
    public static int pow(int x, int y) {
        int prod = 1;
        for (int i = 0; i < y; i ++) {
            prod = prod * x;
        }
        return prod;
    }
    public static void main(String[] args) {
        Random rng = new Random();

        // get a big prime number
        BigInteger p = new BigInteger("7919");

        BigInteger Apriv = new BigInteger("123456789");

        // alice computes her public key

        BigInteger Apub = BigInteger.TWO.modPow(Apriv, p);

        //Bob picks a private key

        BigInteger Bpriv = new BigInteger("497");

        // bob computes public key

        BigInteger Bpub = BigInteger.TWO.modPow(Bpriv, p);

        // alice can now compute thebshared key

        BigInteger Ashared = Bpub.modPow(Apriv, p);

        // bob can now compute the shared key

        BigInteger Bshared = Apub.modPow(Bpriv, p);

        System.out.println(Ashared.equals(Bshared));

        System.out.println(Bshared);
    }
}
