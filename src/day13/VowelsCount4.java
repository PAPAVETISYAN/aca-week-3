package day13;

public class VowelsCount4 {
    public static void main(String[]args){
        String str = "Anun Azganun";
        System.out.println(count(str));
        System.out.println(count(str,count(str)));
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
    public static int count(String str, int countVowel){
        int countConsonant = 0;
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90 || str.charAt(i) >= 97 && str.charAt(i) <= 122){
                ++countConsonant;
            }
        }
        return countConsonant - countVowel;
    }
}
