package day14;

import java.util.Scanner;

public class CountChar6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a text: ");
        String str = scanner.nextLine();
        System.out.println(countChar(str));
    }
    public static int countChar(String str){
        if(str.length() < 1){
            return 0;
        }else if (str.charAt(0) != 'x'){
            return  countChar(str.substring(1));
        }else{
            return 1 + countChar(str.substring(1));
        }
    }
}