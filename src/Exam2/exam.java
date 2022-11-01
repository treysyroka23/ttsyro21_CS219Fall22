package Exam2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class exam {
    public static String [] load_words(String path, int n) {

        URL url = null;    // null is the "nothing value"
        Scanner s = null;


        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // creat an array of string

        String [] words = new String[n];
        int i = 0;
        while (s.hasNextLine()) {
            words[i++] = s.nextLine();
        }


        return words;

    }

    public  static boolean isPalandrome(String ans) {

            int i = 0;
            int j = ans.length() - 1;

            // While there are characters to compare
            while (i < j) {
                if (ans.charAt(i) != ans.charAt(j))
                    return false;

                i++;
                j--;
            }

            // Given string is a palindrome
            return true;
        }


    public static void main(String[] args) {
        String [] words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt", 2309);

        String empty="";

        for(int i=0;i<words.length;i++){

            for(int j=i+1;j<words.length;j++){

                if(words[j].compareTo(words[i]) > 0){

                    empty = words[i] ;
                    words[i] = words[j];
                    words[j] = empty;
                }
            }

        }

        for(String val:words){
            System.out.println(isPalandrome(val));
        }


    }
}
