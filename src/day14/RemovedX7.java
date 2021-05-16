package day14;

import java.util.Scanner;

public class RemovedX7 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("enter a string : ");
        String text = scanner.nextLine();
        System.out.println(removedX(text));
    }
    public static String removedX(String str){
        if(str.length() <= 0){
            return str;
        }
        if (str.substring(0,1).equals("x")){
            return "" + removedX(str.substring(1));
        }
        return str.charAt(0) + removedX(str.substring(1));
    }
}