package day14;

import java.util.Scanner;

public class AddParentheses15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a line : ");
        String text = scanner.nextLine();
        int n = text.length();
        System.out.println(addParentheses(text, n));
    }

    public static String addParentheses(String str, int n) {
        if(str.length() <= 0){
            return str;
        }
        if(n % 2 ==1) {
            if (n / 2 < str.length()) {
                return "(" + str.charAt(0) + addParentheses(str.substring(1), n);
            }
            if (n / 2 == str.length()) {
                return ")" + str.charAt(0) + ")" + addParentheses(str.substring(1), n);
            }
            return str.charAt(0) + ")" + addParentheses(str.substring(1), n);
        }else {
            if (n / 2 < str.length()) {
                return "(" + str.charAt(0) + addParentheses(str.substring(1), n);
            }
            return str.charAt(0) + ")" + addParentheses(str.substring(1), n);
        }
    }
}
