package day14;

public class Arajadranq2 {
    public static void main(String[] args) {
        System.out.println(erkusiAstijan(5));
    }

    public static int erkusiAstijan(int n) {
        if (n == 0) {
            return 1;
        }
        return 2 * erkusiAstijan(n - 1);
    }
}
