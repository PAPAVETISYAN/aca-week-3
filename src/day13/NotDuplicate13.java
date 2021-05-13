package day13;

import java.util.Scanner;

public class NotDuplicate13 {
    public static void main(String[]args){
        System.out.print("Enter a hex string: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char ch = notDuplicate(text);
        System.out.println(ch);
    }
    public static char notDuplicate(String str){
        for (int i = 0; i< str.length(); ++i){
            int count = 0;
            for (int j = 0; j < str.length(); ++j){
                if(i == j){
                    continue;
                }
                if(str.charAt(i) == str.charAt(j)){
                    ++count;
                    break;
                }
            }
            if(count == 0){
                return str.charAt(i);
            }
        }
        return 0;
    }
}