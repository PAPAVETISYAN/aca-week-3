package day12;

public class IntFloatDouble {
    public static void main(String[]args){
        int [] arr ={1, 2, 3};
        float [] array = {1, 2, 3};
        double [] array1 = {1, 2, 3};
        print(arr);
        System.out.println();
        print(array);
        System.out.println();
        print(array1);
    }
    public static void print(int [] array){
        System.out.print(array[0]);
        for(int i = 1; i < array.length; ++i){
            System.out.print("," + array[i]);
        }
    }
    public static void print(float [] array){
        System.out.print(array[0]);
        for(int i = 1; i < array.length; ++i){
            System.out.print("," + array[i]);
        }
    }
    public static void print(double [] array){
        System.out.print(array[0]);
        for(int i = 1; i < array.length; ++i){
            System.out.print("," + array[i]);
        }
    }
}
