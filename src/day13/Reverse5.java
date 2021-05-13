package day13;

public class Reverse5 {
    public static void main(String[]args){
        String str = "Name";
        reverse(str);
    }
    public static void  reverse(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());

    }
}
