package day13;

import java.util.Scanner;

public class Palindrome8 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        text = text.toLowerCase();
        System.out.println(palindrome(text));
    }
    public static boolean palindrome(String str){
        int count = 0;
        for (int i = 1; i < str.length(); ++i){
            if (str.charAt(0) == str.charAt(i)){
                ++count;
            }
        }
        if(count == str.length() - 1){
            return false;
        }
        int k = 0;
        for(int i = 0; i < str.length() / 2; ++i){
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)){
                ++k;
            }
        }
        if(k == str.length() / 2){
            return true;
        }
        return false;
    }
}
