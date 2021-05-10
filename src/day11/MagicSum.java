package day11;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int number = 0, sum = 0;
        do {
            System.out.print("Enter a positive integer (or -1 to end):");
            number = scanner.nextInt();
            if(magicSum(number)){
                sum += number;
            }
        }while (number != -1);
        System.out.println(sum);
    }
    public static boolean magicSum(int number){
        while(number > 0){
            if(number % 10 == 8){
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
