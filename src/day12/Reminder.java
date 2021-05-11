package day12;

import java.util.Scanner;

public class Reminder {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("number1=");
        int number1 = scanner.nextInt();
        System.out.println(reminder(number1));
        System.out.print("number2=");
        int number2 = scanner.nextInt();
        System.out.println(reminder(number1, number2));
    }
    public static int reminder(int number){
        int sum = 0;
        while(number > 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public static int reminder(int number, int num){
        int sum = 0;
        while(number > 0){
            sum += number % 10;
            number /= 10;
        }
        return sum % num;
    }
}
