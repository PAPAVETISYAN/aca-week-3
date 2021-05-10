package day11;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if (n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        int number1 = 1, number2 = 2, numberfibonacci = 0;
        for (int i = 2; i < n; ++i)
        {
            numberfibonacci = number1 + number2;
            number1 = number2;
            number2 = numberfibonacci;
        }
        return numberfibonacci;
    }
}
