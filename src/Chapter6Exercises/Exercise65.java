package Chapter6Exercises;

public class Exercise65 {
     /* returns true if every letter in s
     * returns twice
      */
    public static boolean isDoubloon(String s) {


        for(int i = 0; i < s.length(); i++) {
            int cnt = 0;

            for(int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    cnt++;
                }

            } // inner for loop
            // != for only twice
            // < for letters appearing at least twice
            if (cnt < 2) {
                return false;
            }
        } // big for loop

        return true;

    }

    public static void main(String [] args) {
        System.out.println(isDoubloon("appeases"));
        System.out.println(isDoubloon("abba"));
        System.out.println(isDoubloon("esophagographers"));
    }

}
