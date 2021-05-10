package day11;

import java.util.Random;

public class Task1 {
    public static void main(String[]args){
        int []array = new int[10];
        input(array);
        output(array);
        change(array);
        output(array);
    }
    public static void output(int[] array){
        System.out.println();
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
    public static int[] change( int[] array){
        for(int i = 0; i < array.length; ++i){
                array[i] *= -1;
        }
        return array;
    }

    public static int[] input( int[] array){
        Random random = new Random();
        for(int i = 0; i < array.length; ++i){
            array[i] = random.nextInt();
        }
        return array;
    }
}
