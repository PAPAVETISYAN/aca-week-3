package day14;

import java.util.Scanner;

public class Reverse8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a text:");
        String str = scanner.nextLine();
        System.out.println(reverse(str));
    }
    public static String reverse(String str){
        if(str.length() < 1){
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
