import java.util.*;

public class prac{
    public static String compression(String s){
        int count = 1;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
            }else if(s.charAt(i) != s.charAt(i-1)){
                count = 1;
               if (s.chatAt(i) == s.charAt(i+1)){
                count++;
               }
               


            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "aaabbbbcccc";
    }
}