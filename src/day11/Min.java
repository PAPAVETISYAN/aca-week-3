package day11;

import java.util.Scanner;

public class Min {
    public static void main(String[]args){
        int a,b,c,d;
        System.out.print("a=");
        a = input();
        System.out.print("b=");
        b = input();
        System.out.print("c=");
        c = input();
        System.out.print("d=");
        d = input();
        int min = min(a , b, c, d);
        System.out.print("min=" + min);

    }

    public static int input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static int min(int a, int b, int c, int d){
        if(a <= b && a <= c && a <= d){
            return a;
        }else if (b <= a && b <= c && b <= d){
            return b;
        }else if(c <= a && c <= b && c <= d){
            return c;
        }
        return d;
    }
}
