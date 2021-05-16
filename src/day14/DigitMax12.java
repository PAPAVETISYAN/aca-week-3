package day14;

import java.util.Scanner;

public class DigitMax12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int max = 0;
        int n = scanner.nextInt();
        System.out.println(digitMax(n,max));
    }
    public static int digitMax(int n, int max) {
        if (n <= 0) {
            return max;
        }
        if (max < (n % 10)){
            max = n % 10;
           return digitMax(n / 10, max);
        }
        return digitMax(n / 10, max);
    }
}
