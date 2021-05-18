package day15;

import java.util.Random;
import java.util.Scanner;

public class BubbleSortMinMaxAverage5 {
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
        System.out.println();
        sort(array);
        output(array);
        System.out.println();
        int min = array[0];
        int max = array[array.length - 1];
        int average = (min + max) / 2;
        System.out.println("min=" + min);
        System.out.println("max=" + max);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == average){
                System.out.println("average=" + average);
                ++count;
                break;
            }
        }
        if (count == 0){
                System.out.println("average=" + 1);
        }
    }
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; ++i){
            for (int j = 0; j < array.length - 1 - i; ++j){
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void output(int[]array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
