package day14;

import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        System.out.println(fib(n));

    }
    public static int fib(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
