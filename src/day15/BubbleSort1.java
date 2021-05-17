package day15;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("n=");
        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < array.length; ++i){
            array[i] = random.nextInt(100);
        }
        output(array);
        bubbleSort(array);
        System.out.println();
        output(array);
    }

    public static void  output(int [] array){
        for (int j : array) {
            System.out.print(j + "  ");
        }
    }

    public static void bubbleSort(int [] array){
        for (int j = 0; j < array.length; ++j) {
            for (int i = 0; i < array.length - 1 - j; ++i) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }
}
