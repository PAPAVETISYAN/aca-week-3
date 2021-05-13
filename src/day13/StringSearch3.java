package day13;

public class StringSearch3 {
    public static void main(String[]args){
        String str = "anun";
        char ch1 = 'e';
        char ch2 = 'u';
        System.out.println(stringChar(str, ch1));
        System.out.println(stringChar(str, ch2));
    }
    public static boolean stringChar(String str, char ch){
        boolean b = str.contains(ch + "");
        return b;
        /*for(int i = 0; i < str.length(); ++i){
            if(str.charAt(i) == ch){
                return true;
            }
        }
        return false;*/
    }
}
