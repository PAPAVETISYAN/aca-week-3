package day11;

import java.util.Scanner;

public class Search {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int []array = new int[10];
        for(int i = 0; i < array.length; ++i){
            array[i] = scanner.nextInt();
        }
        System.out.print("key=");
        int key = scanner.nextInt();
        System.out.println(search(array, key));
    }
    public static int search(int[] array, int key){
        for(int i = 0; i < array.length; ++i){
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }
}
