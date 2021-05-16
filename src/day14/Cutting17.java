package day14;

import java.util.Scanner;

public class Cutting17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a text:");
        String str = scanner.nextLine();
        int n = str.length();
        System.out.println(cutting(str, n));
    }
    public static String cutting(String str, int n){
        if(str.length() <= 1){
            return str;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)){
                return cutting(str.substring(1, str.length() - 1), n);
            }
        return str.charAt(0) + cutting(str.substring(1, str.length() - 1), n) + str.charAt(str.length() - 1);
    }
}
