package day13;

public class CountVowelsDigits6 {
    public static void main(String[]args){
        String str = "testing12345";
        int vowel = count(str);
        double countVowel = (double)vowel * 100 / str.length();
        int vowelInt = (int)(countVowel * 100);
        countVowel = (double) vowelInt / 100;
        int number = count1(str);
        double countNumber = (double)number * 100 / str.length();
        int countInt = (int)(countNumber * 100);
        countNumber = (double)countInt / 100;
        System.out.println("Number of vowels:" + vowel + " " + countVowel);
        System.out.println("Number of digits:" + number + " " + countNumber);
    }
    public static int count(String str){
        int countVowel = 0;
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90 || str.charAt(i) >= 97 && str.charAt(i) <= 122){
                if (str.charAt(i) == 97 || str.charAt(i) == 101 - 32 ||str.charAt(i) == 105 - 32 ||str.charAt(i) == 111 - 32 ||str.charAt(i) == 117 - 32 || str.charAt(i) == 121 - 32 ||str.charAt(i) == 97 -32 || str.charAt(i) == 101 ||str.charAt(i) == 105 ||str.charAt(i) == 111 ||str.charAt(i) == 117 || str.charAt(i) == 121){
                    ++countVowel;
                }
            }
        }
        return countVowel;
    }
    public static int count1(String str){
        int countInt = 0;
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57){
                  ++countInt;
            }
        }
        return countInt;
    }
}
