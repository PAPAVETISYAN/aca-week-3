package day12;

import java.util.Scanner;

public class FahrenheitCelsius {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Celsius=");
        float celsius = scanner.nextFloat();
        System.out.println("integer enter 1 or double enter 2");
        int i = scanner.nextInt();
        if(i == 1){
            System.out.println(fahrenheitCelsius(celsius, i));
        }else if (i == 2){
            System.out.println(fahrenheitCelsius(i, celsius));
        }else{
            System.out.println("invalid integer");
        }

    }
    public static int fahrenheitCelsius(float celsius, int choice){
            return (int) ((5 / 9) * (celsius - 32));
    }
    public static double fahrenheitCelsius(int choice, float celsius){
        return  (5.0 / 9.0) *  (celsius - 32);
    }
}
