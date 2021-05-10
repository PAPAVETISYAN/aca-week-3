package day11;

import java.util.Scanner;

public class Xor {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        boolean a = scanner.nextBoolean();
        System.out.print("b=");
        boolean b = scanner.nextBoolean();
        System.out.println(xor(a, b));
    }
    public static boolean xor(boolean a, boolean b){
        if (a != b){
            return true;
        }
        return false;
    }
}
