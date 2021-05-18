package day15;

import java.util.Random;
import java.util.Scanner;

public class SelectionSort6 {
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
        selectionSort(array);
        output(array);
        System.out.println();
        System.out.println("min=" + array[0]);
        System.out.println("max=" + array[array.length - 1]);
        System.out.println(averageArray(array));
    }


    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; ++i){
            for (int j = i + 1; j < array.length; ++j){
                if(array[j] < array[i]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    public static int averageArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
    public static void output(int[]array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
