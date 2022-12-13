public class examFinal {

    public static void main(String[] args) {
        System.out.print(loop(10));
    }
    public static int loop(int n) {
        int i = n;
        while (i > 1) {
            if (i % 3 == 0) {
                i = i / 5;
            }
            else {
                i = i + 7;
            }

        }
        return i;
    }
}
