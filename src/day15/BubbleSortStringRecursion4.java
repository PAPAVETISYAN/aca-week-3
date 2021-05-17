package day15;

import java.util.Scanner;

public class BubbleSortStringRecursion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        String [] array = new String[n];
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.next();
        }
        output(array);
        System.out.println();
        bubbleSortRecursion(array, n);
        output(array);
    }
    public static void  output(String [] array){
        for (int j = 0; j < array.length; ++j) {
            System.out.print(array[j] + "  ");
        }
    }
    public static void bubbleSortRecursion(String[] array, int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; ++i) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                String temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        --n;
        bubbleSortRecursion(array, n);
    }
}
