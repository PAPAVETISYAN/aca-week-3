package day15;

import java.util.Scanner;

public class StringSort7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < array.length; ++i){
            array[i] = scanner.next();
        }
        output(array);
        System.out.println();
        sort(array);
        output(array);
        System.out.println();
        System.out.println("min=" + array[0]);
        System.out.println("max=" + array[array.length - 1]);
    }
    public static String[] sort(String[] array) {
        for (int i = 0; i < array.length; ++i){
            for (int j = 0; j < array.length - 1 - i; ++j){
                if (array[j].compareToIgnoreCase(array[j + 1]) > 0){
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    public static void output(String[]array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
