package day13;

import java.util.Scanner;

public class Duplicate12 {
    public static void main(String[]args){
        System.out.print("Enter a hex string: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(duplicate(text));
    }
    public static int duplicate(String str){
        int number = 0;
        for (int i = 0; i< str.length() - 1; ++i){
            int count = 1;
            for (int j = i + 1; j < str.length(); ++j){
                if(str.charAt(i) == str.charAt(j) && str.charAt(j) != (char) 0){
                    ++count;
                    StringBuilder sb = new StringBuilder(str);
                    sb.setCharAt(j, (char)0);
                    str = sb.toString();
                }
            }
            if(count > 1 && str.charAt(i) != '0'){
                ++number;
            }
        }
        return number;
    }
}
