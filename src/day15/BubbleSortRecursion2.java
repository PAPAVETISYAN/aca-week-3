package day15;

import java.util.Random;
import java.util.Scanner;

public class BubbleSortRecursion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("n=");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt(100);
        }
        output(array);
        System.out.println();
        bubbleSortRecursion(array, n);
        output(array);
    }

    public static void bubbleSortRecursion(int[] array, int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; ++i) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        --n;
        bubbleSortRecursion(array, n);
    }

    public static void  output(int [] array){
        for (int j : array) {
            System.out.print(j + "  ");
        }
    }
}
