package day13;

import java.util.Locale;
import java.util.Scanner;

public class CaesarCode7 {
    public static void main(String[]args){
        System.out.print("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(caesarCode(text));
    }
    public static String caesarCode(String str){
        str = str.toUpperCase(Locale.ROOT);
        char myChar = str.charAt(0);
        for (int i = 0; i < str.length(); ++i){
            myChar = str.charAt(i);
            if (str.charAt(i) >= 65 && str.charAt(i) <=87){
                myChar += 3;
            }else if (str.charAt(i) == 88){
                myChar = 'A';
            }else if (str.charAt(i) == 89){
                myChar = 'B';
            }else if (str.charAt(i) == 90){
                myChar = 'C';
            }
            StringBuilder sb = new StringBuilder(str);
            sb.setCharAt(i, myChar);
            str = sb.toString();
        }
        return str;
    }
}
