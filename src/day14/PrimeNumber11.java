package day14;

import java.util.Scanner;

public class PrimeNumber11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        int i = 2;
        System.out.println(n + "  is prime ? : " + prime(n, i));
    }
    public static boolean prime(int n,int i){
        if(n <= 2){
            return true;
        }
        if(n % i == 0){
            return false;
        }
        if(i * i > n){
            return true;
        }
        return prime(n, ++i);
    }
}
