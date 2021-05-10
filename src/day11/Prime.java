package day11;

import java.util.Scanner;

public class Prime {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        System.out.println(isPrime(n));
    }
    public static boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); ++i){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
