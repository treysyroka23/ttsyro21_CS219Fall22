package Chapter6Exercises;

import java.util.Locale;

public class Exercise64 {


    public static String toLower(String s){

        String r = "";
        for (int i = 0; i < s.length(); i ++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z'){
                r = r + (char) ('a' + (ch - 'A'));
            }
            else {
                r = r + ch;
            }
        }

        return r;
    }



    public static boolean isAbecedarian(String s) {
        s = s.toLowerCase();
        s = toLower(s);
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) >= s.charAt(i + 1)) {
        return false;
         }
         } // end of the for loop
        // it is in alphabetical order
         return true;


    }
        public static void main (String[]args){
            System.out.println(toLower("aPPle"));
            System.out.println(toLower("APPLE"));
            System.out.println(isAbecedarian("biopsy"));
            System.out.println(!isAbecedarian("apple"));
        }



}


