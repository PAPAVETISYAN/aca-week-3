package day11;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("number=");
        int number = scanner.nextInt();
        System.out.println(palindrome(number));
    }
    public static boolean palindrome(int number){
        int number1 = number;
        int k = 0;
        while (number1 > 0){
            ++k;
            number1 /= 10;
        }
        int [] array = new int[k];
        for(int i = 0; i < k; ++i){
            array[i] = number % 10;
            number /= 10;
        }
        for (int i = 0; i < k / 2; ++i){
            if (array[i] != array[k - 1 - i]){
                return false;
            }
        }
        return true;
    }
}
