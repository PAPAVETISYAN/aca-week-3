package day13;

public class strIndex2 {
    public static void main(String[]args){
        String str = "Avetisyan";
        int index = 3;
        System.out.println(strIndex(str, index));
    }
    public static char strIndex(String str,int index){
        return str.charAt(index);
    }
}
