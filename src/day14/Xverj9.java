package day14;

import java.util.Scanner;

public class Xverj9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a text:");
        String str = scanner.nextLine();
        System.out.println(xVerj(str));
    }
    public static String xVerj(String str){
        if(str.length() == 1){
            return str;
        }
        if(str.charAt(0) == 'x'){
            return xVerj(str.substring(1,str.length() )) + 'x';
        }
        return str.charAt(0) + xVerj(str.substring(1, str.length()));
    }

}
