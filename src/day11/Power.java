package day11;

public class Power {
    public static void main(String[]args){
        double a = 1.5;
        int n = 2;
        System.out.println(pow(a, n));
    }
    public static double pow (double a, int n){
        for (int i = 1; i < n; ++i){
            a *= a;
        }
        return a;
    }
}
