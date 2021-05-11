package day12;

public class Max {
    public static void main(String[]args){
        int a = 1, b = 2, c = 3, d = 3;
        System.out.println(max(a, b));
        System.out.println(max(a, b, c));
        System.out.println(max(a, b, c, d));
    }
    public static int max(int a, int b){
        if(a > b){
            return a;
        }
        return b;
    }
    public static int max(int a, int b, int c){
        if(a >= b && a >= c){
            return a;
        }else if (b >= a && b >= c){
            return b;
        }
        return c;
    }
    public static int max(int a, int b, int c, int d){
        if(Math.max(a, b) > Math.max(c, d)){
            return Math.max(a, b);
        }
        return Math.max(c, d);
    }
}
