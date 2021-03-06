package day14;

public class StringClean10 {
    public static void main(String[] args) {
        String text = "Vvvallodv";
        System.out.println(stringClean(text));
    }
    public static String stringClean(String str){
        if(str.length() <= 1){
            return str;
        }
        if(str.charAt(0) == str.charAt(1)){
            return stringClean(str.substring(1));
        }
        return str.charAt(0) + stringClean(str.substring(1));
    }
}