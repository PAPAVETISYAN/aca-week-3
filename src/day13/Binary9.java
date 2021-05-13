package day13;

import java.util.Scanner;

public class Binary9 {
    public static void main(String[]args){
        System.out.print("Enter a binary string: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if (binary(text)){
            System.out.println(text + "is a binary string");
        }else {
            System.out.println(text + " is NOT a binary string");
        }
    }
    public static boolean binary(String str){
        int k = 0;
        for (int i = 0; i < str.length(); ++i){
            if(str.charAt(i) == 48 || str.charAt(i) == 49){
                ++k;
            }
        }
        if(k == str.length()){
            return true;
        }
        return false;
    }
}
