package day14;

import java.util.Scanner;

public class OpeningBrackets16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a text:");
        String str = scanner.nextLine();
        System.out.println(openingBrackets(str));
    }
    public static String openingBrackets(String str){
        if(str.length() < 1){
            return str;
        }
        if(str.charAt(0) == '('){
            return str.charAt(0) + openingBrackets(str.substring(1)) + ')';
        }
        return str.charAt(0) + openingBrackets(str.substring(1)) + str.charAt(0);
    }
}
