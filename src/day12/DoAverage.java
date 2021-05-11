package day12;

public class DoAverage {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[][] matrix = {{1, 2}, {4, 5}, {7, 8}};
        System.out.println(matrix.length);
        System.out.println(matrix[matrix.length-1].length);
        System.out.println(average(array));
        System.out.println(average(matrix));
    }

    public static double average(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; ++i) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static double average(int[][] matrix) {
        double sum = 0;
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                sum += matrix[i][j];
            }
        }
        return sum / (matrix.length * matrix[matrix.length-1].length);
    }
}