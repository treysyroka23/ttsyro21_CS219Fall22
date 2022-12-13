package Chap9ImmutbleObjects;

public class main {
    public static void main(String[] args) {
        String s = "hello";
        String t = new String("hello");
        // strings are immutable

        // make a version of s that is capitalized
        String s1 = Character.toUpperCase(s.charAt(0)) + s.substring(1);

        // StringBuilder - mutable strings

        //Character objects are also immutable

        char ch = 'a';
        Character ch1 = 'a';
        //Character ch3 = new Character('a');
        // red line means its depricated

        int x = 33;

        Integer y = 33;

        //Integer y1 = new Integer(33);

        double pi = 3.14159;

        Double pi1 = 3.14159;
         Boolean flag = false;
         Long ll = 43L;
        pi1 = 2.7128;

        // Double, Long, Integer, Boolean, Character are all wrapper classes
        //for their respective primitive type.
        // taking a primitive value and wrapping in an object is auto boxing.
        // turning an object into its primitive is called auto unboxing.

        Student ss = new Student("Trey", "Syroka",
                "6702", "");
         // ss.nickname = "";   //remove the nickname or change it
        //ss.first = "harry";    error

        System.out.println(ss);



    }
}
