package day11;

import java.util.Scanner;

public class Contains {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int []array = new int[10];
        for(int i = 0; i < array.length; ++i){
            array[i] = scanner.nextInt();
        }
        System.out.print("number=");
        int number = scanner.nextInt();
        System.out.println(contains(array, number) + " " + number);
    }
    public static boolean contains(int [] array, int n){
        for (int i = 0; i < array.length; ++i){
            if(array[i] == n){
                return true;
            }
        }
        return false;
    }
}
