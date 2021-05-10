package day11;

import java.util.Scanner;

public class Student {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int studentNumber = scanner.nextInt();
        int [] array = new int[studentNumber];
        for (int i = 0; i < studentNumber; ++i){
            System.out.print("Enter the grade for student " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        System.out.println("The average is: " + average(array));
        System.out.println("The minimum is: " + minimum(array));
        System.out.println("The maximum is: " + maximum(array));
    }
    public static double average(int [] array){
        double sum = 0;
        for(int i = 0; i < array.length; ++i){
            sum += array[i];
        }
        sum /= array.length;
        return sum;
    }
    public static int minimum(int [] array){
        int min = array[0];
        for(int i = 1; i < array.length; ++i){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    public static int maximum(int [] array){
        int max = array[0];
        for(int i = 1; i < array.length; ++i){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
