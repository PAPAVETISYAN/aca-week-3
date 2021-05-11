package day12;

public class Square {
    public static void main(String[]args){
        int radius = 4;
        float a = 4,b = 5;
        System.out.println(square(radius));
        System.out.println(square(a));
        System.out.println(square(a, b));
    }
    public static float square(int radius){
        float s = (float) (Math.PI * radius * radius);
        return s;
    }
    public static float square(float side){
        return side * side;
    }
    public static float square(float side1, float side2){
        return side1 * side2;
    }
}
