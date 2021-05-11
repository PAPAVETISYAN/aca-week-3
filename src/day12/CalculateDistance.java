package day12;

public class CalculateDistance {
    public static void main(String[]args){
        System.out.println(calculateDistance(3, 4));
        System.out.println(calculateDistance(4, 5, 6, 7));
    }
    public static double calculateDistance(int x, int y){
        return Math.sqrt(Math.pow(x , 2) + Math.pow(y, 2));
    }
    public static double calculateDistance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
