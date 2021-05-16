package day14;

import java.util.Scanner;

public class SumArray1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; ++i){
            array[i] = scanner.nextInt();
        }
        System.out.println(sumArray(array,array.length-1));
    }
    public static int sumArray(int[]array, int n){
            if (n < 0) {
                return 0;
            }
                return array[n] + sumArray(array, n-1);
    }
}
