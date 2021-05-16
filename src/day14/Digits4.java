package day14;

import java.util.Scanner;

public class Digits4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        System.out.println(sumDigit(n));
    }
    public static int sumDigit(int n){
        if (n == 0) {
            return 0;
        }
        return (n % 10 + sumDigit(n / 10));
    }
}
