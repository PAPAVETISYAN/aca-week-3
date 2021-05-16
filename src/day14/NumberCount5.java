package day14;

import java.util.Scanner;

public class NumberCount5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        System.out.print("k=");
        int k = scanner.nextInt();
        System.out.println(numberCount(n, k));
    }
    public static int numberCount(int n, int k){
        if (n == 0) {
            return 0;
        }else if((n%10) == k) {
            return (1 + numberCount(n / 10, k));
        }else {
            return numberCount(n / 10, k);
        }
    }
}
