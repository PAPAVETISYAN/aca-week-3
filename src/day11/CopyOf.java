package day11;

import java.util.Scanner;

public class CopyOf {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int []array = new int[10];
        for (int i = 0; i < array.length; ++i){
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < copyOf(array).length; ++i) {
            System.out.print(copyOf(array)[i] + " ");
        }
    }
    public static int[] copyOf(int[] array){
        int []array2 = new int[array.length];
        for (int i = 0; i < array.length; ++i){
            array2[i] = array[i];
        }
        return array2;
    }
}
