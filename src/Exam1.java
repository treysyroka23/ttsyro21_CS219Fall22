public class Exam1 {
// shows if the first and last characters of a string are the same
public static double string(String s) {
    if (s.charAt(0) == s.charAt(s.length() - 1))
        System.out.println("yes");
    else
        System.out.println("no");

return 0;
}



    public static void main(String [] args) {
        System.out.println(Math.round(6.02235e4));
        System.out.printf("%1.3f\n", 3.14159);
        System.out.println('d' - 'a');  // weird
        System.out.println(2 + "bc");
        System.out.println(2 + 3 + "bc");
        System.out.println((2 + 3) + "bc");
        System.out.println("bc" + 2 + 3);
        System.out.println("bc" + (2 + 3));
        System.out.print(string("appb"));
        String s = "hippopotomonstrosesquippedaliophobia";
        System.out.println(s.charAt(0));
        System.out.println(s.indexOf('q'));
        System.out.println(s.indexOf('o'));
        System.out.println(s.substring(s.indexOf('m'),16));
        System.out.println(s.charAt(s.length()));
    }
}
