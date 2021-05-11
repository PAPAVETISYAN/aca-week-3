package day12;

public class Search {
    public static void main(String[]args){
        int[]array = {1, 2, 3, 4, 5};
        int index = 3;
        int a = 2;
        System.out.println(search(array));
        System.out.println(search(array, a));
        System.out.println(search(array, a, index));
    }
    public static int search(int[ ] array){
        return array.length;
    }
    public static int search(int[ ] array, int a){
        for(int i = 0; i < array.length; ++i){
            if(array[i] == a){
                return i;
            }
        }
        return -1;
    }
    public static boolean search(int[] array, int argument, int index){
        if(array[index] == argument){
            return true;
        }
        return false;
    }
}
