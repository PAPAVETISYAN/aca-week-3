package day13;

import java.util.Scanner;

public class Hex10 {
    public static void main(String[]args){
        System.out.print("Enter a hex string: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if (hex(text)){
            System.out.println(text + "is a hex string");
        }else {
            System.out.println(text + " is NOT a hex string");
        }
    }
    public static boolean hex(String str){

        String str1 = str.toLowerCase();
        int count = 0;
        for(int i = 0; i < str.length(); ++i){
            if(str1.charAt(i) >= 48 && str1.charAt(i) <= 57 || str1.charAt(i) >= 97 && str1.charAt(i) <= 102){
                count++;
            }
        }
        if(count == str.length()){
            return true;
        }
        return false;
    }
}
