package day14;

import java.util.Scanner;

public class NumberCount13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a line : ");
        String text = scanner.nextLine();
        int i = text.length() - 1;
        System.out.println(countNumber(text));
    }
    public static int countNumber(String str){
        if(str.length()  < 1) {
            return 0;
        }else if(str.charAt(0) >= 48 && str.charAt(0) <= 57){
            return 1 + countNumber(str.substring(1, str.length()));
        }
        return countNumber(str.substring(1, str.length()));
    }
}