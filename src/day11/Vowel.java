package day11;

import java.util.Scanner;

public class Vowel {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string");
        String str = scanner.nextLine();
        char ch = str.charAt(0);
        System.out.println(vowel(ch));
    }
    public static boolean vowel(char ch){
        if(ch == 'a' || ch == 'o' || ch == 'e' || ch == 'y' || ch == 'u' || ch == 'i'){
            return true;
        }
        return false;
    }
}
