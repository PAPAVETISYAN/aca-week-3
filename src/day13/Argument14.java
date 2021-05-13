package day13;

import java.util.Scanner;

public class Argument14 {
    public static void main(String[]args){
        System.out.print("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char ch = 'a';
        System.out.println(argument(text, ch));
    }
    public static int argument(String str, char ch){
        int count = 0;
        for (int i = 0; i < str.length(); ++i){
            if(str.charAt(i) == ch){
                ++count;
            }
        }
        return count;
    }
}
