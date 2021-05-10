package day11;

import java.util.Scanner;

public class Factorial {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }
    public static int factorial(int a){
        if(a == 1 || a == 0){
            return 1;
        }
        return a * factorial(a - 1);
    }
}
