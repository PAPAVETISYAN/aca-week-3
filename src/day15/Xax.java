package day15;

import java.util.Locale;
import java.util.Scanner;

public class Xax {
    public static void main(String[] args) {
        xax();
    }
    public static void xax(){
        System.out.println("enter a number from 1 to 100");
        int []array = new int[100];
        int n, start = 0, end = array.length - 1;
        for (int i = 0; i < array.length; ++i){
            array[i] = i + 1;
        }
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("yor number is " + array[(start + end) / 2] + " ? : ");
            System.out.println("                         = : 0 " + " > : 1 " + " < : 2 ");
            n = scanner.nextInt();
            if(n == 0){
                System.out.println("game over");
            }else if (n == 1){
                start = (start + end) / 2;
            }else if(n == 2){
                end = (end + start) / 2;
            }
        }while (n != 0);
    }
}
