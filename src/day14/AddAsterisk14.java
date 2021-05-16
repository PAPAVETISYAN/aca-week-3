package day14;

import java.util.Scanner;

public class AddAsterisk14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a line : ");
        String text = scanner.nextLine();
        System.out.println(addAsterisk(text));
    }
    public static String addAsterisk(String str){
        if(str.length() <= 1){
            return str;
        }
        return  str.charAt(0) + "*" + addAsterisk(str.substring(1));
    }
}
