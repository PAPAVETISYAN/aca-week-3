package day12;

public class Reverse {
    public static void main(String[] args) {
        double[] array = {-1, -2, -3, -8, -1};
        double[][] matrix ={{1, 2, 3}, {3, 8, 4}};
        double[]arr = reverse(array);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < matrix.length; ++i) {
            System.out.print(reverse(matrix)[i] + " ");
        }
    }

    public static double[] reverse(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= -1;
        }
        return array;
    }

    public static double[] reverse(double[][] matrix) {
        double array[] = new double[matrix.length];
        for (int i = 0; i < matrix.length; ++i) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; ++j) {
                sum += matrix[i][j];
            }
            array[i] = sum / (double)matrix[i].length;
        }
        return array;
    }
}