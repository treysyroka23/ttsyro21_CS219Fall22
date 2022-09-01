public class weather {

    public static double windchill(double t, //temperature
                                   double v) { //velocity in mph
        return 35.74 + .6215 * t + (.4275*t - 35.75) *Math.pow(v, .16);
    }
    public static void main(String [] args) {
        System.out.println(windchill(32, 10));
    }
}
