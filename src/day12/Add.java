package day12;

public class Add {
    public static void main(String[]args){
        int number1 = 1, number2 = 2, number3 = 3;
        float number4 = 4;
        add(number1, number2);
        add(number1, number2, number3);
        add(number1, number4);
        add(number4, number3);
    }
    public static void add(int x, int y){
        System.out.println("This: " + 1);
    }
    public static void add(int x, int y, int z){
        System.out.println("This: " + 2);
    }
    public static void add(int x, float y){
        System.out.println("This: " + 3);
    }
    public static void add(float x, int y){
        System.out.println("This: " + 4);
    }
}
