package day12;

public class FloatInt {
    public static void main(String[] args) {
        int x = 10, y = 4;
        float z = 4;
        int a = func(x, y);
        float b = func(z, x);
        System.out.println(a);
        System.out.println(b);
    }

    public static int func(int number, int number1) {
        return number + number1;
    }

    public static float func(float number, int number1) {
        return number / number1;
    }
}
