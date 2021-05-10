package day11;

import java.util.Scanner;

public class Eight {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("number=");
        int number = scanner.nextInt();
        System.out.println(hasEight(number));
    }
    public static boolean hasEight(int number){
        while (number > 0){
            if (number % 10 == 8){
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
