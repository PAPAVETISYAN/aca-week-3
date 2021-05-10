package day11;

import java.util.Scanner;

public class Election {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("x=");
        boolean x = scanner.nextBoolean();
        System.out.print("y=");
        boolean y = scanner.nextBoolean();
        System.out.print("z=");
        boolean z = scanner.nextBoolean();
        System.out.println(election(x, y, z));
    }
    public static boolean election(boolean x, boolean y, boolean z){
        if (x == y || x == z){
            return x;
        }
        return y;
    }
}
