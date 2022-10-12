package Hw6;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class SwallowStats {

    public static void swallow_stats() {

        // connect to the web page of speeds
        URL url = null;    // null is the "nothing value"
        Scanner s = null;
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
// this is when it connects to the server
        double sum = 0.0;
        int count = 0;
        double min = 1000;
        double max = 0;

        // read each line of the web file
        while (s.hasNextLine()) {
            String line = s.nextLine(); // reads lines from the website

            if ((line.indexOf("#") == -1 && line.length() != 0)) {
                if (Double.parseDouble(line) < min)
                    min = (Double.parseDouble(line));
                else if (Double.parseDouble(line) > max)
                    max = Double.parseDouble(line);
                sum += Double.parseDouble(line);
                count++;
            }
        }
        System.out.printf("The average swallow speed is %.2f.\n", sum/count);
        System.out.printf("The minimum swallow speed is %.1f.\n", min);
        System.out.printf("The maximum swallow speed is %.1f. \n", max);

    } // avg_swallow_speed

    public static void main(String[] args) {
        swallow_stats();
    }
}